/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota primer trimestre: ");
        int nota1 = sc.nextInt();
        System.out.println("Nota segundo trimestre: ");
        int nota2 = sc.nextInt();
        System.out.println("Nota tercer trimestre: ");
        int nota3 = sc.nextInt();
        
        float nota_media = (nota1 + nota2 + nota3)/3;
        
        
        System.out.println("Nota boletin: " + nota_media_boletin);
        System.out.println("Nota expediente: " + nota_media);
    }
    
}
