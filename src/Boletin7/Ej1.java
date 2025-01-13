package Boletin7;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] myList= new int[10];
		
		for (int i = 0; i < myList.length; i++) {
			System.out.println("introduzca numero");
		 myList[i] = sc.nextInt();
		}
		
		for ( int a : myList) {
			System.out.println(a);
		}
		
		
	}

}
