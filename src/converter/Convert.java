package converter;

public class Convert {
	public static String red;
	public static String green;
	public static String blue;
	public static void main(int R, int G, int B) {
		red = Integer.toHexString(R).toUpperCase();
		green = Integer.toHexString(G).toUpperCase();
		blue = Integer.toHexString(B).toUpperCase();
		if(red.length()<2) {
			red = addZero(red,red.length()+1);
		}
		if(green.length()<2) {
			green = addZero(green,green.length()+1);
		}
		if(blue.length()<2) {
			blue = addZero(blue,blue.length()+1);
		}
	}
	public static String addZero(String s, int len) {
		while(s.length()<len) {
			s="0"+s;
		}
		return s;
	}
}
