package prog.ud9.ejer3;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer3 {
     public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Instrucciones
        System.out.println("Introduzca varios caracteres y despues pulse intro para finalizar");

        // Leer texto del usuario
        String nombre = teclado.nextLine();

        // Saludo
        System.out.println("Hola " + nombre + "!");

        teclado.close();
    }
}
