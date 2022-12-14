package converter;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui implements ActionListener{ 
	//Global variables
	JTextField R,G,B,output; 
	JLabel T1, T2, T3, T4, languageSett;
    JButton Button;
    String hex, result, r, g, b;
    int sR, sG, sB;
    static Settings settings;
	void createAndshowGUI(){
		settings = new Settings();
		settings.getSettings();
		String title = settings.title;
		String btnText = settings.btnText;
		String hexText = settings.hexText;
		
		JFrame f= new JFrame(title); 
		this.languageSett = new JLabel(new ImageIcon(System.getProperty("user.dir") + "\\rsc\\translate.png"));
		this.languageSett.setBounds(350, 30, 20, 20);
	    Button = new JButton(btnText);
	    Button.setBounds(135,200,120,30);
	    Button.addActionListener(this);
	    
	    //Red
	    this.T1=new JLabel("R");
	    this.T1.setBounds(120,70, 60,30);
	    this.T1.setForeground(Color.RED);
	    
	    this.R=new JTextField("");  
	    this.R.setBounds(95,100, 60,30);
	    
	    //Green
	    this.T2=new JLabel("G");
	    this.T2.setBounds(190,70, 60,30);
	    this.T2.setForeground(Color.GREEN);
	    
	    this.G=new JTextField("");  
	    this.G.setBounds(165,100, 60,30); 
	    
	    //Blue
	    this.T3=new JLabel("B");
	    this.T3.setBounds(260,70, 60,30);
	    this.T3.setForeground(Color.BLUE);
	    
	    this.B=new JTextField("");  
	    this.B.setBounds(235,100, 60,30);
	    
	    //Hex
	    this.T4=new JLabel(hexText);
	    this.T4.setBounds(155,125, 100,30);
	    this.T4.setForeground(Color.BLACK);
	    
	    output=new JTextField("");  
	    output.setBounds(165,150, 60,30);
	    output.setEditable(false); 
	    
	    
	    f.add(this.T1);
	    f.add(this.T2);
	    f.add(this.T3);
	    f.add(this.T4);
	    f.add(this.R); 
	    f.add(this.G); 
	    f.add(this.B);
	    f.add(output);
	    f.add(Button);
	    f.add(this.languageSett);
	    f.setSize(400,400); 
	    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    f.setLayout(null);  
	    f.setVisible(true);
	    
	    
	    
	    languageSett.addMouseListener(new MouseAdapter() {
	    	@Override
            public void mouseClicked(MouseEvent e) {
	    		SettingsGui sg = new SettingsGui();
	    		sg.selectLanguage();
            }
	    });
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Convert to hex
		try {
			this.r=R.getText();  
	        this.g=G.getText();
	        this.b = B.getText();
	        this.sR=Integer.parseInt(r);  
	        this.sG=Integer.parseInt(g); 
	        this.sB=Integer.parseInt(b);
	        if(e.getSource()==Button){  
	            Convert.main(this.sR, this.sG, this.sB);
	            hex="#"+ Convert.red + Convert.green + Convert.blue;
	        }
	        String result=String.valueOf(hex);  
	        output.setText(result);  
		}catch(Exception ea) {
		}
        
	}
 }  