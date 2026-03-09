/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.prueba;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Alumnos extends Persona{
    private String ciclo;
    
    Alumnos(String nombre, String ciclo){
        this.nombre = nombre;
        this.ciclo = ciclo;
    }
    
    Alumnos(){
        
    }
    
    public void estudiar(){
        System.out.println("Estoy estudiando " + ciclo);
    }
    
}
