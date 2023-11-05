package com.udavinci.unidades.IV;

import java.util.Scanner;

public class DaysCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora de días en un mes.\n");
        System.out.print("Ingrese el número de mes (1-12): ");
        int month = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("El número de mes debe estar en el rango de 1 a 12.");
            return;
        }

        System.out.print("Ingrese el año: ");
        int year = scanner.nextInt();

        int numberDaysInMonth = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberDaysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberDaysInMonth = 30;
                break;
            case 2:
                if (isLeap(year) ) {
                    numberDaysInMonth = 29;
                } else {
                    numberDaysInMonth = 28;
                }
                break;
        }

        System.out.println("El mes " + month + " del año " + year + " tiene " + numberDaysInMonth + " días.");

        scanner.close();
    }

    // Función para determinar si un año es bisiesto
    public static boolean isLeap(int year) {
        // divisible entre 4 y no divisible entre cien ó divisible entre 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
