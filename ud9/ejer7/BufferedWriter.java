/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author 12_1DAW_Alum
 */
public class BufferedWriter {
    public static void main(String[] args) {
         try {

            // Creamos el BufferedWriter conectado a un archivo
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("archivo.txt")
            );

            // Escribimos texto
            bw.write("Hola mundo");
            bw.newLine(); // salto de línea
            bw.write("Estoy aprendiendo BufferedWriter");

            // Cerramos el archivo
            bw.close();

            System.out.println("Archivo escrito correctamente");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
