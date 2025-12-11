/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;

        System.out.print("Kilos de manzanas (1er semestre): ");
        double manzanas1 = sc.nextDouble();

        System.out.print("Kilos de manzanas (2º semestre): ");
        double manzanas2 = sc.nextDouble();

        System.out.print("Kilos de peras (1er semestre): ");
        double peras1 = sc.nextDouble();

        System.out.print("Kilos de peras (2º semestre): ");
        double peras2 = sc.nextDouble();

        double totalManzanas = (manzanas1 + manzanas2) * PRECIO_MANZANAS;
        double totalPeras = (peras1 + peras2) * PRECIO_PERAS;

        double total = totalManzanas + totalPeras;

        System.out.println("Beneficio anual total: " + total + " €");
    }
    
}
