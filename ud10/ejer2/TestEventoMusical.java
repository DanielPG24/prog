/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestEventoMusical {

    public static void main(String[] args) {

        EventoMusical evento = new EventoMusical(
                "Summer Fest",
                LocalDate.of(2026, 7, 15),
                new BigDecimal("250000.75"),
                GeneroMusical.ROCK
        );

        evento.agregarArtista(new Artista("Metal Storm", "España"));
        evento.agregarArtista(new Artista("Electric Band", "USA"));

        System.out.println(evento);
    }
}
