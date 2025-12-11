/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        int num = sc.nextInt();

        int absoluto = Math.abs(num);

        System.out.println("Valor absoluto: " + absoluto);
    }*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor: ");
        int num = sc.nextInt();

        int absoluto = (num < 0) ? -num : num;

        System.out.println("Valor absoluto: " + absoluto);
    }
    
}
