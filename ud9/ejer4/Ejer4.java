/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer4;

import java.io.IOException;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer4 {
    public static void main(String args[]) {
        byte b[] = new byte[5];
        try{
            System.in.read(b);
        }catch (IOException ioe){
            System.out.println(ioe);
        }
        String s = new String(b);
        System.out.println(s);
    }
}
