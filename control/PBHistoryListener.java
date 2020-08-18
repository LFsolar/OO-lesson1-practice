package control;

import view.PiggyBankSimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Coin;

public class PBHistoryListener implements ActionListener {

	private PiggyBankSimulator panel;

	// instead of continuously accessing external panel, make own panel
	public PBHistoryListener(PiggyBankSimulator panel) {
		this.panel = panel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ArrayList<Coin> history 
			= panel.getPiggyBank().getCoinHistory();
		int index = 0;
		String existingMessage 
			= panel.getDisplay().getText();
		String m = "";
		if (history.size() > 0) {
			// make list
			for (var coin: history) {
				m += ++index + ". " + coin + "\n";
			}
			panel.getDisplay().setText(existingMessage
				+ "\nCoin Insert History\n" + m);
		} else {
			panel.getDisplay().setText(existingMessage
				+ "\nNo Coin History");
		}
	}
}