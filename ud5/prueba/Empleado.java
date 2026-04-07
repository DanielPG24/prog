/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.prueba;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Empleado extends Persona{
    private double sueldo;
    private String nombre;
 
    Empleado(double sueldo, String nombre){
        this.sueldo = sueldo;
        super.nombre = nombre;
    }
    
    void mostrarDatos(){
        System.out.println(super.nombre);
        System.out.println(edad);
        System.out.println(sueldo);
    }
}
