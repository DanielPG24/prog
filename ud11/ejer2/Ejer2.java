/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejer2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;



public class Ejer2 extends Frame {

    public Ejer2() {
        setTitle("Ejercicio 2");
        setSize(300, 200);

        // Posicionamiento absoluto
        setLayout(null);

        Label etiqueta = new Label("Hola Mundo");
        etiqueta.setBounds(50, 50, 80, 20);

        Button boton = new Button("Aceptar");
        boton.setBounds(150, 50, 80, 30);

        add(etiqueta);
        add(boton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Ejer2();
    }
}
