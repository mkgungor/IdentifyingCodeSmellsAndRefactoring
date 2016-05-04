package simulation;


/**
 * @see simulation.SimKeyboard#AMOUNT_MODE
 */
public class AmountMode extends Mode {
	public int getMode() {
		return SimKeyboard.AMOUNT_MODE;
	}

	public void digitKeyPressed(int digit, SimKeyboard simKeyboard) {
		simKeyboard.getCurrentInput().append(digit);
		String input = simKeyboard.getCurrentInput().toString();
		if (input.length() == 1)
			simKeyboard.setEcho("0.0" + input);
		else if (input.length() == 2)
			simKeyboard.setEcho("0." + input);
		else
			simKeyboard.setEcho(input.substring(0, input.length() - 2) + "."
					+ input.substring(input.length() - 2));
	}
	
	public void enterKeyPressed(SimKeyboard simKeyboard){
		if (simKeyboard.getCurrentInput().length() > 0)
			simKeyboard.notify();
        else
        	simKeyboard.getToolkit().beep();
	}
	
	public void clearKeyPressed(SimKeyboard simKeyboard){
		simKeyboard.getCurrentInput().setLength(0);
		simKeyboard.setEcho("0.00");
	}
	
	public void cancelKeyPressed(SimKeyboard simKeyboard){
		simKeyboard.setCancelled(true);
		simKeyboard.notify();
	}
}