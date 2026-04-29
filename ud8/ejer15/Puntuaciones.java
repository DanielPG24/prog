/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Puntuaciones {
    public static void main(String[] args) {

        // 1. Crear lista desordenada
        List<Integer> puntuaciones = new ArrayList<>();
        puntuaciones.add(450);
        puntuaciones.add(1200);
        puntuaciones.add(300);
        puntuaciones.add(800);
        puntuaciones.add(1500);
        puntuaciones.add(100);
        
        puntuaciones.addAll(Arrays.asList());
        
        System.out.println("Lista original:");
        System.out.println(puntuaciones);

        // 2. Ordenar de menor a mayor
        Collections.reverseOrder();
        System.out.println("\nLista ordenada (menor a mayor):");
        System.out.println(puntuaciones);

        // 3. Obtener máximo y mínimo
        int max = Collections.max(puntuaciones);
        int min = Collections.min(puntuaciones);

        System.out.println("\nPuntuación máxima: " + max);
        System.out.println("Puntuación mínima: " + min);

        // 4. Desordenar la lista
        Collections.shuffle(puntuaciones);
        System.out.println("\nLista desordenada (shuffle):");
        System.out.println(puntuaciones);
    }
}
