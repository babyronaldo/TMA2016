import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FrameVer01 extends JFrame
{
	private JLabel stausLabel;
	private DrawPanel panel;

	private JButton undo;
	private JButton redo;
	private JButton clear;

	private JComboBox colors;

	private String colorOptions[] = { "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
			"Orange", "Pink", "Red", "White", "Yellow" };

	private Color colorArray[] = { Color.BLACK, Color.BLUE, Color.CYAN, Color.darkGray, Color.GRAY, Color.GREEN,
			Color.lightGray, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW };

	private JComboBox shapes;

	private String shapeOptions[] = { "Line", "Rectangle", "Oval" };

	private JCheckBox filled;

	private JPanel widgetJPanel;
	private JPanel widgetPadder;
	private JButton btnCircle;

	private JCheckBox ckbRectangle;
	private JCheckBox ckbCircle;

	public FrameVer01()
	{
		super("Test"); // sets the name of DrawFrame

		JLabel statusLabel = new JLabel("");

		panel = new DrawPanel(statusLabel);

		// create buttons
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		clear = new JButton("Clear");

		shapes = new JComboBox(shapeOptions);

		filled = new JCheckBox("Filled");

		widgetJPanel = new JPanel();
		widgetJPanel.setLayout(new GridLayout(1, 6, 10, 10));

		widgetPadder = new JPanel();
		widgetPadder.setLayout(new FlowLayout(FlowLayout.LEADING, 20, 5)); // sets
																			// padding
																			// around
																			// the
																			// edges

		// add widgets to widgetJPanel
		widgetJPanel.add(undo);
		widgetJPanel.add(redo);
		widgetJPanel.add(clear);
		// widgetJPanel.add( colors );
		widgetJPanel.add(shapes);
		widgetJPanel.add(filled);
		// add widgetJPanel to widgetPadder
		widgetPadder.add(widgetJPanel);

		// add widgetPadder and panel to JFrame
		getContentPane().add(widgetPadder, BorderLayout.NORTH);

		ckbRectangle = new JCheckBox("Rectangle");
		widgetPadder.add(ckbRectangle);

		ckbCircle = new JCheckBox("Circle");
		widgetPadder.add(ckbCircle);
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// create new ButtonHandler for button event handling
		ButtonHandler buttonHandler = new ButtonHandler();
		undo.addActionListener(buttonHandler);
		redo.addActionListener(buttonHandler);
		clear.addActionListener(buttonHandler);

		// create handlers for combobox and checkbox
		ItemListenerHandler handler = new ItemListenerHandler();
		// colors.addItemListener( handler );
		shapes.addItemListener(handler);
		filled.addItemListener(handler);
		ckbCircle.addItemListener(handler);
		ckbRectangle.addItemListener(handler);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 498);
		setResizable(false);
		setVisible(true);

	}

	private class ButtonHandler implements ActionListener
	{
		// handles button events
		public void actionPerformed(ActionEvent event)
		{
			if (event.getActionCommand().equals("Undo"))
			{
				panel.clearLastShape();
			} else if (event.getActionCommand().equals("Redo"))
			{
				panel.redoLastShape();
			} else if (event.getActionCommand().equals("Clear"))
			{
				panel.clearDrawing();
			}

		}
	}

	private class ItemListenerHandler implements ItemListener
	{
		public void itemStateChanged(ItemEvent event)
		{

			if (event.getSource() == filled)
			{
				boolean checkFill = filled.isSelected() ? true : false; //
				panel.setCurrentShapeFilled(checkFill);
			}
			if (ckbCircle.isSelected() == true && ckbRectangle.isSelected() == false)
			{

				panel.setCurrentShapeType(2);
			} else if (ckbRectangle.isSelected() == true && ckbCircle.isSelected() == false)
			{
				panel.setCurrentShapeType(1);
			} else
				panel.setCurrentShapeType(0);

			if (event.getStateChange() == ItemEvent.SELECTED)
			{

				if (event.getSource() == colors)
				{
					panel.setCurrentShapeColor(colorArray[colors.getSelectedIndex()]);
				}

				else if (event.getSource() == shapes)
				{
					panel.setCurrentShapeType(shapes.getSelectedIndex());
				}
			}

		}
	}

}