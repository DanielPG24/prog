/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer1;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args){
        // Pedir al usuario que introduzca 4 caracteres por teclado
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        
        char c1 = entrada.charAt(0);
        char c2 = entrada.charAt(1);
        char c3 = entrada.charAt(2);
        char c4 = entrada.charAt(3);

        // 1. Imprimir el primero con el write
        System.out.write(c1);
        System.out.flush();

        // 2. Imprimir el segundo con print
        System.out.print(c2);

        // 3. Imprimir el tercero con println
        System.out.println(c3);

        // 4. Imprimir el cuarto con printfSystem.out.write('\n');
        System.out.printf("El ultimo caracter es: %c", c4);
        
        sc.close();

    }
}
