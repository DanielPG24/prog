/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer4;

import java.util.ArrayList;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args) {

        // Array de entrada (Strings)
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // ArrayList de Double
        ArrayList<Double> notas = new ArrayList<>();

        // Conversión (Parsing) y almacenamiento
        for (String notaStr : notasEntrada) {
            Double nota = Double.parseDouble(notaStr); // también podría ser Double.valueOf()
            notas.add(nota);
        }

        // Cálculo de la media (Unboxing automático)
        double suma = 0.0;
        for (Double nota : notas) {
            suma += nota; // aquí Java hace unboxing automáticamente
        }

        double media = suma / notas.size();

        // Filtrado de aprobados
        ArrayList<Double> aprobados = new ArrayList<>();
        for (Double nota : notas) {
            if (nota >= 5.0) {
                aprobados.add(nota);
            }
        }

        // Mostrar resultados
        System.out.println("Notas: " + notas);
        System.out.println("Nota media: " + media);
        System.out.println("Aprobados: " + aprobados);
    }
}
