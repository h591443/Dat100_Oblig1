package Oblig1;
 import static java.lang.Math.*;  
 import static javax.swing.JOptionPane.*; 
 
public class O3 {

	public static void main(String[] args) { 
		
		String heltalltxt = showInputDialog("Gi en verdi:"); 
		int heltall = Integer.parseInt(heltalltxt); 
		
		int i = 1;  
		int n = 1; 
		int f = 1; 
		
		if (n < 0) {
			System.out.println("ugyldig verdi, tallet må være større enn null");
		}
		else  {
			for (i = 1; i <= heltall; i++) 
				f = f * i ;
				
				System.out.println("fakultetet av: " + heltall + " er: " + f); 
		}

	}

}
