package Boletin7;

import java.util.Arrays;
import java.util.Scanner;



public class Ej14_esRepetido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		


		    
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Introduce el tamaño: ");
		        int n = scanner.nextInt();

		       
		        int[] tabla = new int[n];
		        System.out.println("Introduce los " + n + " elementos:");
		        for (int i = 0; i < n; i++) {
		            tabla[i] = scanner.nextInt();
		        }

		      
		        int[] temporal = new int[n];
		        int tamaño = 0;

		       
		        for (int i = 0; i < n; i++) {
		            boolean esRepetido = false;

		           
		            for (int j = 0; j < tamaño; j++) {
		                if (tabla[i] == temporal[j]) {
		                    esRepetido = true;
		                    break;
		                }
		            }

		            
		            if (!esRepetido) {
		                temporal[tamaño++] = tabla[i];
		            }
		        }

		       
		        int[] resultado = new int[tamaño];
		        for (int i = 0; i < tamaño; i++) {
		            resultado[i] = temporal[i];
		        }

		        
		        for(int a: resultado) {
		        	
		        	System.out.println(a);
		        }
		        
		        scanner.close();
		    }
		



		
	}


