package model;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
//import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSelectShape extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public FrmSelectShape() {
		setResizable(false);
		setTitle("Select Shape");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 238, 119);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCircle = new JButton("CIRCLE");
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmAddCircle frmAddCircle = new FrmAddCircle();
				frmAddCircle.setVisible(true);
				dispose();
			}
		});
		btnCircle.setBounds(10, 27, 89, 23);
		contentPane.add(btnCircle);
		
		JButton btnRectangle = new JButton("RECTANGLE");
		btnRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrmAddRectangle frmAddRectangle = new FrmAddRectangle();
				frmAddRectangle.setVisible(true);
				dispose();
			}
		});
		btnRectangle.setBounds(109, 27, 102, 23);
		contentPane.add(btnRectangle);
	}
}