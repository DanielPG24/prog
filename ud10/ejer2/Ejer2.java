/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer2;

import java.math.BigDecimal;
import java.time.LocalDate;

import prog.ud10.ejer1.EventoMusical;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer2 {
    public static void main(String[] args) {
        
        //Ejercicio 1
        EventoMusical evento = new EventoMusical(
                "Festival Primavera",
                LocalDate.of(2026, 5, 20),
                new BigDecimal("125000.50")
        );

        System.out.println(evento);
        
        //Ejercicio 2
        EventoMusical conciertoEstopa = new EventoMusical();
        
        Artista estopa = new Artista();
        estopa.setNombre("Estopa");
        estopa.setPais("España");
		estopa.getNombre();
		estopa.getPais();
        
    }
}
