package com.udavinci.unidades.VI;
import java.util.HashMap;
import java.util.Map;

public class Scenario4 {

    public static void main(String[] args) {
        // Paso 1: Definir un arreglo de números enteros
        int[] numeros = {1, 2, 3, 4, 2, 6, 2, 8, 9, 2, 11};

        // Paso 2: Crear un mapa para almacenar la frecuencia de cada número
        Map<Integer, Integer> frecuenciaNumeros = new HashMap<>();

        // Paso 3: Iterar sobre el arreglo y contar la frecuencia de cada número
        for (int numero : numeros) {
            frecuenciaNumeros.put(numero, frecuenciaNumeros.getOrDefault(numero, 0) + 1);
        }

        // Paso 4: Identificar el número con la frecuencia más alta (la moda)
        int moda = 0;
        int frecuenciaMaxima = 0;

        for (Map.Entry<Integer, Integer> entry : frecuenciaNumeros.entrySet()) {
            if (entry.getValue() > frecuenciaMaxima) {
                moda = entry.getKey();
                frecuenciaMaxima = entry.getValue();
            }
        }

        // Paso 5: Mostrar el valor de la moda
        System.out.println("La moda es: " + moda);
    }
}
