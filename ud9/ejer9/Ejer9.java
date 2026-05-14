/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer9;

/**
 *
 * @author 12_1DAW_Alum
 */
import java.io.File;
import java.io.IOException;

public class Ejer9 {

    public static void main(String[] args) {

        // Creamos el objeto File
        File archivo = new File("notas.txt");

        try {

            // Verificamos si existe
            if (archivo.exists()) {

                System.out.println("El archivo existe.");
                System.out.println("Nombre: " + archivo.getName());
                System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

            } else {

                System.out.println("El archivo no existe.");

                // Crear el archivo
                if (archivo.createNewFile()) {

                    System.out.println("Archivo creado correctamente.");
                    System.out.println("Nombre: " + archivo.getName());
                    System.out.println("Ruta absoluta: " + archivo.getAbsolutePath());

                } else {

                    System.out.println("No se pudo crear el archivo.");
                }
            }

        } catch (IOException e) {

            System.out.println("Error al trabajar con el archivo.");
            System.out.println(e.getMessage());
        }
    }
}
