package simulation;


/**
 * @see simulation.SimKeyboard#IDLE_MODE
 */
public class IdleMode extends Mode {
	public int getMode() {
		return SimKeyboard.IDLE_MODE;
	}

	public void digitKeyPressed(int digit, SimKeyboard simKeyboard) {
	}
	
	public void enterKeyPressed(SimKeyboard simKeyboard){
	}
	
	public void clearKeyPressed(SimKeyboard simKeyboard){
	}
	
	public void cancelKeyPressed(SimKeyboard simKeyboard){
		// It is possible to press the cancel key when requested
        // to insert an envelope - so notify the envelope acceptor
        // of this fact (notification is ignored if acceptor is
        // not waiting for an envelope)
        synchronized(simKeyboard.getEnvelopeAcceptor())
        {
        	simKeyboard.getEnvelopeAcceptor().notify();
        }
	}
}