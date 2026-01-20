/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud4.ejer2;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Vehiculos {
    //Atributos
    String matricula;
    String marca;
    int anioFabricacion;
    double precio;
    TipoVehiculo tipo;
    
    enum TipoVehiculo{
        TURISMO, MOTOCICLETA, CAMION
    }
    
    Vehiculos(String matricula, String marca, int anioFabricacion, double precio){
        this.matricula = matricula;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.precio = precio;
    }
    
    Vehiculos(String matricula, String marca, int anioFabricacion, double precio, TipoVehiculo tipo){
        this(matricula, marca, anioFabricacion, precio);
        this.tipo = tipo;
    }
    
    //Metodos
    void mostrarInformacion(){
        System.out.println("-" + matricula);
        System.out.println("-" + marca);
        System.out.println("-" + anioFabricacion);
        System.out.println("-" + precio);
        System.out.println("-" + tipo);
    }
    
    boolean esAntiguo(){
        int anioActual = 2026;
        return (anioActual - anioFabricacion) > 10;
    }
    
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
    }
}
