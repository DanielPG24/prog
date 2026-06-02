/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer1;

import java.time.LocalDate;
import java.math.BigDecimal;
/**
 *
 * @author 12_1DAW_Alum
 */
public class Ejer1 {
    public static void main(String[] args) {

        EventoMusical evento = new EventoMusical(
                "Festival Primavera",
                LocalDate.of(2026, 5, 20),
                new BigDecimal("125000.50")
        );

        System.out.println(evento);
    }
}
