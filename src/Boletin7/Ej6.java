package Boletin7;


import java.util.Arrays;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var sc = new Scanner(System.in);
		 
		 
		 
		 int [] lista= new int[5];
		 int [] lista2= new int[5];
		 int [] lista3= new int[5];
		 
		 System.out.println("introduzca "+ lista.length + " numeros");
		 
		 for (int i=0; i<lista.length; i++) {
			 
			 lista[i]= sc.nextInt();
			 
		 }
		 
		 System.arraycopy(lista, 0, lista2, 0,
				 lista.length);
		 
		
		 
		 for(int i=0; i< lista2.length ;i++) {
			 
			 lista2[i]= lista2[i]*2;
		 }
		 
		 System.arraycopy(lista2, 0, lista3, 0,
				 lista.length);
		 
		 Arrays.sort(lista3);
		 
		      
		 for( int a: lista) {
			 
			 System.out.print(a + " ");
			 
		 }
		 System.out.println("\n");
		 
		 for( int a: lista2) {
			 
			 System.out.print(a + " ");
			 
		 }
		 
		 System.out.println("\n");
		 
		 for( int a: lista3) {
			 
			 System.out.print(a + " ");
			 
		 }
		 
		 
				 

	}

}
