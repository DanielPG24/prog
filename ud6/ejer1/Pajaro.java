/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud6.ejer1;

/**
 *
 * @author 12_1DAW_Alum
 */
public abstract class Pajaro extends Animal implements Volador{
    
    @Override
    public void hacerSonido(){
        System.out.println("Pio");
    }
    
    @Override
    public void moverse(){
        System.out.println("Vuela");
    }
    
    
    @Override
    public void mostrarInfo(){
        System.out.println("Soy un pajaro");
    }
    
    @Override
    public void volar(){
        System.out.println("Vuela");
    }
}
