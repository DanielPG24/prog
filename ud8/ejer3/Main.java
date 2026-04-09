/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args){
        // Crear la lista e inicializarla
        List<String> nombres = new ArrayList<>();

        // Añadir nombres iniciales
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Sofia");

        // Mostrar los nombres
        mostrarNombres(nombres);

        Scanner scanner = new Scanner(System.in);

        // Añadir un nuevo nombre
        System.out.print("Introduce un nuevo nombre: ");
        String nuevoNombre = scanner.nextLine();
        nombres.add(nuevoNombre);

        // Mostrar lista actualizada
        System.out.println("\nLista despues de añadir:");
        mostrarNombres(nombres);

        // Eliminar un nombre
        System.out.print("\nIntroduce el nombre a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        if (nombres.remove(nombreEliminar)) {
            System.out.println("Nombre eliminado correctamente.");
        } else {
            System.out.println("El nombre no se encuentra en la lista.");
        }

        // Mostrar lista final
        System.out.println("\nLista final:");
        mostrarNombres(nombres);

        // Mostrar tamaño de la lista
        System.out.println("\nNumero total de nombres: " + nombres.size());

        scanner.close();
    }
    
    public static void mostrarNombres(List<String> lista) {
        for (String string : lista) {
            System.out.println(string);
        }
    }
}
