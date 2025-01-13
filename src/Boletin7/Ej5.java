package Boletin7;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la cantidad de numeros que quiera introducir");
		int n= sc.nextInt();
		
		double[] myList= new double[n];
		
		for (int i = 0; i < myList.length; i++) {
			
			System.out.println("introduzca numero");
			
		 myList[i] = sc.nextDouble();
		 
		}
		
		
		
		int cont_0=0;
		double media_negativos=0;
		double media_positivos=0;
		int cont_negativos=0;
		int cont_positivos=0;
		
		
		for(int i=0; i< myList.length; i++)
			
			if (myList[i]==0) {
				
				cont_0++;
			}
			else if (myList[i]<0) {
				
				cont_negativos++;
				
			}else if (myList[i]> 0) {
					
					cont_positivos++;
					
				} 
		
		double [] myListNegativos=new double[cont_negativos];
		double [] myListPositivos=new double[cont_positivos];
		int indice_positivos=0;
		int indice_negativos=0;
		
		
		for(int i=0; i< myList.length; i++)
			
			if (myList[i]<0) {
				
				myListNegativos[indice_negativos]=myList[i];
				indice_negativos++;
				
			}
			else if (myList[i]>0) {
				
				myListPositivos[indice_positivos]=myList[i];
				indice_positivos++;
				
			}else {
				
			}
		
		System.out.println("la media de los numeros negativos es:"+ media(myListNegativos));
		
		System.out.println("la media de los numeros positivos es:"+ media(myListPositivos));
		
		System.out.println("el numero de 0 introducidos es:"+ cont_0);
		
		
		for (int i =0; i<=myListPositivos.length-1;i++) {
			System.out.print(myListPositivos[i]+" ");
		}
		
		for (int j =0; j<=myListNegativos.length-1;j++) {
			System.out.print(myListNegativos[j]+" ");
		}
		
		
		

	}
	
	public static double media(double[] n) {
		
		double media=0;
		
		
		for(int i=0; i< n.length; i++) {
			
			
			media= media+n[i];
				
				
				
			}
		media=media/n.length;
		
		return media;
	}
	
	
	
	

}
