/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer15;

/**
 *
 * @author 12_1DAW_Alum
 */
public class ComparacionParametros {
    public static void modificarPrimitivo(int numero){
        numero = numero * 2;
        System.out.println("Dentro del método, numero = " + numero);
    }
    
    public static void modificarObjeto(StringBuilder texto){
        texto.append("modificado");
        System.out.println("Dentro del método, texto = " + texto);
    }
    
}
