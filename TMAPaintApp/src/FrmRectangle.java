//package model;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import Circle;
//import ShapeFactory;
//import view.Rectangle;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmRectangle extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtWidth;
	private JLabel lblHeight;
	private JTextField txtHeight;

//	/**
//	 * Launch the application.
//	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					FrmAddCircle frame = new FrmAddCircle();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public FrmRectangle() {
		setResizable(false);
		setTitle("Add Rectangle Shape");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 267, 193);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(43, 12, 46, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(43, 37, 46, 14);
		contentPane.add(lblY);
		
		txtX = new JTextField();
		txtX.setBounds(126, 9, 86, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setBounds(126, 34, 86, 20);
		contentPane.add(txtY);
		txtY.setColumns(10);
		
		JLabel lblWidth = new JLabel("Width");
		lblWidth.setBounds(43, 62, 46, 14);
		contentPane.add(lblWidth);
		
		txtWidth = new JTextField();
		txtWidth.setBounds(126, 60, 86, 20);
		contentPane.add(txtWidth);
		txtWidth.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtX.getText());
				int y = Integer.parseInt(txtY.getText());
				int width = Integer.parseInt(txtWidth.getText());
				int height = Integer.parseInt(txtHeight.getText());
				Rectangle rectangle = (Rectangle) ShapeFactory.getShape("RECTANGLE");
				rectangle.setX(x);
				rectangle.setWidth(width);
				rectangle.setY(y);
				rectangle.setHeight(height);
				FrmPaint.getLstRectangle().add(rectangle);
				FrmPaint.loadRectangle();
				dispose();
			}
		});
		btnAdd.setBounds(77, 120, 89, 23);
		contentPane.add(btnAdd);
		
		lblHeight = new JLabel("Height");
		lblHeight.setBounds(43, 89, 46, 14);
		contentPane.add(lblHeight);
		
		txtHeight = new JTextField();
		txtHeight.setColumns(10);
		txtHeight.setBounds(126, 87, 86, 20);
		contentPane.add(txtHeight);
	}
}