/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.ejer2;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Confesionario {
    void main(String[] args){
        Vehiculos v1 = new Vehiculos("1234ABC", "Toyota", 2010, 12000, Vehiculos.TipoVehiculo.TURISMO);
        Vehiculos v2 = new Vehiculos("5678DEF", "Yamaha", 2018, 6000, Vehiculos.TipoVehiculo.MOTOCICLETA);
        Vehiculos v3 = new Vehiculos("9012GHI", "Volvo", 2005, 25000, Vehiculos.TipoVehiculo.CAMION);
        
        System.out.println("INFORMACION ANTES DEL DESCUENTO");
        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();
        
        System.out.println("El vehiculo 1 es antiguo? " + v1.esAntiguo());
        System.out.println("Marca del vehiculo 2: " + v2.marca);
        
        
        Vehiculos referencia = v1;
        referencia.aplicarDescuento(10);

        System.out.println("Despues de aplicar descuento usando una referencia:");
        v1.mostrarInformacion();

        
        v1.aplicarDescuento(5);
        v2.aplicarDescuento(10);
        v3.aplicarDescuento(15);
        
        System.out.println("INFORMACION DESPUES DEL DESCUENTO");
        v1.mostrarInformacion();
        v2.mostrarInformacion();
        v3.mostrarInformacion();
    }
}
