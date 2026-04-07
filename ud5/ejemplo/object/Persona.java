/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejemplo.object;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Persona {
    public String nombre;
    
    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return "Persona: " + nombre;
    }
    
    @Override
    public boolean equals(Object obj){
        return this.nombre == ((Persona)obj).nombre;
    }
    
}
