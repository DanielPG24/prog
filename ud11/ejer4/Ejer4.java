/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejer4;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer4 {
    public static void main(String[] args) { 
        Frame frame = new Frame("Ascensor");
	frame.setLayout(new GridLayout(2,2));
	frame.setSize(300, 180);
	frame.setVisible(true);
        
        Button botonP1 = new Button("P1");
        Button botonP2 = new Button("P2");
        Button botonP3 = new Button("P3");
        Button botonP4 = new Button("P4");
        
        frame.add(botonP1);
        frame.add(botonP2);
        frame.add(botonP3);
        frame.add(botonP4);
    }
}
