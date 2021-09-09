package Oblig1;
import static javax.swing.JOptionPane.*; 

public class O1 {

	public static void main(String[] args) { 
		
		String Lon = showInputDialog("lønn?:"); 
		int Lonn = Integer.parseInt(Lon); 
		
		double skatt1 = 0; 
		double skatt2 = 0.0093;    
		double skatt3 = 0.0241; 
		double skatt4 = 0.1152; 
		double skatt5 = 0.1452;   
		
		double skatt = 0; 
		
		if (Lonn <= 164100) { 
			skatt = skatt1 * Lonn; 
		}  
		else if (Lonn <= 230950) {  
			skatt = skatt2 * Lonn; 
		}  
		else if (Lonn <= 580650) {  
			skatt = skatt3 * Lonn; 
		}  
		else if (Lonn <= 934050) {  
			skatt = skatt4 * Lonn; 
		}  
		else if (Lonn >= 934050) {  
			skatt = skatt5 * Lonn; 
		} 
		System.out.println("skatten er:"+skatt); 
		} 
		
	} 

