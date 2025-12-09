/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int a = 1;
        int b = 10;
        
        
        if(numero > a && numero < b){
            System.out.println("El numero a era: " + a);
            System.out.println("El numero b era: " + b);
        }
        System.out.println("El numero seleccionado fue: " + numero);
    }
    
}
