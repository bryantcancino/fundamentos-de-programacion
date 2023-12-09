package com.udavinci.unidades.VI;

import java.util.Arrays;

public class Scenario5 {
    public static void main(String[] args) {
        // Paso 1: Definir dos arreglos
        int[] arr1 = {5, 8, 12, 3};
        int[] arr2 = {7, 2, 10, 6};

        // Paso 2: Inicializar un tercer arreglo
        int[] arrResult = new int[arr1.length];

        // Paso 3: Obtener el valor mínimo y almacenar en arrResult
        for (int i = 0; i < arr1.length; i++) {
            arrResult[i] = Math.min(arr1[i], arr2[i]);
        }

        // Paso 4: Ordenar arrResult de manera descendente
        Arrays.sort(arrResult);
        reverseArray(arrResult);

        // Paso 5: Mostrar el contenido de arrResult
        System.out.println("Resultado ordenado de manera descendente: " + Arrays.toString(arrResult));
    }

    // Método para invertir un arreglo
    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
