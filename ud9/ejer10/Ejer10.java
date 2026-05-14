/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer10;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author 12_1DAW_Alum
 */

public class Ejer10 {

    public static void main(String[] args) {

        String archivo = "texto.txt";

        try {

            // 1. Añadir contenido al final del fichero
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter(archivo, true)
            );

            bw.write("Esta linea fue añadida desde Java.");
            bw.newLine();

            bw.close();

            // 2. Mostrar contenido del fichero
            BufferedReader br = new BufferedReader(
                    new FileReader(archivo)
            );

            String linea;

            System.out.println("Contenido del fichero:");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
