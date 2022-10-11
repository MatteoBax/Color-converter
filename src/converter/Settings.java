package converter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Properties;

public class Settings {
	//Global variables
	FileInputStream in;
	FileOutputStream out;
	Properties p;
	//ArrayList<String> settings = new ArrayList<String>();
	String lang, title, btnText, hexText;
	public void getSettings() {
		try {
			//Load settings.properties
			this.p = new Properties();
			this.in = new FileInputStream("rsc/settings.properties");
			this.p.load(in);
			this.lang = p.getProperty("language");
			this.title = p.getProperty("title."+lang);
			this.btnText = p.getProperty("btnText."+lang);
			this.hexText = p.getProperty("hexText."+lang);
			this.in.close();

		}catch(Exception e) {
			System.out.println("Non trovo il file specificato");
		}
		
	}
	public void saveSettings(String name, String value) {
		try {
			this.out = new FileOutputStream("rsc/settings.properties");
			this.p.setProperty(name, value);
			this.p.store(out, null);
			this.out.close();
		}catch(Exception e) {
			System.out.println("Non trovo il file specificato");
		}
	}

}
