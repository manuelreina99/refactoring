package Boletin7_diapositivas;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner sc = new Scanner(System.in);
		
		Double[] myList= new Double[100];
		
		for (int i = 0; i < myList.length; i++) {
			 myList[i] = Math.random() * 100;
			}
		
		double media=0;
		
		for ( double a : myList) {
			media = a+media;
			System.out.println(a);
			
		}
		
		media= media/myList.length;
		
		System.out.println("la media es:"+ media);
		
		int contador=0;
		
		for( double a : myList) {
			if (a>media) {
				
				contador++;
			}
		}
		
		System.out.println(contador);
		


	}

}
