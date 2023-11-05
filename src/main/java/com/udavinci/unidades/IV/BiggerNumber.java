package com.udavinci.unidades.IV;

import java.util.*;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la búsqueda del número mayor.\n");

        List<String> cardinalityList = Arrays.asList("primer", "segundo", "tercero");
        List<Integer> numbers = new ArrayList<>();

        for(String cardinal: cardinalityList){

            System.out.print("Ingrese el "+cardinal+" número entero positivo: ");
            int number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("El número debe ser positivo.");
                return;
            }

            numbers.add(number);

        }

        numbers.sort(Collections.reverseOrder());

        System.out.println("El número mayor es: " + numbers.get(0));

        scanner.close();
    }
}
