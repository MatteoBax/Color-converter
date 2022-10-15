package converter;

public class MaxLengthText {
	static int R, G, B;
	public static void maxLength() throws InterruptedException {
		
		while (true) {
			//Gui gui = new Gui();
			//Get text length
			try {
				String r = Main.gui.R.getText();
				String g = Main.gui.G.getText();
				String b = Main.gui.B.getText();
				
				if(!r.isEmpty() && !g.isEmpty() && !b.isEmpty()) {
					R = Integer.parseInt(r);
					G = Integer.parseInt(g);
					B = Integer.parseInt(b);
					
					if(R>255) {
						Main.gui.R.setText("255");
					}
					if(G>255) {
						Main.gui.G.setText("255");
					}
					if(B>255) {
						Main.gui.B.setText("255");
					}
				}
			}catch(NullPointerException e) {
				
			} catch(NumberFormatException e) {
				// Valori inseriti per R/G/B non validi
				
			}
			
			Thread.sleep(1000);
		}
	}
}