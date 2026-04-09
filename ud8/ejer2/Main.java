/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer2;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author 12_1DAW_Alum
 */
class Persona {
    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return nombre;
    }
}

public class Main {
    
    public static void main(String[] args){
        
        ArrayList lista = new ArrayList();
        
        lista.add(new Persona("Ana"));
        lista.add(new Persona("Luis"));
        lista.add(new Persona("Carlos"));
        
        //1
        LinkedList copia = new LinkedList(lista);
        System.out.println(copia);
        
        //2
        Persona primera = (Persona) lista.getFirst();
        Persona ultima = (Persona) lista.getLast();

        lista.set(0, ultima);
        lista.set(lista.size() - 1, primera);

        System.out.println(lista);
    }
}
