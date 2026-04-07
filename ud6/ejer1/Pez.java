/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud6.ejer1;

/**
 *
 * @author 12_1DAW_Alum
 */
public abstract class Pez extends Animal implements Nadador{
    
    @Override
    public void hacerSonido(){
        System.out.println("Glup");
    }
    
    @Override
    public void moverse(){
        System.out.println("Nada");
    }
    
    
    @Override
    public void mostrarInfo(){
        System.out.println("Soy un pez");
    }
    
    @Override
    public void nadar(){
        System.out.println("Nada");
    }
}
