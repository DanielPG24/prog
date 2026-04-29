/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ClubDeLectura {

    private Set<String> biblioteca;

    public ClubDeLectura() {
        this.biblioteca = new HashSet<>();
    }

    public boolean agregarLibro(String libro) {
        return libros.add(libro);
    }

    public void mostrarLibrosForEach() {
        System.out.println("\nLista de libros (for-each):");
        for (String l : libros) {
            System.out.println("- " + l);
        }
    }

    public void mostrarLibrosIterator() {
        System.out.println("\nLista de libros (Iterator):");
        Iterator<String> it = libros.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next());
        }
    }
}

