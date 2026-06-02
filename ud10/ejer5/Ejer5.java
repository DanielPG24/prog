/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud10.ejer5;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

import prog.ud10.ejer1.EventoMusical;
import prog.ud10.ejer2.Artista;

public class Ejer5 {

    public static void main(String[] args) {
        
        //Ejercicio 1
        EventoMusical evento = new prog.ud10.ejer1.EventoMusical(
                "Festival Primavera",
                LocalDate.of(2026, 5, 20),
                new BigDecimal("125000.50")
        );

        System.out.println(evento);
        
        //Ejercicio 2
        EventoMusical conciertoEstopa = new prog.ud10.ejer1.EventoMusical();
        
        Artista estopa = new prog.ud10.ejer2.Artista();
        estopa.setNombre("Estopa");
        estopa.setPais("España");
		estopa.getNombre();
		estopa.getPais();

        System.out.println(evento);
        
        //Ejercicio 3
        EventoMusical conciertoEstopa2 = new prog.ud10.ejer1.EventoMusical("Puro Latino", new Date(2026, 7, 12), new BigDecimal (10000), GeneroMusical.POP);
        conciertoEstopa.agregarArtista(estopa);
        
        //Ejercicio 4
        javax.persistence.EntityManagerFactory emf = javax.persistence.Persistence.createEntityManagerFactory("objectdb:$objectdb/db/eventos.odb");

        javax.persistence.EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        // Guardamos los eventos en la base de datos
        em.persist(evento);
        em.persist(conciertoEstopa2);
        // Confirmamos cambios
        em.getTransaction().commit();
        
        //Ejercicio 5
        EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("EventosPU");
        EntityManager em2 = emf2.createEntityManager();

        // 1. Buscar por identificador (find)

        EventoMusical evento1 = em.find(EventoMusical.class, 1L);

        System.out.println("Evento obtenido por ID:");
        System.out.println(evento1);

        // 2. JPQL con query estática


        TypedQuery<EventoMusical> queryEstatica = em.createQuery(
                        "SELECT e FROM EventoMusical e WHERE e.id = 2",
                        EventoMusical.class
                );

        EventoMusical evento2 = queryEstatica.getSingleResult();

        System.out.println("\nEvento obtenido con JPQL estática:");
        System.out.println(evento2);

        // 3. JPQL con query dinámica

        Long idBuscado = 2L;

        TypedQuery<EventoMusical> queryDinamica =
                em2.createQuery(
                        "SELECT e FROM EventoMusical e WHERE e.id = :id",
                        EventoMusical.class
                );

        queryDinamica.setParameter("id", idBuscado);

        EventoMusical evento3 = queryDinamica.getSingleResult();

        System.out.println("\nEvento obtenido con JPQL dinámica:");
        System.out.println(evento3);

        // Cerrar recursos
        em.close();
        emf.close();
    }
}
