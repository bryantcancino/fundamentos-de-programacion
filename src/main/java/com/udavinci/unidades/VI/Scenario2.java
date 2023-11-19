package com.udavinci.unidades.VI;

import java.util.ArrayList;
import java.util.List;

public class Scenario2 {

    public static void main(String[] args) {
        // Paso 1: Definir un arreglo de números enteros.
        int[] numeros = {3, 7, 2, 5, 3, 7, 8, 1, 2};

        // Paso 2: Inicializar una lista para almacenar los valores únicos.
        List<Integer> valoresUnicos = new ArrayList<>();

        // Paso 3: Iterar sobre cada elemento del arreglo.
        for (int numero : numeros) {
            // Paso 3a: Si el elemento no está en la lista de valores únicos, agregarlo.
            if (!valoresUnicos.contains(numero)) {
                valoresUnicos.add(numero);
            }
            // Paso 3b: Si el elemento ya está en la lista de valores únicos, no hacer nada.
        }

        // Paso 4: Mostrar la lista de valores únicos.
        System.out.println("Valores únicos en el arreglo: " + valoresUnicos);
    }
}

