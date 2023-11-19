package com.udavinci.unidades.VI;
import java.util.Arrays;

public class Scenario6 {

    public static void main(String[] args) {

        // 1. Crear una matriz cuadrada de tamaño n x n
        int[][] matriz = {{2,4,4,5},{6,6,9,1},{8,10,12,-1},{0,7,3,-10}};

        // 2. Definir la dimensión de la matriz cuadrada
        int n = matriz.length; // Puedes cambiar este valor según tus necesidades

        // 3. Crear un arreglo para almacenar los valores de la diagonal principal
        int[] diagonalPrincipal = new int[n];

        // 4. Recorrer la diagonal principal y almacenar los valores en el arreglo
        for (int i = 0; i < n; i++) {
            diagonalPrincipal[i] = matriz[i][i];
        }

        // 6. Mostrar la matriz original y el arreglo con los valores de la diagonal principal
        System.out.println("Matriz Original:");
        mostrarMatriz(matriz);

        System.out.println("\nValores de la Diagonal Principal:");
        System.out.println(Arrays.toString(diagonalPrincipal));
    }

    // Método para mostrar la matriz en la consola
    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
}
