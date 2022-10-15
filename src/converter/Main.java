package converter;
public class Main {
	static Gui gui;
	
	public static void main(String args[]) throws InterruptedException{
		gui = new Gui();
		gui.createAndshowGUI();
		MaxLengthText.maxLength();
	}
}
