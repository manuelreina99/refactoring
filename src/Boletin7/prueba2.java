package Boletin7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la cantidad de numeros que quiera introducir");
		int n= sc.nextInt();
		
		int[] myList= new int[n];
		
		for (int i = 0; i < myList.length; i++) {
			
			System.out.println("introduzca numero");
			
		 myList[i] = sc.nextInt();
		 
		 
		}
		
		Arrays.sort(myList);
		
		
		for( int a : myList) {
			
			System.out.print(a+ " ");
		}
		
		int ultimo= myList[myList.length-1];
		
		for (int i=myList.length-1; i>0; i--) {
			
			myList[i]= myList[i-1];
			
		}
		
		myList[0]=ultimo;
		
		for( int a: myList) {
			
			System.out.println(a);
			
		}
		
		

	}

}