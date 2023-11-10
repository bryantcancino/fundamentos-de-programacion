package com.udavinci.unidades.V;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // Paso 1: Solicitar al usuario que ingrese un número entero positivo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");

        // Paso 2: Leer el número ingresado por el usuario
        int number = scanner.nextInt();
        scanner.close();

        // Paso 3: Validar que el número ingresado sea un entero positivo
        if (number <= 0) {
            System.out.println("Error: El número ingresado no es un entero positivo.");
        } else {
            // Paso 4: Calcular el factorial del número
            long factorial = calculateFactorial(number);

            // Paso 5: Mostrar el resultado
            System.out.println(number + "! = " + factorial);
        }
    }

    // Método recursivo para calcular el factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
