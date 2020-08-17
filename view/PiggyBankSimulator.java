package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import model.Coin;

public class PiggyBankSimulator {

	private JFrame window;
	JTextArea display = new JTextArea();
	private JRadioButton[] radioButtons;
	private JButton[] PBbuttons;
	
	public PiggyBankSimulator(JFrame window) {
		this.window = window;
		window.setTitle("Piggy Bank Simulator");
	}

	public void init() {

		Container cp = window.getContentPane();
		
		var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500,500));

		// radio buttons
		radioButtons = new JRadioButton[3];
		radioButtons[0] = new JRadioButton(Coin.NICKEL);
		radioButtons[1] = new JRadioButton(Coin.DIME);
		radioButtons[2] = new JRadioButton(Coin.QUARTER);
		ButtonGroup radioGroup = new ButtonGroup();
		JPanel radioPanel = new JPanel();
		for (var e: radioButtons) {
			radioGroup.add(e);
			radioPanel.add(e);
		}

		// buttons
		PBbuttons = new JButton[4];
		PBbuttons[0] = new JButton("Insert");
		PBbuttons[1] = new JButton("History");
		PBbuttons[2] = new JButton("Stats");
		PBbuttons[3] = new JButton("Exit");

		// south panel
		JPanel southPanel = new JPanel();
		southPanel.add(radioPanel);

		cp.add(BorderLayout.CENTER, display);
		cp.add(BorderLayout.SOUTH, southPanel);
	}
	
}