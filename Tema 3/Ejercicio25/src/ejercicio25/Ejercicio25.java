/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int correctas = 0;
        boolean acierto;

        do {
            int num1 = rnd.nextInt(100) + 1;
            int num2 = rnd.nextInt(100) + 1;

            System.out.print("¿Cuanto es " + num1 + " + " + num2 + "? ");
            int respuesta = sc.nextInt();

            if (respuesta == num1 + num2) {
                System.out.println("¡Correcto!\n");
                correctas++;
                acierto = true;
            } else {
                System.out.println("Incorrecto. El juego ha terminado.");
                acierto = false;
            }

        } while (acierto);

        System.out.println("Operaciones correctas: " + correctas);
    }
    
}
