package com.udavinci.unidades.VI;
import java.util.Arrays;

public class Scenario3 {

    public static void main(String[] args) {
        // Paso 1: Ingresar dos arreglos
        int[] array1 = {5, 3, 8, 1};
        int[] array2 = {7, 2, 6, 4, 1};

        // Paso 2: Combina los dos arreglos
        int[] arrayCombined = mergeArrays(array1, array2);

        // Paso 3: Ordena el arreglo combinado
        Arrays.sort(arrayCombined);

        // Paso 4: Muestra el arreglo combinado ordenado
        System.out.println("Arreglo combinado ordenado: " + Arrays.toString(arrayCombined));
    }

    // Método para combinar dos arreglos en uno
    private static int[] mergeArrays(int[] array1, int[] array2) {
        int length = array1.length + array2.length;
        int[] result = new int[length];
        int index = 0;

        for (int value : array1) {
            result[index++] = value;
        }

        for (int value : array2) {
            result[index++] = value;
        }

        return result;
    }
}
