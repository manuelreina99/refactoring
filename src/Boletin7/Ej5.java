package Boletin7;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la cantidad de números que quiera introducir: ");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        // Lectura de números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduzca número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        int contadorCeros = 0;
        int contadorNegativos = 0;
        int contadorPositivos = 0;

        // Contar positivos, negativos y ceros
        for (double numero : numeros) {
            if (numero == 0) {
                contadorCeros++;
            } else if (numero < 0) {
                contadorNegativos++;
            } else {
                contadorPositivos++;
            }
        }

        double[] numerosNegativos = new double[contadorNegativos];
        double[] numerosPositivos = new double[contadorPositivos];

        int indiceNegativos = 0;
        int indicePositivos = 0;

        // Separar números en arrays de positivos y negativos
        for (double numero : numeros) {
            if (numero < 0) {
                numerosNegativos[indiceNegativos++] = numero;
            } else if (numero > 0) {
                numerosPositivos[indicePositivos++] = numero;
            }
        }

        // Calcular y mostrar medias
        System.out.println("La media de los números negativos es: " + calcularMedia(numerosNegativos));
        System.out.println("La media de los números positivos es: " + calcularMedia(numerosPositivos));
        System.out.println("El número de ceros introducidos es: " + contadorCeros);

        // Mostrar números positivos
        System.out.print("Números positivos: ");
        for (double num : numerosPositivos) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Mostrar números negativos
        System.out.print("Números negativos: ");
        for (double num : numerosNegativos) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }

    private static double calcularMedia(double[] numeros) {
        if (numeros.length == 0) return 0; // Manejo de división por cero

        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }
}

