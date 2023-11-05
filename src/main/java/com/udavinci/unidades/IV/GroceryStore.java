package com.udavinci.unidades.IV;

import java.util.Scanner;

public class GroceryStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda de abarrotes.\n");
        System.out.print("Ingrese el número de unidades a comprar: ");
        int unitsToBuy = scanner.nextInt();

        if (unitsToBuy <= 0) {
            System.out.println("El número de unidades debe ser un valor positivo.");
            return;
        }

        System.out.print("Ingrese el precio unitario del producto: ");
        double unitPrice = scanner.nextDouble();

        double subTotal = unitsToBuy * unitPrice;
        double discount = 0;

        if (unitsToBuy > 100) {
            discount = 0.4 * subTotal; // Descuento del 40%
        } else if (unitsToBuy >= 25) {
            discount = 0.2 * subTotal; // Descuento del 20%
        } else if (unitsToBuy >= 10) {
            discount = 0.1 * subTotal; // Descuento del 10%
        }
        
        double totalToPay = subTotal - discount;

        System.out.println("Sub-total: $" + subTotal);
        System.out.println("Descuento: $" + discount);
        System.out.println("Total a pagar: $" + totalToPay);

        scanner.close();
    }
}
