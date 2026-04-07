/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.prueba;

/**
 *
 * @author 12_1DAW_Alum
 */
public class App {
    public static void main(String[] args){
        Alumnos alumno = new Alumnos();
        alumno.nombre = "Fran";
        alumno.edad = 18;
        alumno.setCiclo("DAW");
        alumno.presentarse();
        alumno.estudiar();
        
        Alumnos alumno2 = new Alumnos("Juan", "DAW");
        alumno2.presentarse();
        
        Empleado e = new Empleado(2000, "Pedro");
    } 
    
}
