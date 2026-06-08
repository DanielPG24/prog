/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejer1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Hola Mundo!");
        
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);
        
        Button btnSalir = new Button("Salir");
        
        btnSalir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame)btnSalir.getParent()).dispose();
            }
        });
        
        btnSalir.setBounds(20, 40, 50, 30);
        
        Button btnLimpiar = new Button("Limpiar");
        btnLimpiar.setBounds(75, 40, 60, 30);
        
        TextField txtTexto = new TextField("Escribe algo...");
        txtTexto.setBounds(20, 80, 120, 30);
        
        frame.add(btnSalir);
        frame.add(btnLimpiar);
        frame.add(txtTexto);
        
    }
    
}
