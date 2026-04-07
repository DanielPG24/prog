/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer13;

import java.util.Random;


/**
 *
 * @author 12_1DAW_Alum
 */
public class Metodos {

    public static double sumar(double a, double b){
        return a + b;
    }

    public static double restar(double a, double b){
        return a - b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

    public static double dividir(double a, double b){
        if(b == 0){
            System.out.println("No se puede dividir entre 0");
        }
        return a / b;
    }
    
    public final static int alumnoAleatorio(int totalAlumnos){

        Random r = new Random();
        return r.nextInt(totalAlumnos);
    }

    public final static int calcularPuntuacion(int enemigos, int monedas){

        return enemigos * 100 + monedas * 10;
    }
}
