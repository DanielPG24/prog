/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer6;

import java.util.Scanner;

public class AdivinoDigital {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir nombre
        System.out.println("¿Cuantos años crees que viviras?");
        int años = sc.nextInt();
        
        sc.nextLine();
        
        // Pedir edad
        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.nextLine();

        // Mostrar predicción
        System.out.println("Hola " + nombre +
                ", los astros dicen que moriras a los " +
                (años + 10) +
                " por culpa de un cafe frio");

        sc.close();
    }
}