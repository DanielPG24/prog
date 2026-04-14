import java.util.Set;
import java.util.TreeSet;

public class ConjuntoNumeros {
    public static void main(String[] args) {

        // Crear conjunto basado en árbol binario
        Set<Integer> numeros = new TreeSet<>();

        // Añadir números en orden aleatorio
        numeros.add(30);
        numeros.add(10);
        numeros.add(20);

        // Recorrer e imprimir (ordenados automáticamente)
        System.out.println("Números ordenados:");
        for (Integer n : numeros) {
            System.out.println(n);
        }

        // Crear conjunto basado en árbol binario
        Set<String> alumnos = new TreeSet<>();

        // Añadir nombres en orden aleatorio
        alumnos.add("Luis");
        alumnos.add("Ana");
        alumnos.add("Carlos");

        // Recorrer e imprimir (orden alfabético)
        System.out.println("Alumnos ordenados:");
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}