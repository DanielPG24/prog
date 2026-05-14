/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import prog.comun.Persona;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer13 {
    public static void main(String[] args) {
        Persona miPersona = new Persona("2Pac", 30);
        
        try{
            FileOutputStream fichero = new FileOutputStream("persona.dat");
            ObjectOutputStream fos = new ObjectOutputStream(fichero);
            fos.writeObject(miPersona);
            fos.close();
            
        }catch (IOException e){
            System.out.println("Error");
        }
    }
}
