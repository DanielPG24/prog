/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer4;

/**
 *
 * @author 12_1DAW_Alum
 */
public class main {
    public static void main(String[] args){
        ContadorObjetos contador1 = new ContadorObjetos();
        ContadorObjetos contador2 = new ContadorObjetos();
        ContadorObjetos contador3 = new ContadorObjetos();
        
        contador3.totalObjetos = 0;
        contador3.mostrarTotalObjetos();
        contador1.mostrarTotalObjetos();
        contador2.mostrarTotalObjetos();
    }
}
