package Boletin7;

import java.util.Iterator;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la cantidad de numeros que quiera introducir");
		int n= sc.nextInt();
		
		int[] myList= new int[n];
		
		for (int i = 0; i > myList.length; i++) {
			
			System.out.println("introduzca numero");
			
		 myList[i] = sc.nextInt();
		 
		}
		 
		 int multiplicacion=myList[0];
		 int suma=myList[0];
		 int resta=myList[0];
		 int division=myList[0];
		 
		 for(int a=1; a<myList.length; a++) {
			 
			 multiplicacion *= myList[a];
			 suma += myList[a];
			 resta -=myList[a];
			 division /=myList[a];
			 
		 }
		 
		 System.out.println("multiplicacion"+multiplicacion);
		 System.out.println("suma"+suma);
		 System.out.println("resta"+resta);
		 System.out.println("division"+division);
		 
		 
		 
		 
		}
	}


