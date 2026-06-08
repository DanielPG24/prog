/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        Frame ventana = new Frame("Eventos");
        ventana.setSize(300,150);
        ventana.setLayout(new FlowLayout());
        
        Button miBoton = new Button("Click aqui");
        
        ventana.add(miBoton);
        
        //ActionListener escuchadorBoton = new MiListener();
        //miBoton.addActionListener(escuchadorBoton);
        
        miBoton.addActionListener(new MiListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Boton pulsado");
            }
        });
        
        ventana.setVisible(true);
    }
}
