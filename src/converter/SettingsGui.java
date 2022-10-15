package converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class SettingsGui {
	int n;
	JFrame f;
	public void selectLanguage(){
		Gui.settings.getSettings();
        f= new JFrame();
        JButton button = new JButton(Gui.settings.btnTextCnc);
        JButton button1 = new JButton(Gui.settings.btnTextSv);
        button.setBounds(10, 85, 80, 30);
        button1.setBounds(100, 85, 80, 30);
        DefaultListModel<String> l1 = new DefaultListModel<>();  
	    l1.addElement("Italiano");  
	    l1.addElement("English");  
	    l1.addElement("Deutsch");  
	    
	    JList<String> list = new JList<>(l1);
	    list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    
	    //Button cancel action listner
	    button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				
			}
	    	
	    });
	    //Button save action listner
	    button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (n >= 0) {
                	if(n==0) {
                		Gui.settings.saveSettings("language", "it");
                	}else {
                		if (n==1) {
                			Gui.settings.saveSettings("language", "us");
	                    }else {
	                    	if(n==2) {
	                    		Gui.settings.saveSettings("language", "de");
	                    	}
	                    }
                	}
                	ProcessBuilder pb = new ProcessBuilder(System.getProperty("user.dir") + "\\converter.exe");
                	try {
						pb.start();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
                	System.exit(0);
                }
			}
	    	
	    });
	    //Action Listner list
	    list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (e.getValueIsAdjusting() == false) {
	                n = list.getSelectedIndex();
	            }
				
			}
	    });
	    
	    list.setBounds(65,10, 50,55);  
	    f.add(list);
	    f.add(button);
	    f.add(button1);
	    f.setSize(205,170);
	    
	    if(Gui.settings.lang.equals("it")) {
	    	list.setSelectedIndex(0);
	    }
	    if(Gui.settings.lang.equals("us")) {
	    	list.setSelectedIndex(1);
	    }
	    if(Gui.settings.lang.equals("de")){
	    	list.setSelectedIndex(2);
	    }
	    
	    f.setLayout(null);  
	    f.setVisible(true);  
	}  
}
