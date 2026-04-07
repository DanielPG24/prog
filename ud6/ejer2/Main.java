/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud6.ejer2;

import java.util.ArrayList;


/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args){
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Vaca());
        
        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}
