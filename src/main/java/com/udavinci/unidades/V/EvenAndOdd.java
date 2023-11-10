package com.udavinci.unidades.V;

import java.util.List;import java.util.Scanner;
import java.util.ArrayList;

public class EvenAndOdd {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la obtención de numeros pares e impares.\n");

        // Paso 1: Pedir al usuario que ingrese dos números enteros positivos
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        if (num1 <= 0) {
            System.out.println("El número debe tener valor positivo.");
            return;
        }

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        if (num2 <= 0) {
            System.out.println("El número debe tener valor positivo.");
            return;
        }

        // Paso 2: Generar una lista ascendente de números enteros entre num1 y num2
        List<Integer> ascendingList = generateAscendingList(num1, num2);

        //Generar una lista de listas descendente de números pares e impares entre num1 y num2
        List<List<Integer>> listOfEvenAndOdd = getListOfEvenAndOdd(num1, num2);

        // Paso 3: Obtener la lista descendente de números pares entre num1 y num2
        List<Integer> descendingEvenList = listOfEvenAndOdd.get(0);

        // Paso 4:  Obtener la lista descendente de números impares entre num1 y num2
        List<Integer> descendingOddList = listOfEvenAndOdd.get(1);

        // Paso 5: Imprimir las listas generadas
        System.out.println("Lista ascendente: " + ascendingList);
        System.out.println("Lista descendente de números pares: " + descendingEvenList);
        System.out.println("Lista descendente de números impares: " + descendingOddList);

        scanner.close();
    }

    // Método para generar una lista ascendente de números enteros entre num1 y num2, incluyéndolos.
    private static List<Integer> generateAscendingList(int num1, int num2) {
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);
        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            list.add(i);
        }
        return list;
    }

    // Método para obtener una una lista de listas descendente de números pares e impares entre num1 y num2, incluyéndolos.
    private static List<List<Integer>> getListOfEvenAndOdd(int num1, int num2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();

        // minar las listas del paso 3 y 4
        for (int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }

        list.add(evenList);
        list.add(oddList);

        return list;
    }

}
