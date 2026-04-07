/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer7;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    
    Vehiculo(String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    
    Vehiculo(){
        
    }
    
    public void mostrarDetalles() {
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
    public String getMarca(){
        return marca;
    }     
}
