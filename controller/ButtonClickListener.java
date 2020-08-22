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
		}
	}
}