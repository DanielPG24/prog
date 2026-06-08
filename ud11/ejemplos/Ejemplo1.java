/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud11.ejemplos;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        Frame ventana = new Frame();
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        
        Menu menu = new Menu("Fichero");
        MenuBar barra = new MenuBar();
        MenuItem abrir = new MenuItem("Abrir");
        MenuItem salir = new MenuItem("Salir");
        menu.add(abrir);
        menu.add(salir);
        
        barra.add(menu);
        ventana.setMenuBar(barra);
    }
}
