/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public static void main(String[] args) {

        // Crear una lista sin ninguna referencia (nula)
        ArrayList<Persona> lista = null;
        System.out.println("Lista inicial: " + lista);

        // Asignarle una nueva lista vacía
        lista = new ArrayList<>();
        System.out.println("Lista tras inicializar: " + lista);

        // Añadir 3 personas
        lista.add(new Persona("Ana"));
        lista.add(new Persona("Luis"));
        lista.add(new Persona("Carlos"));
        System.out.println("Lista tras añadir 3 personas: " + lista);

        // Obtener la última persona e imprimirla
        Persona ultima = lista.get(lista.size() - 1);
        System.out.println("Ultima persona :" + ultima);
        
        // Modificar el nombre de la primera persona
        lista.get(0).nombre = "Ana Modificada";
        System.out.println("Lista tras modificar primera persona: " + lista);
        
        // Eliminar la persona de la posición central
        int posicionCentral = lista.size() / 2;
        lista.remove(posicionCentral);
        System.out.println("Lista tras eliminar posicion central: " + lista);
        
        // Recorrer la lista con for clásico
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        // Crear nueva persona y comprobar si está en la lista
        Persona nueva = new Persona("Marta");
        lista.add(nueva);
        System.out.println("Lista tras añadir nueva persona: " + lista);
        if (lista.contains(nueva))
            System.out.println("La persona " + nueva + " esta en la lista");
        
        // Vaciar la lista y comprobar si está vacía
        lista.clear();
        if (lista.isEmpty())
            System.out.println("Esta vacia");
        System.out.println(lista);
        
    }
    
    
}

