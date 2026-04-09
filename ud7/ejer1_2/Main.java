/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.ejer1_2;

import java.io.IOException;

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
    
    public static int dividir(int a, int b) throws ArithmeticException, IOException {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }

        // Ejemplo forzado de IOException
        if (a < 0) {
            throw new IOException("Error de IO simulado");
        }

        return a / b;
    }
}
