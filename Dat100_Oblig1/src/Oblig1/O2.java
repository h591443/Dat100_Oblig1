package Oblig1;
import static javax.swing.JOptionPane.*;  

public class O2 {
  
	public static void main(String[] args) {  
		 
		for (int i = 1; i < 11; i++) { 
			
		
			String karakterTxt = showInputDialog("Poeng?:"); 
			int karakter = Integer.parseInt(karakterTxt); 
			
			if (karakter <= 100 && karakter >= 90) {  
				System.out.println("karakteren din er: A");  
				}
			else if (karakter <= 89 && karakter >= 80) {  
				System.out.println("karakteren din er: B");  
			}	
			else if (karakter <= 79 && karakter >= 60) {  
				System.out.println("karakteren din er: C");  
			}	 
			else if (karakter <= 59 && karakter >= 50) {  
				System.out.println("karakteren din er: D");  
			}	
			else if (karakter <= 49 && karakter >= 40) {  
				System.out.println("karakteren din er: E");  
			}	 
			else if (karakter <= 39 && karakter >= 0) {  
				System.out.println("karakteren din er: F");  
			}	 
			else { 
				showMessageDialog(null, "ugyldig poengsum, prøv igjen"); 
				i --; 
			}
		
		}
	}
}
