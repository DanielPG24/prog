/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 10;
        
        while(true){
            int numero = sc.nextInt();
            if(numero < a || numero > b){
                System.out.println("Vuelve a intentarlo");
            }else{
                System.out.println("El numero a era: " + a);
                System.out.println("El numero b era: " + b);
                System.out.println("El numero seleccionado fue: " + numero);
                break;
            }  
        }
    }
    
}
