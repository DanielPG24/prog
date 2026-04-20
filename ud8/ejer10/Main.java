import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Carlos", "Lopez", 30));
        personas.add(new Persona("Ana", "Perez", 25));
        personas.add(new Persona("Luis", "Garcia", 40));
        personas.add(new Persona("Marta", null, 20)); // sin apellido

        // Orden por edad
        Collections.sort(personas, ComparadoresPersona.porEdad);
        System.out.println("Orden por edad:");
        System.out.println(personas);

        // Orden por apellido
        Collections.sort(personas, ComparadoresPersona.porApellido);
        System.out.println("\nOrden por apellido:");
        System.out.println(personas);

        // Orden completo
        Collections.sort(personas, ComparadoresPersona.completo);
        System.out.println("\nOrden completo:");
        System.out.println(personas);

        // Orden completo con null primero
        Collections.sort(personas, ComparadoresPersona.completoConNulos);
        System.out.println("\nOrden completo (null primero):");
        System.out.println(personas);
    }
}
