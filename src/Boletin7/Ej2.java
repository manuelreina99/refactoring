package Boletin7;

import java.util.Iterator;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int[] myList= new int[100];
		int[] res= new int[100];
		
		for (int i = 0; i < myList.length; i++) {
		
		 myList[i] = i;
		 
		}
		int contador=0;
		for (int i = 0; i < myList.length; i++) {
			
			
			
				
				if (esPrimo(i)) {
						contador++;
						res[i]=i;
						System.out.println(i);
					}
			
				
				}
		
		
		
		
		
//		for(int a : res) {
//			System.out.println(a);
//		}
				
							
			
			
			
		
	}	
		
	
	
	public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }

}
