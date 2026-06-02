/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer6;

import prog.ud10.ejer2.*;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "eventos_musicales")
public class EventoMusical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombreEvento;

    @Column(nullable = false)
    private LocalDate fecha;

    @Column(nullable = false)
    private BigDecimal recaudacion;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GeneroMusical genero;

    @ElementCollection
    private List<Artista> artistasConfirmados = new ArrayList<>();

    // Constructor vacío obligatorio para JPA
    public EventoMusical() {
    }

    // Constructor completo
    public EventoMusical(String nombreEvento,
                          LocalDate fecha,
                          BigDecimal recaudacion,
                          GeneroMusical genero) {

        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
        this.genero = genero;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

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

    public GeneroMusical getGenero() {
        return genero;
    }

    public void setGenero(GeneroMusical genero) {
        this.genero = genero;
    }

    public List<Artista> getArtistasConfirmados() {
        return artistasConfirmados;
    }

    public void setArtistasConfirmados(List<Artista> artistasConfirmados) {
        this.artistasConfirmados = artistasConfirmados;
    }

    // Método auxiliar
    public void agregarArtista(Artista artista) {
        artistasConfirmados.add(artista);
    }

    @Override
    public String toString() {
        return "EventoMusical{" +
                "id=" + id +
                ", nombreEvento='" + nombreEvento + '\'' +
                ", fecha=" + fecha +
                ", recaudacion=" + recaudacion +
                ", genero=" + genero +
                ", artistasConfirmados=" + artistasConfirmados +
                '}';
    }
}
