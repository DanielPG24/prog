/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.prueba;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Persona {
    protected String nombre;
    protected int edad;
    double estatura;
    
    void mostrarDatos(){
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(estatura);
    }
    
    public void presentarse(){
        System.out.println("Hola me llamo " + nombre);
    }
}
