/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer8;

/**
 *
 * @author 12_1DAW_Alum
 */
public class EmpleadoHoras extends Empleado{
    private double horastrabajadas;
    private double preciohora;
	
    public EmpleadoHoras(String nombre, double horas, double precio) {
        super(nombre);
        this.horastrabajadas = horas;
        this.preciohora = precio;	
    }
		
    public double calcularSalario() {
        return horastrabajadas * preciohora;
    }
}
