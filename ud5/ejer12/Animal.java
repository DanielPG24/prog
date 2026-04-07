/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer12;

/**
 *
 * @author 12_1DAW_Alum
 */
public abstract class Animal {
    protected String nombre;
    protected int edad;
    
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarInformacion(){
        System.out.println(nombre);
        System.out.println(edad);
    }
    
    public abstract void hacerSonido();
    
    public abstract String moverse();
}
