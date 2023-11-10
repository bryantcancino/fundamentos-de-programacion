package com.udavinci.unidades.V;

import java.util.Scanner;

public class CommonFactors {

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calculateMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Función para calcular el mcm utilizando la fórmula: mcm(a, b) = (a * b) / MCD(a, b)
    public static int calculateMCM(int a, int b) {
        return (a * b) / calculateMCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Paso 1: Obtener el primer número
        System.out.print("Ingrese el primer número entero positivo: ");
        int num1 = scanner.nextInt();

        // Paso 2: Validar que el número sea positivo
        if (num1 <= 0) {
            System.out.println("El número debe tener valor positivo.");
            return;
        }

        // Paso 3: Obtener el segundo número
        System.out.print("Ingrese el segundo número entero positivo: ");
        int num2 = scanner.nextInt();

        // Paso 4: Validar que el segundo número sea positivo
        if (num2 <= 0) {
            System.out.println("El número debe tener valor positivo.");
            return;
        }

        // Paso 5: Calcular y mostrar el MCD y el mcm
        int mcd = calculateMCD(num1, num2);
        int mcm = calculateMCM(num1, num2);

        System.out.println("El Máximo Común Divisor (MCD) de " + num1 + " y " + num2 + " es: " + mcd);
        System.out.println("El mínimo común múltiplo (mcm) de " + num1 + " y " + num2 + " es: " + mcm);

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }
}
