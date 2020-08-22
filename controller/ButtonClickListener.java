package controller;

import view.CalcSimulator;
import view.MenuScreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class ButtonClickListener implements ActionListener {

	private CalcSimulator panel;

	public ButtonClickListener(CalcSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		var button = e.getSource(); // button clicked

		//save existing display messages
		String m = panel.getDisplay().getText() + "\n";

		// each button does something different
		if (button == panel.getExitButton()) {
			// erase all contents
			System.out.println("exit");
			JFrame window = panel.getWindow();
			window.getContentPane().removeAll();
			// show menu
			var menu = new MenuScreen(window);
			menu.init();
			window.pack();
			window.revalidate();
		} else if (button == panel.getEnterButton()) {
			// only accept numbers
			try {
				double value 
					= Double.parseDouble(panel.getNumField().getText());
				// enter into calc
				panel.getCalculator().enter(value);
				// display number
				panel.getDisplay().setText(m + value
					+ " Entered");
					// make numField blank
				panel.getNumField().setText("");
			} catch (NumberFormatException excecpt) {
				// say num  is invalid
				panel.getDisplay().setText(m 
					+ panel.getNumField().getText() 
					+ " : Invalid number.");
				// reset numField
				panel.getNumField().setText("");
			}
		} else if (button == panel.getResultButton()) {
			panel.getDisplay().setText(m + "Result = "
				+ panel.getCalculator().getResult());
		} else if (button == panel.getSubButton()) {
			// sum, but don't display
			panel.getCalculator().subtract();
			panel.getDisplay().setText(m + "Subtract operation "
				+ "performed");
		} else if (button == panel.getMulButton()) {
			// sum, but don't display
			panel.getCalculator().multiply();
			panel.getDisplay().setText(m + "Multiply operation "
				+ "performed");
		} else if (button == panel.getDivButton()) {
			// sum, but don't display
			panel.getCalculator().divide();
			panel.getDisplay().setText(m + "Divide operation "
				+ "performed");
		} else if (button == panel.getAddButton()) {
			// sum, but don't display
			panel.getCalculator().add();
			panel.getDisplay().setText(m + "Add operation "
				+ "performed");
		}
	}
}