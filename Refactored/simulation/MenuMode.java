package simulation;


/**
 * @see simulation.SimKeyboard#MENU_MODE
 */
public class MenuMode extends Mode {
	public int getMode() {
		return SimKeyboard.MENU_MODE;
	}

	public void digitKeyPressed(int digit, SimKeyboard simKeyboard) {
		if (digit > 0 && digit <= simKeyboard.getMaxValue()) {
			simKeyboard.getCurrentInput().append(digit);
			simKeyboard.notify();
		} else
			simKeyboard.getToolkit().beep();
	}
	
	public void enterKeyPressed(SimKeyboard simKeyboard){
		simKeyboard.getToolkit().beep();
	}
	
	public void clearKeyPressed(SimKeyboard simKeyboard){
		simKeyboard.getToolkit().beep();
	}
	
	public void cancelKeyPressed(SimKeyboard simKeyboard){
		simKeyboard.setCancelled(true);
		simKeyboard.notify();
	}
}