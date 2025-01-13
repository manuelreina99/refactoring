package Boletin7;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13_unirarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		        Scanner scanner = new Scanner(System.in);

		        
		        System.out.print("Introduce la cantidad de números para la primera tabla (n): ");
		        int n = scanner.nextInt();
		        int[] tabla1 = new int[n];
		        
		        System.out.println("Introduce los " + n + " números para la primera tabla:");
		        for (int i = 0; i < n; i++) {
		            tabla1[i] = scanner.nextInt();
		        }

		        
		        System.out.print("Introduce la cantidad de números para la segunda tabla (m): ");
		        int m = scanner.nextInt();
		        int[] tabla2 = new int[m];
		        
		        System.out.println("Introduce los " + m + " números para la segunda tabla:");
		        for (int i = 0; i < m; i++) {
		            tabla2[i] = scanner.nextInt();
		        }

		        
		        Arrays.sort(tabla1);
		        Arrays.sort(tabla2);

		        
		        //unir dos arrays
		        
		        int[] res= new int[n+m];
				
				
				for(int i =0; i<n; i++) {
					
					res[i]= tabla1[i];
				}
				
				for(int i =0 ; i<m; i++) {
					
					res[ i+ n]= tabla2[i];
				}
		        
		        
		        
		        Arrays.sort(res);
		        
		        
		        
		        
		        
		        System.out.println("Tabla fusionada en orden ascendente: " );
		        
		        for( int a: res) {
		        	System.out.print(a+ " ");
		        }

		        res.toString();
		        
		        
		        
		        System.out.print("\n Tabla fusionada en orden descendente: ");
		        for (int l = res.length - 1; l >= 0; l--) {
		            System.out.print(res[l]);
		           
		        }
		        

		        scanner.close();
		    }
		


	}


