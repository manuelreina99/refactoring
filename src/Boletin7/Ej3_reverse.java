package Boletin7;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ej3_reverse {

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
		
		//darle la vuelta al array
		
		for( int i=0; i<myList.length ; i++) {
			for(int j =i+1; j<myList.length ; j++) {
				
				int temp= myList[i];
				myList[i]= myList[j];
				myList[j]=temp;
			}
			
		}
		
		
//		for (int i=myList.length-1; i>=0; i--) {
//			
//			
//			System.out.println(myList[i]);
//		}
		
		
		for( int a : myList) {   
			
			System.out.println(a);
			
		}
		
		
		
		
		

	}

}
