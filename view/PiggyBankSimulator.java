package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import control.PBHistoryListener;
import control.PBInsertListener;
import control.PBStatsListener;
import model.Coin;
import model.PiggyBank;

public class PiggyBankSimulator {

	private JFrame window;
	JTextArea display = new JTextArea();
	private JRadioButton[] radioButtons;
	private JButton[] PBbuttons;
	private PiggyBank piggyBank = new PiggyBank();
	
	public PiggyBankSimulator(JFrame window) {
		this.window = window;
		window.setTitle("Piggy Bank Simulator");
	}

	public void init() {

		Container cp = window.getContentPane();
		
		var scrollPane = new JScrollPane(display, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setPreferredSize(new Dimension(500,500));

		cp.add(BorderLayout.CENTER, scrollPane);

		// radio buttons
		radioButtons = new JRadioButton[3];
		radioButtons[0] = new JRadioButton(Coin.NICKEL);
		radioButtons[0].setSelected(true);
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
		PBbuttons[0].addActionListener(new PBInsertListener(this));
		PBbuttons[1] = new JButton("History");
		PBbuttons[1].addActionListener(new PBHistoryListener(this));
		PBbuttons[2] = new JButton("Stats");
		PBbuttons[2].addActionListener(new PBStatsListener(this));
		PBbuttons[3] = new JButton("Exit");
		JPanel buttonPanel = new JPanel();
		for (var e: PBbuttons) {
			buttonPanel.add(e);
		}

		// south panel
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(2,1));
		southPanel.add(radioPanel);
		southPanel.add(buttonPanel);

		cp.add(BorderLayout.SOUTH, southPanel);
	}

	public JRadioButton[] getRadioButtons() {
		return radioButtons;
	}

	public PiggyBank getPiggyBank() {
		return piggyBank;
	}
	
	public JTextArea getDisplay() {
		return display;
	}
}
