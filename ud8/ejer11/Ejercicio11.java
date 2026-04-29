/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClubDeLectura club = new ClubDeLectura();
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar libros (for-each)");
            System.out.println("3. Mostrar libros (Iterator)");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el nombre del libro: ");
                    String libro = scanner.nextLine();
                    if (club.agregarLibro(libro)) {
                        System.out.println("Libro añadido correctamente.");
                    } else {
                        System.out.println("Ese libro ya existe (no se permiten duplicados).");
                    }
                    break;

                case 2:
                    club.mostrarLibrosForEach();
                    break;

                case 3:
                    club.mostrarLibrosIterator();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}

