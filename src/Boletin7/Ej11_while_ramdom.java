package Boletin7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej11_while_ramdom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la longitud de la combinacion");
		int n= sc.nextInt();
		
		
		int[] clave= new int [n];
		
		int[] numeros= {0,1,2,3,4,5,6,7,8,9};
		
		
		
		 Random random = new Random();
		 
		
		
		
		for (int i = 0; i < clave.length; i++) {
			
			
			clave[i]=numeros[random.nextInt(0,9)];
		 
		}
		
		System.out.println("la clave es:");
		
		for(int a: clave) {
			
			System.out.print(a);
		}
		
		System.out.println("\n introduzca los digitos de la clave");
		
		 
		 
		 while(true) {
			 
			 int[] solucion= new int[n];
			 
			 for (int i=0; i<solucion.length; i++) {
				 
				 solucion[i]= sc.nextInt();
				 
			 }
			 
			 
			 
			 if (Arrays.equals(solucion, clave)) {
				break;
			}
			 
			 
			 System.out.println("no es correcto");
			 
		 }
		 
		 System.out.println("ha acertado la clave");
		 
		 
		
		
		
		

	}

}
