/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejer6;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer6 {
    private static int contador = 0;

	public static void main(String[] args) {
		Frame frame = new Frame("Contador");
		frame.setLayout(new FlowLayout());
		frame.setSize(250, 100);
		frame.setVisible(true);
		
		Button botonMenos = new Button("-1");
		Label etiquetaNumero = new Label("0");
		Button botonMas = new Button("+1");
		
		// 3. Creamos el Escuchador (ActionListener) que compartiran ambos botones
		ActionListener escuchadorCompartido = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Comprobamos que botón hizo clic
				if (e.getSource() == botonMenos) {
					contador = contador - 1;
				} else if (e.getSource() == botonMas) {
					contador = contador + 1;
				}
				// Actualizamos el texto de la etiqueta
				etiquetaNumero.setText(String.valueOf(contador));
			}
		};
		
		// Añadimos los botones al listener
		botonMenos.addActionListener(escuchadorCompartido);
		botonMas.addActionListener(escuchadorCompartido);
		
		frame.add(botonMenos);
		frame.add(etiquetaNumero);
		frame.add(botonMas);
		
	}
}
