/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero del mes (1-12): ");
        int mes = sc.nextInt();
        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                dias = 28; // Para años no bisiestos
                break;
            default:
                dias = -1; // Número inválido
        }

        if (dias != -1) {
            System.out.println("El mes " + mes + " tiene " + dias + " dias.");
        } else {
            System.out.println("Numero de mes invalido.");
        }
    }
    
}
