/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    
    public static void main(String[] args){
        HashMap<String, Integer> aleatorio = new HashMap<>();
        LinkedHashMap<String, Integer> insercion = new LinkedHashMap<>();
        TreeMap<String, Integer> alfabetico = new TreeMap<>();  
        
        aleatorio.put("Zoe", 85);
        aleatorio.put("Bernat", 92);
        aleatorio.put("Ana", 78);
        aleatorio.put("Mario", 88);
        
        insercion.putAll(aleatorio);
        
        alfabetico = new TreeMap<>(aleatorio);
        
        mostrarMapa(aleatorio, "");
    }
    
    private static void mostrarMapa(Map<String, Integer> mapa, String tipo){
        Iterator<Map.Entry<String, Integer>> it = mapa.entrySet().iterator();
        while (it.hasNext()){
            Entry<String, Integer> participantes = it.next();
            System.out.println(participantes);
        }
    }
    
}
