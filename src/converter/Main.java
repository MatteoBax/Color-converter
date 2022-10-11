package converter;
public class Main {
	public static void main(String args[]) {
		Gui gui = new Gui();
		gui.createAndshowGUI();
		Settings settings = new Settings();
		settings.getSettings();
		settings.saveSettings("language", "us");
		/*SettingsGui sg = new SettingsGui();
		sg.ListExample();*/
		
	}
}
