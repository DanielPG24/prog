/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer1;

import java.time.LocalDate;
import java.math.BigDecimal;

public class EventoMusical {

    private String nombreEvento;
    private LocalDate fecha;
    private BigDecimal recaudacion;

    // Constructor vacío
    public EventoMusical() {
    }

    // Constructor con parámetros
    public EventoMusical(String nombreEvento, LocalDate fecha, BigDecimal recaudacion) {
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    // Getters y Setters
    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }

    // Método toString
    @Override
    public String toString() {
        return "EventoMusical{" +
                "nombreEvento='" + nombreEvento + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                '}';
    }
}
    
    

