/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota1 = sc.nextInt();
        int nota2 = sc.nextInt();
        double nota_media = (nota1 + nota2)/2;
        
        System.out.println("Nota media: " + nota_media);
    }
    
}
