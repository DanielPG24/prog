/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud7.ejer4;

import java.util.Scanner;
import prog.ud7.ejer5.Main.NumeroRepetido;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Main {
    public static void main(String[] args) {
        try {
            introduceEnteros();
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin");
        }
        System.out.println("Finalisimo");
    }
    
    private static void introduceEnteros() throws IllegalArgumentException{
        int[] lista = new int[5];
        lista[0] = 0;
        lista[1] = 12;
        lista[2] = 20;
        lista[3] = 13;
        lista[4] = 40;
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (estaEnLista(lista, num))
            throw new NumeroRepetido("Numero repetido");
        
        for (int e: lista) {
            System.out.println(e);
        }
    }
    
    private static boolean estaEnLista(int[] lista, int num){
        for (int e: lista){
          if (e == num)
            return true;
        }
        return false;  
        
    }

}
