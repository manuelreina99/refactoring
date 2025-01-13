package Boletin7;

import java.util.Random;
import java.util.Scanner;

public class prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] myList= new int[3];
		
		for (int i = 0; i < myList.length; i++)
		 myList[i] = sc.nextInt();
		
		
		for ( int a : myList) {
			System.out.println(a);
			
		}
		
		
		
		

	}

}
