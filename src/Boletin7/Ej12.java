package Boletin7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduzca la cantidad de participantes");
		int n= sc.nextInt();
		
		int[] notas= new int[n];
		
		String[] participantes= new String[n];
		
		
		
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("nombre de participante");
			
			participantes[i] = sc.next();
		 
		 	System.out.println("introduzca su nota");
		 	
		 	notas[i]= sc.nextInt();
		 
		}
		
		
		
		System.out.println("introduzca la cantidad de participantes nuevos, si hay, si no, introduzca -1");
		
		int a= sc.nextInt();
		
		if (a == 0) {
			
			System.out.println("se ha acabado la competicion");
			
			
		}
		
		
		
		
		
		String[] NuevosParticipantes= new String[a];
		
		int[] notas_nuevas= new int[a];
		
		for(int i=0; i<notas_nuevas.length; i++) {
			
			System.out.println("nombre de participante");
			
			NuevosParticipantes[i] = sc.next();
		 
		 	System.out.println("introduzca su nota");
		 	
		 	notas_nuevas[i]= sc.nextInt();
			
		}
		
		int[] res= new int[a+n];
		
		
		for(int i =0; i<n; i++) {
			
			res[]= notas[i];
		}
		
		for(int i =0 ; i<a; i++) {
			
			res[ i+ n]= notas_nuevas[i];
		}
		
		
		
		
		
		
		Arrays.sort(res);
		
		for ( int i: res) {


			System.out.print(a+" ");
		}
		
		
		
		
		
		
		
		
		
		
//		for(String a : participantes) {
//			
//			System.out.println(a);
//		}
		
		
		

	}

}
