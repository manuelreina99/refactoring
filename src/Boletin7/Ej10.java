package Boletin7;

import java.util.Iterator;
import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la cantidad de numeros que quiera introducir");
		int n= sc.nextInt();
		
		int[] myList= new int[n];
		int[] impares= new int[n];
		int[] pares= new int[n];
		
		
		for (int i = 0; i < myList.length; i++) {
			
			System.out.println("introduzca numero");
			
		 myList[i] = sc.nextInt();
		 
		}
		
		int indice_impares=0;
		int indice_pares=0;
		for(int i=0; i<myList.length; i++) {
			
			if(esPar(myList[i])) {
				
				pares[indice_pares]= myList[i];
				indice_pares++;
			}else {
				
				impares[indice_impares]= myList[i];
				indice_impares++;
				
			}
			
			
		}
		
		for(int i : pares) {
			System.out.print(i+ " ");
		}
		System.out.println("\n");
		
		for(int i : impares) {
			System.out.print(i+ " ");
		}
		

	}
	
	public static boolean esPar(int n) {
		
		boolean res=false;
		
		if (n%2==0) {
			res= true;
		}
		
		return res;
		
	}

}
