/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejer5;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer5 {
    public static void main(String[] args) {
        Frame frame = new Frame();
		frame.setVisible(true);
		frame.setSize(300, 300);
		
		Label etiqueta = new Label("Texto de prueba");
		etiqueta.setAlignment(Label.CENTER);
		
		MenuBar barra = new MenuBar();
		
		Menu menu = new Menu("Estilo");
		MenuItem negrita = new MenuItem("Negrita");
		MenuItem normal = new MenuItem("Normal");
		
		Menu menu2 = new Menu("Color");
		MenuItem rojo = new MenuItem("Rojo");
		MenuItem azul = new MenuItem("Azul");
		MenuItem negro = new MenuItem("Negro");
		
		
		menu2.add(negro);
		menu2.add(azul);
		menu2.add(rojo);
		barra.add(menu2);
		
		menu.add(negrita);
		menu.add(normal);
		barra.add(menu);
		
		frame.setMenuBar(barra);
		frame.add(etiqueta);

    }
}
