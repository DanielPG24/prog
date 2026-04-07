/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer12;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Pajaro extends Animal{
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Pio pio");
    }
    
    @Override
    public String moverse(){
        return "no movimiento";
    }
    
}

