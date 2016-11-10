package model;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import view.Rectangle;
import view.Circle;
import view.Shape;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class FrmMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -367882766077705503L;

	private static DefaultTableModel circleTableModel = new DefaultTableModel(new String[] { "Position", "Radius" }, 0);
	private static DefaultTableModel rectangleTableModel = new DefaultTableModel(
			new String[] { "Position", "Width", "Height" }, 0);
	private JTable circleTable;
	private JTable rectangleTable;

	private static List<Circle> lstCircle = new ArrayList<Circle>();
	
 	private static List<Rectangle> lstRectangle = new ArrayList<Rectangle>();
 	
 	private static JPanel drawPanel = new JPanel();
 	private static JPanel contentPane;
 	private static Graphics graphic;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public FrmMain() {
		setResizable(false);
		setTitle("TMAPaint");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmSelectShape frmSelectShape = new FrmSelectShape();
				frmSelectShape.setVisible(true);
			}
		});

		btnAdd.setBounds(195, 15, 94, 23);
		contentPane.add(btnAdd);

		JButton btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((!lstCircle.isEmpty()) && (circleTable.getSelectedRow() != -1)) {
					lstCircle.remove(circleTable.getSelectedRow());
					loadCircle();
				}

				if ((!lstRectangle.isEmpty()) && (rectangleTable.getSelectedRow() != -1)) {
					lstRectangle.remove(rectangleTable.getSelectedRow());
					loadRectangle();
				}
			}
		});
		btnRemove.setBounds(299, 15, 89, 23);
		contentPane.add(btnRemove);

		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(398, 15, 89, 23);
		contentPane.add(btnUndo);

		JButton btnRedo = new JButton("Redo");
		btnRedo.setBounds(497, 15, 89, 23);
		contentPane.add(btnRedo);

		JButton btn2D = new JButton("2D");
		btn2D.setBounds(596, 15, 89, 23);
		contentPane.add(btn2D);

		JButton btn3D = new JButton("3D");
		btn3D.setBounds(695, 15, 89, 23);
		contentPane.add(btn3D);

		JScrollPane scrollPane_Circle = new JScrollPane();
		scrollPane_Circle.setBounds(10, 19, 168, 243);
		contentPane.add(scrollPane_Circle);

		circleTable = new JTable();
		circleTable.setModel(circleTableModel);
		scrollPane_Circle.setViewportView(circleTable);

		JScrollPane scrollPane_Rectangle = new JScrollPane();
		scrollPane_Rectangle.setBounds(10, 290, 168, 271);
		contentPane.add(scrollPane_Rectangle);

		rectangleTable = new JTable();
		rectangleTable.setModel(rectangleTableModel);
		scrollPane_Rectangle.setViewportView(rectangleTable);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 277, 168, 2);
		contentPane.add(separator);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(195, 49, 589, 512);
		contentPane.add(scrollPane);
		
		scrollPane.setViewportView(drawPanel);
		drawPanel.setLayout(null);
	}

	public static List<Circle> getLstCircle() {
		return lstCircle;
	}

	public static void setLstCircle(List<Circle> lstCircle) {
		FrmMain.lstCircle = lstCircle;
	}

	public static List<Rectangle> getLstRectangle() {
		return lstRectangle;
	}

	public static void setLstRectangle(List<Rectangle> lstRectangle) {
		FrmMain.lstRectangle = lstRectangle;
	}

	public static void loadCircle() {
		circleTableModel.setRowCount(0);
		if (!lstCircle.isEmpty()) {
			StringBuilder stringBuilder = null;
			for (Circle circle : lstCircle) {
				stringBuilder = new StringBuilder();
				stringBuilder.append("(");
				stringBuilder.append(String.valueOf(circle.getX()));
				stringBuilder.append(", ");
				stringBuilder.append(String.valueOf(circle.getY())); 
				stringBuilder.append(")");
				circleTableModel.addRow(new String[] { stringBuilder.toString(), String.valueOf(circle.getRadius()) });
			}
		}
	}
	
	public static void drawCircle(Circle circle){
 		drawPanel.add(circle);
		drawPanel.repaint();
	}

	public static void loadRectangle() {
		rectangleTableModel.setRowCount(0);
		if (!lstRectangle.isEmpty()) {
			StringBuilder stringBuilder = null;
			for (Rectangle rectangle : lstRectangle) {
				stringBuilder = new StringBuilder(); 
				stringBuilder.append("(");
				stringBuilder.append(String.valueOf(rectangle.getX()));
				stringBuilder.append(", ");
				stringBuilder.append(String.valueOf(rectangle.getY()));
				stringBuilder.append(")");
				rectangleTableModel.addRow(new String[] { stringBuilder.toString(),
						String.valueOf(rectangle.getWidth()), String.valueOf(rectangle.getHeight()) });
			}
		}
	}
}