package model;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import view.Circle;
import view.ShapeFactory;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmAddCircle extends JFrame {

	private JPanel contentPane;
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtRadius;

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
	public FrmAddCircle() {
		setResizable(false);
		setTitle("Add Circle Shape");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 244, 154);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(30, 11, 46, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y");
		lblY.setBounds(30, 36, 46, 14);
		contentPane.add(lblY);
		
		txtX = new JTextField();
		txtX.setBounds(113, 8, 86, 20);
		contentPane.add(txtX);
		txtX.setColumns(10);
		
		txtY = new JTextField();
		txtY.setBounds(113, 33, 86, 20);
		contentPane.add(txtY);
		txtY.setColumns(10);
		
		JLabel lblRadius = new JLabel("Radius");
		lblRadius.setBounds(30, 61, 46, 14);
		contentPane.add(lblRadius);
		
		txtRadius = new JTextField();
		txtRadius.setBounds(113, 59, 86, 20);
		contentPane.add(txtRadius);
		txtRadius.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(txtX.getText());
				int y = Integer.parseInt(txtY.getText());
				int radius = Integer.parseInt(txtRadius.getText());
				Circle circle = (Circle) ShapeFactory.getShape("CIRCLE");
				circle.setX(x);
				circle.setRadius(radius);
				circle.setY(y);
				FrmMain.drawCircle(circle);
				FrmMain.getLstCircle().add(circle);
				FrmMain.loadCircle();
				dispose();
			}
		});
		btnAdd.setBounds(71, 86, 89, 23);
		contentPane.add(btnAdd);
	}
}