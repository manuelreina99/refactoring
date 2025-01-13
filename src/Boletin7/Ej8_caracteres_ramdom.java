package Boletin7;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class Ej8_caracteres_ramdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		
		        
		
		        char[] tabla = new char[20];
		        
		        
		        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
		        
		        int[] frecuencias = new int[5]; 

		        
		        Random random = new Random();

		       
		        for (int i = 0; i < tabla.length; i++) {
		        	
		            tabla[i] = vocales[random.nextInt(vocales.length)];
		        }
		        
		        for( char a : tabla) {
		        	System.out.print(a+ " " );
		        	
		        }
		        
		        for(int i=0; i< tabla.length; i++ ) {
		        	
		        	if (tabla[i]== 'a') {
		        		
		        		frecuencias[0]++;
						
					}else if (tabla[i]=='e') {
						
		        		frecuencias[1]++;
		        		
					}else if (tabla[i]=='i') {
						
		        		frecuencias[2]++;
		        		
					}else if (tabla[i]=='o') {						
		        		frecuencias[3]++;
		        		
					}else if (tabla[i]=='u') {
						
		        		frecuencias[4]++;
		        		
					}
		        	
		        }
 
		        System.out.println("\n Frecuencia de cada vocal:");
		        System.out.println("a: " + frecuencias[0]);
		        System.out.println("e: " + frecuencias[1]);
		        System.out.println("i: " + frecuencias[2]);
		        System.out.println("o: " + frecuencias[3]);
		        System.out.println("u: " + frecuencias[4]);
		    }
	}

		




