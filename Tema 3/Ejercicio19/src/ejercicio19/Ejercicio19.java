/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int b = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        int c = sc.nextInt();

        int mayor, medio, menor;

        if (a >= b && a >= c) {
            mayor = a;
            if (b >= c) {
                medio = b;
                menor = c;
            } else {
                medio = c;
                menor = b;
            }
        } else if (b >= a && b >= c) {
            mayor = b;
            if (a >= c) {
                medio = a;
                menor = c;
            } else {
                medio = c;
                menor = a;
            }
        } else {
            mayor = c;
            if (a >= b) {
                medio = a;
                menor = b;
            } else {
                medio = b;
                menor = a;
            }
        }

        System.out.println("Ordenados de mayor a menor: " + mayor + ", " + medio + ", " + menor);

    }
    
}
