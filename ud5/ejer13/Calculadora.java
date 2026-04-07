/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer13;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo número:");
        double num2 = sc.nextDouble();

        System.out.println("Elige una operación:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");

        int opcion = sc.nextInt();

        double resultado = 0;

        switch(opcion) {

            case 1:
                resultado = Metodos.sumar(num1, num2);
                break;

            case 2:
                resultado = Metodos.restar(num1, num2);
                break;

            case 3:
                resultado = Metodos.multiplicar(num1, num2);
                break;

            case 4:
                resultado = Metodos.dividir(num1, num2);
                break;

            default:
                System.out.println("Opción no válida");
                return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}

