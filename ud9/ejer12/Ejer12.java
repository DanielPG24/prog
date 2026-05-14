/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer12;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejer12 {

    public static void main(String[] args) {

        File fichero = new File("abecedario.txt");

        try {

            // 1 y 2. Si existe, eliminarlo
            if (fichero.exists()) {

                fichero.delete();
                System.out.println("Fichero eliminado.");
            }

            // 3. Abrir flujo de acceso aleatorio
            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");

            // Escribir "defg"
            raf.writeBytes("defg");

            // 4. Mostrar contenido
            raf.seek(0);

            String contenido = raf.readLine();

            System.out.println("Contenido inicial: " + contenido);

            // 5. Añadir "abc" al principio y "hij" al final

            String nuevoContenido = "abc" + contenido + "hij";

            // Volver al inicio
            raf.seek(0);

            // Sobrescribir contenido
            raf.writeBytes(nuevoContenido);

            // Cortar el tamaño sobrante
            raf.setLength(nuevoContenido.length());

            // 6. Sustituir vocales por "*"

            raf.seek(0);

            String textoFinal = raf.readLine();

            textoFinal = textoFinal.replaceAll("[aeiou]", "*");

            // Escribir resultado final
            raf.seek(0);

            raf.writeBytes(textoFinal);

            raf.setLength(textoFinal.length());

            // Mostrar resultado final
            raf.seek(0);

            System.out.println("Contenido final: " + raf.readLine());

            // Cerrar archivo
            raf.close();

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
