package simulation;

public abstract class Mode {
	public abstract int getMode();

	public abstract void digitKeyPressed(int digit, SimKeyboard simKeyboard);

	public abstract void enterKeyPressed(SimKeyboard simKeyboard);
	
	public abstract void clearKeyPressed(SimKeyboard simKeyboard);
	
	public abstract void cancelKeyPressed(SimKeyboard simKeyboard);

}