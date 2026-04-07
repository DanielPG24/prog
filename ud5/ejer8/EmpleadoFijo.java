/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer8;

/**
 *
 * @author 12_1DAW_Alum
 */
public class EmpleadoFijo extends Empleado{
    private double salarioMensual;
	
    public EmpleadoFijo(String nombre, double salarioMensual) {
	super(nombre);
	this.salarioMensual = salarioMensual;
    }
    
    public double calcularSalario() {
        return salarioMensual;
    }
}
