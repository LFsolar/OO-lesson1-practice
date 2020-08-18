package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CalcSimulator {

	private JFrame window;
	private JTextArea display = new JTextArea();
	private JTextField numField = new JTextField(10);
	private JButton enterButton = new JButton("Enter");
	private JButton addButton = new JButton("+");
	private JButton subButton = new JButton("-");
	private JButton mulButton = new JButton("*");
	private JButton divButton = new JButton("/");
	private JButton resultButton = new JButton("Result");
	private JButton exitButton = new JButton("Exit");

	
	public CalcSimulator(JFrame window) {
		this.window = window;
	}

	public void init() {
		Container cp = window.getContentPane();
		var scrollPane = new JScrollPane(display, 
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500, 500));
		cp.add(BorderLayout.CENTER, scrollPane);

		// 1st row
		JPanel row1 = new JPanel();
		row1.add(numField);
		row1.add(enterButton);

		// 2nd row
		JPanel row2 = new JPanel();
		row2.add(addButton);
		row2.add(subButton);
		row2.add(mulButton);
		row2.add(divButton);

		// 3rd row
		JPanel row3 = new JPanel();
		row3.add(resultButton);
		row3.add(exitButton);

		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(3, 1));
		southPanel.add(row1);
		southPanel.add(row2);
		southPanel.add(row3);
		cp.add(BorderLayout.SOUTH, southPanel);
	}
}