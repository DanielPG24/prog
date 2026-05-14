/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer13;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import prog.comun.Persona;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Deserializar {
    public static void main(String[] args) {
        
        try{
            FileInputStream fichero = new FileInputStream("persona.dat");
            ObjectInputStream in = new ObjectInputStream(fichero);
        
            Persona p = (Persona) in.readObject();
            in.close();
            
            System.out.println("Persona encontrada");
            System.out.println(p);
        }catch (IOException e){
            System.out.println("Error de entrada/salida");
        }catch (ClassNotFoundException e){
            System.out.println("Clase no encontrada");
        }
    }
}
