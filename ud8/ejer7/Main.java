import java.util.Set;
import java.util.LinkedHashSet;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        // 1. Crear un conjunto vacío usando la interfaz
        Set<String> alumnos = new LinkedHashSet<>();

        // 2. Agregar nombres
        alumnos.add("Ana");
        alumnos.add("Luis");
        alumnos.add("Marta");
        alumnos.add("Carlos");

        // 3. Imprimir el conjunto
        System.out.println("Contenido del conjunto:");
        System.out.println(alumnos);

        // 4. Añadir un nombre repetido
        System.out.println("\nAñadiendo 'Ana' otra vez...");
        alumnos.add("Ana");
        System.out.println(alumnos);

        // 5. Añadir null
        System.out.println("\nAñadiendo null...");
        alumnos.add(null);
        System.out.println(alumnos);

        // 6. Recorrer el conjunto en orden de inserción
        System.out.println("\nAlumnos con prefijo:");
        for (String alumno : alumnos) {
            System.out.println("D. " + alumno);
        }

        // Comparación con HashSet
        Set<String> alumnosHash = new HashSet<>();
        alumnosHash.add("Ana");
        alumnosHash.add("Luis");
        alumnosHash.add("Marta");
        alumnosHash.add("Carlos");

        System.out.println("\nOrden usando HashSet:");
        for (String alumno : alumnosHash) {
            System.out.println(alumno);
        }
    }
}