/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer11;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String [] args){
        Libro l1 = new Libro("Don Quijote", "Miguel de Cervantes", "12345", 1605);
        Libro l2 = new Libro("El Quijote Moderno", "Autor Desconocido", "12345", 2020);
        Libro l3 = new Libro("Cien años de soledad", "Gabriel García Márquez", "67890", 1967);

        // Imprimir libros
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(l3.toString());

        // Comparar libros con mismo ISBN
        System.out.println("libro1 equals libro2: " + l1.equals(l2));

        // Comparar libros con diferente ISBN
        System.out.println("libro1 equals libro3: " + l1.equals(l3));
    }
}
