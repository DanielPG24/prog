/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud9.ejer11;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.File;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer11 {
    public static void main(String[] args) {
        try{
            File file = new File("record.txt");
            RandomAccessFile record = new RandomAccessFile("record.txt", "rw");
            record.writeBytes("Nivel:001");
            record.seek(6);
            record.writeBytes("005");
            System.out.println(file.getAbsolutePath());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
