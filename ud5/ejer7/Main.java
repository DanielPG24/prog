/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer7;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main (String [] args){
        Vehiculo v = new Vehiculo();
        v.getMarca();
        
        Coche c = new Coche("Audi", "234", 2000, 4);
        c.mover();
        
        
    }
}
