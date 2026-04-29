/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer13;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args){
        //Crear HashMap
        Map<String, Integer> InventarioFruteria = new HashMap<>();
        
        //Añadir 4
        InventarioFruteria.put("Manzanas", 50);
        InventarioFruteria.put("Platanos", 20);
        InventarioFruteria.put("Naranjas", 35);
        InventarioFruteria.put("Peras", 12);
        
        System.out.println(InventarioFruteria);
        
        //Imprimir por key
        System.out.println(InventarioFruteria.get("Naranjas"));
        
        //Actualizar valor
        InventarioFruteria.put("Manzanas", 100);
        
        //Verficar  
        if (InventarioFruteria.containsKey("Mangos")){
            System.out.println(InventarioFruteria.get("Mangos"));
        } else {
            System.out.println("Producto no encontrado");
        }
        
        //Imprimir
        System.out.println(InventarioFruteria);
        
        //Con for-each
        for(String x : InventarioFruteria.keySet()){
            System.out.println(x + "=" + InventarioFruteria.get(x));
        }
        
        //Con iterador
        
            
    }
}
