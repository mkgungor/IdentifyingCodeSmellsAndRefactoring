package simulation;


/**
 * @see simulation.SimKeyboard#PIN_MODE
 */
public class PinMode extends Mode {
	public int getMode() {
		return SimKeyboard.PIN_MODE;
	}

	public void digitKeyPressed(int digit, SimKeyboard simKeyboard) {
		simKeyboard.getCurrentInput().append(digit);
		StringBuffer echoString = new StringBuffer();
		for (int i = 0; i < simKeyboard.getCurrentInput().length(); i++)
			echoString.append('*');
		simKeyboard.setEcho(echoString.toString());
	}
	
	public void enterKeyPressed(SimKeyboard simKeyboard){
		if (simKeyboard.getCurrentInput().length() > 0)
			simKeyboard.notify();
        else
        	simKeyboard.getToolkit().beep();
	}
	
	public void clearKeyPressed(SimKeyboard simKeyboard){
		simKeyboard.getCurrentInput().setLength(0);
		simKeyboard.setEcho("");
	}
	
	public void cancelKeyPressed(SimKeyboard simKeyboard){
		// It is possible to press the cancel key when requested
        // to insert an envelope - so notify the envelope acceptor
        // of this fact (notification is ignored if acceptor is
        // not waiting for an envelope)
		simKeyboard.setCancelled(true);
		simKeyboard.notify();
	}
}