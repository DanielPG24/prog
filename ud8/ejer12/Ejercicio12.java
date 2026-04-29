/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer12;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejercicio12 {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        numeros.add(60);
        numeros.add(70);
        numeros.add(80);
        numeros.add(90);
        numeros.add(100);
        
        ListIterator<Integer> it = numeros.listIterator();
        while(it.hasNext()){
            if (it.next() > 50){
                it.set(it.next() * 2);
                System.out.println(it.next());
            }
        }
        
        while(it.hasPrevious()){
            Integer num = it.previous();
            if(num != 100)
                System.out.println(num);
        }
    }
}
