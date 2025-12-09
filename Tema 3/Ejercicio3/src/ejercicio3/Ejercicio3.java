/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double anno_actual = sc.nextDouble();
        double anno_nac = sc.nextDouble();
        double numero = anno_actual - anno_nac;
        
        System.out.println("Edad: " + numero);
        
    }
    
}
