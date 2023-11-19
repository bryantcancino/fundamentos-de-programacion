package com.udavinci.unidades.VI;

import java.util.Scanner;

public class Scenario1 {

    public static void main(String[] args) {
        // Paso 1: Definir un arreglo de números enteros.
        int[] arreglo = {4, 8, 2, 10, 5};

        // Paso 2: Inicializar variables.
        int numeroMayor = Integer.MIN_VALUE;
        int numeroMenor = Integer.MAX_VALUE;
        int suma = 0;

        // Paso 3: Recorrer el arreglo.
        for (int i = 0; i < arreglo.length; i++) {
            // Paso 3a y 3b: Comparar y actualizar el número mayor y menor.
            if (arreglo[i] > numeroMayor) {
                numeroMayor = arreglo[i];
            }
            if (arreglo[i] < numeroMenor) {
                numeroMenor = arreglo[i];
            }

            // Paso 3c: Sumar el valor actual al acumulador de la suma.
            suma += arreglo[i];
        }

        // Paso 4: Calcular el promedio.
        double promedio = (double) suma / arreglo.length;

        // Paso 5: Mostrar resultados.
        System.out.println("Número Mayor: " + numeroMayor);
        System.out.println("Número Menor: " + numeroMenor);
        System.out.println("Promedio: " + promedio);
    }
}
