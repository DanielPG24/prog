/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio32 {
    public static int maximo(int a, int b) {
        if (a > b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("El maximo es: " + maximo(20, 43));
    }
    
}
