package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MenuScreen {

	private JFrame window;

	public MenuScreen(JFrame window) {
		this.window = window;
		window.setTitle("Menu");
	}

	public void init () {

		Container cp = window.getContentPane();
		JPanel panel = new JPanel();

		JButton calcButton = new JButton("Calculator Simulator");

		JButton piggybankButton = new JButton("Piggy Bank Simulator");

		panel.setLayout(new GridLayout(2,1));
		panel.setPreferredSize(new Dimension(400, 200));
		panel.add(calcButton);
		panel.add(piggybankButton);
		cp.add(BorderLayout.CENTER, panel);
	}
	
}