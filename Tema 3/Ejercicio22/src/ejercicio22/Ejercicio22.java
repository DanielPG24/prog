/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio22 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         while (true) {
             int numero = sc.nextInt();
             if (numero != 0){
                 if (numero > 0){
                    System.out.println("El numero es positivo");
                }else{
                     System.out.println("El numero es negativo");
                }
                if ((numero / 2) == 0){
                    System.out.println("El numero es par");
                }else{
                    System.out.println("El numero es impar");
                }
                int cuadrado = numero*numero;
                System.out.println("Su cuadrado es: " + cuadrado);
             
            }
             if (numero == 0){
                 break;
             }
         }
                
    }
    
}
