/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer8;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    
    public static void main(String[] args) {
        Empleado[] nomina = {  
            new EmpleadoFijo("Manuel Lopez", 2000),
            new EmpleadoHoras("Juan Perez", 40, 10.0)
        };

        for (Empleado e : nomina) {
            System.out.println("Nombre: " + e.nombre + " - Salario: " + e.calcularSalario());
        }
    } 
}
