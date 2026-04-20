import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Jardin {
    public static void main(String[] args) {

        // Colección de árboles (sin duplicados por especie)
        Set<Arbol> arboles = new HashSet<>();

        // Añadir árboles
        arboles.add(new Arbol("Álamo", 4));
        arboles.add(new Arbol("Olivo", 3));
        arboles.add(new Arbol("Olivo", 4));
        arboles.add(new Arbol("Higuera", 2));
        arboles.add(new Arbol("Naranjo", 2));
        arboles.add(new Arbol("Naranjo", 2));
        arboles.add(new Arbol("Naranjo", 2));

        System.out.println("HashSet (sin duplicados por especie):");
        System.out.println(arboles);


        // Colección ordenada alfabéticamente
        Set<Arbol> arbolesOrdenados = new TreeSet<>(arboles);

        System.out.println("\nTreeSet (orden alfabético):");
        System.out.println(arbolesOrdenados);
    }
}
