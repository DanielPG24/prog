/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero decimal: ");
        double num = sc.nextDouble();

        if (num != 0 && num > -1 && num < 1) {
            System.out.println("El numero es casi-cero.");
        } else {
            System.out.println("El numero NO es casi-cero.");
        }
    }
    
}
