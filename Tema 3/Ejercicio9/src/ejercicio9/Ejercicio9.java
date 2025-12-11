/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has finalizado tus tareas? (true/false): ");
        boolean tareasFinalizadas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean necesitaBiblioteca = sc.nextBoolean();

        boolean permisoSalir = necesitaBiblioteca || (!llueve && tareasFinalizadas);

        System.out.println("¿Puedes salir a la calle? " + permisoSalir);
    }
    
}
