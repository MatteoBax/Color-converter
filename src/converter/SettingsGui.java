package converter;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.WindowConstants;


public class SettingsGui {
	public void ListExample(){  
        JFrame f= new JFrame();
        JButton button = new JButton("Annulla");
        JButton button1 = new JButton("Salva");
        button.setBounds(10, 85, 80, 30);
        button1.setBounds(100, 85, 80, 30);
        DefaultListModel<String> l1 = new DefaultListModel<>();  
	    l1.addElement("Italiano");  
	    l1.addElement("English");  
	    l1.addElement("Deutsch");   
	    JList<String> list = new JList<>(l1);  
	    list.setBounds(65,10, 50,55);  
	    f.add(list);
	    f.add(button);
	    f.add(button1);
	    f.setSize(205,170);
	    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
}
