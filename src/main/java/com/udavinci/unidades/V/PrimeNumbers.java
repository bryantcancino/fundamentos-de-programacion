package com.udavinci.unidades.V;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Obtener el número
        System.out.print("Ingrese el número entero positivo: ");
        int number = scanner.nextInt();

        // Paso 4: Validar que el segundo número sea positivo
        if (number <= 0) {
            System.out.println("El número debe tener valor positivo.");
            return;
        }

        // Paso 2: Generación de Números Primos
        System.out.print("Números primos entre 1 y " + number + ": [ ");
        for (int i = 2; i <= number; i++) {
            if (numberIsPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("]");

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }

    // Método para verificar si un número es primo
    private static boolean numberIsPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
