/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud8.ejer5;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args){
        //Crear conjunto vacio
        Set<Integer> numerosEnteros = new HashSet<> ();
        
        //Agregar 5 números
        numerosEnteros.add(1);
        numerosEnteros.add(3);
        numerosEnteros.add(6);
        numerosEnteros.add(2);
        numerosEnteros.add(4);
        
        //Imprimir conjunto
        System.out.println(numerosEnteros);//imprime el valor
        

        
        //Número repetido
        numerosEnteros.add(1);
        System.out.println(numerosEnteros);//no permite duplicados
        
        //Null
        numerosEnteros.add(null);
        System.out.println(numerosEnteros);//si permite null
        
        //Nuevo conjunto de primos
        Set<Integer> numerosPrimos = new HashSet<> ();
        numerosPrimos.add(2);
        numerosPrimos.add(3);
        System.out.println(numerosPrimos);//es un nuevo conjunto
        
        //Lista con final
        final List<Integer> lista = new ArrayList<>(numerosEnteros);
        System.out.println(lista);
        
        lista.add(10);//si puede
        lista.remove(1);//si puede
        lista.set(0, 99);//si puede
        
        System.out.println(lista);//"final" no es inmutable
    }
}
