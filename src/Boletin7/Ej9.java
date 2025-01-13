package Boletin7;

import java.lang.annotation.ElementType;
import java.util.HashMap;

public class Ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] nombres = {
		            "Carlos", "María", "Juan", "Ana", "Luis", 
		            "Sofía", "Pedro", "Marta", "Javier", "Laura", 
		            "Andrés", "Claudia", "Manuel", "Isabel", "Diego", 
		            "Lucía", "Antonio", "Carmen", "Miguel", "Elena", 
		            "Daniel", "Paula", "José", "Valeria", "Fernando", 
		            "Adriana", "Alberto", "Teresa", "Cristina", "Francisco"
		        };
		 
		 int[] horasTrabajadas = {
		            160, 145, 150, 130, 140, 
		            155, 165, 170, 145, 160, 
		            120, 135, 155, 150, 140, 
		            180, 175, 165, 140, 150, 
		            160, 145, 155, 140, 150, 
		            130, 140, 155, 160, 170
		        };
		 
		 int maximo=0;
		 int minimo=999999999;
		 for ( int i=0; i<horasTrabajadas.length; i++) {
			 
			 if(horasTrabajadas[i]>= maximo)
				 maximo=horasTrabajadas[i];
			 
			 else if (horasTrabajadas[i]<minimo) {
				 
				 minimo=horasTrabajadas[i];
				
			}
			 
		 }
		 
		 for(int i=0; i<nombres.length; i++) {
			 
			 	System.out.println("El empleado "+ nombres[i]+ " ha cobrado "+ horasTrabajadas[i]*20);
		 }
		 
		 for(int i=0; i<nombres.length; i++) {
			 
			 
			 
			 if (horasTrabajadas[i]==maximo) {
				 
				 System.out.println("El empleado "+ nombres[i]+ " ha sido el/la que más ha ganado "+ horasTrabajadas[i]*20);
				
			}else if (horasTrabajadas[i]==minimo) {
				
				System.out.println("El empleado "+ nombres[i]+ " ha sido el/la que menos ha ganado "+ horasTrabajadas[i]*20);
				
			}
			 
			 
			 
			 
			 
		 }
		 
		 
		 
		 
		 
	}

}
