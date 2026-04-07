/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.ejer1;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args){
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");
        try {
            int dividendo = 5;
            int divisor = 0;
            System.out.println("Resultado :" + dividendo / divisor);  
        } catch (ArithmeticException ex) {
            System.out.println("Imposible dividir por 0");
        } finally {
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }
}
