/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer3;

import java.math.BigDecimal;
import java.time.LocalDate;

import prog.ud10.ejer1.EventoMusical;
import prog.ud10.ejer2.Artista.GeneroMusical;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer3 {
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

        System.out.println(evento);
        
        //Ejercicio 3
        EventoMusical conciertoEstopa2 = new EventoMusical("Puro Latino", new Date(2026, 7, 12), new BigDecimal (10000), GeneroMusical.POP);
        conciertoEstopa.agregarArtista(estopa);
     }
}
