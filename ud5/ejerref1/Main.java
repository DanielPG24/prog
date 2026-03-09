/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejerref1;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    void main(String[] args){
        // Crear al menos tres cuentas bancarias
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 500);
        CuentaBancaria cuenta3 = new CuentaBancaria("Maria", 1500);

        // Mostrar los datos de cada cuenta
        cuenta1.mostrarDatos();
        System.out.println();

        cuenta2.mostrarDatos();
        System.out.println();

        cuenta3.mostrarDatos();
        System.out.println();

        // Mostrar el total de cuentas creadas
        System.out.println("Total de cuentas creadas: " + CuentaBancaria.getTotalCuentas());

        // Comprobar que el contador es compartido
        CuentaBancaria cuenta4 = new CuentaBancaria("Pedro", 300);
        System.out.println("Total de cuentas tras crear otra cuenta: " + CuentaBancaria.getTotalCuentas());
    }
}
