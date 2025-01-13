package Boletin7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduzca sus 10 numeros favoritos");
		double[] numeros= new double[10];
		
		for (int i = 0; i < numeros.length; i++) {
			
			
			
		 numeros[i] = sc.nextDouble();
		 
		};

		        // Inicializar el arreglo con 10 números favoritos
		        
		        int elementosRestantes = numeros.length; // Para rastrear cuántos quedan

		        while (true) {
		        	
		            // Mostrar el contenido actual del arreglo
		            System.out.println("Tabla actual:");
		            for (int i = 0; i < elementosRestantes; i++) {
		                System.out.print(numeros[i] + " ");
		                
		            }
		            
		            
		            System.out.println();

		            // Pedir al usuario el índice del elemento a eliminar
		            System.out.print("Introduce el índice del elemento a eliminar (negativo para salir): ");
		            int indice = sc.nextInt();

		            // Verificar si el índice es negativo para salir
		            if (indice < 0) {
		                System.out.println("Saliendo del programa.");
		                break;
		            }

		            // Validar el índice
		            if (indice >= elementosRestantes) {
		                System.out.println("Índice no válido. Por favor, introduce un índice entre 0 y " + (elementosRestantes - 1));
		                continue;
		            }

		            // Eliminar el elemento desplazando los demás hacia la izquierda
		            for (int i = indice; i < elementosRestantes - 1; i++) {
		                numeros[i] = numeros[i + 1];
		            }

		            // Reducir el número de elementos restantes
		            elementosRestantes--;

		            // Verificar si ya no quedan elementos
		            if (elementosRestantes == 0) {
		                System.out.println("No quedan más elementos que eliminar. Saliendo del programa.");
		                break;
		            }
		        }

		        sc.close();
		    }
	
			
		public static int[] borraElemento(int [] tabla, int indice) {
			
			int aux[] = new int[tabla.length-1];
			for (int i=0; i<indice; i++) {
				aux[i]=tabla[i];
			}
			for(int i =indice ; i<aux.length; i++) {
				aux[i]=tabla[i+1];
			}
			return aux;
		}
		
	}



