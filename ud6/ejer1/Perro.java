/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud6.ejer1;

/**
 *
 * @author 12_1DAW_Alum
 */
public abstract class Perro extends Animal implements Corredor{
    
    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }
    
    @Override
    public void moverse(){
        System.out.println("Salta");
    }
    
    
    @Override
    public void mostrarInfo(){
        System.out.println("Soy un perro");
    }
    
    @Override
    public void correr(){
        System.out.println("Corre");
    }
    
    
}
