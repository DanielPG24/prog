import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSetet;

public class Main {
    public static void main(String[] args) {

        // 1. Colección sin duplicados y orden natural
        Set<Persona> personas = new TreeSet<>();

        personas.add(new Persona("Carlos", "Lopez"));
        personas.add(new Persona("Ana", "Perez"));
        personas.add(new Persona("Luis", "Garcia"));
        personas.add(new Persona("Ana", "Perez")); // repetido

        System.out.println("TreeSet (orden natural, sin duplicados):");
        System.out.println(personas);

        // 2. Comprobar igualdad
        Persona p1 = new Persona("Ana", "Perez");
        Persona p2 = new Persona("Ana", "Perez");

        System.out.println("\n¿p1 equals p2?: " + p1.equals(p2));

        // 3. Comprobar hashCode
        System.out.println("¿Mismo hashCode?: " + (p1.hashCode() == p2.hashCode()));

        // 4. Copiar a colección con orden de inserción
        Set<Persona> insercion = new LinkedHashSet<>();

        insercion.add(new Persona("Carlos", "Lopez"));
        insercion.add(new Persona("Ana", "Perez"));
        insercion.add(new Persona("Luis", "Garcia"));

        System.out.println("\nLinkedHashSet (orden de inserción):");
        System.out.println(insercion);
    }
}

