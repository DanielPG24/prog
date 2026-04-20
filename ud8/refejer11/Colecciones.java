import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Colecciones {
    public static void main(String[] args) {

        // 1. Lista con orden de inserción y permitiendo repetidos
        List<Integer> lista = new ArrayList<>();

        lista.add(3);
        lista.add(8);
        lista.add(5);
        lista.add(8); // repetido
        lista.add(2);

        // 2. Imprimir contenido
        System.out.println("Lista original:");
        System.out.println(lista);

        // 3. Eliminar impares y añadir 8 al principio
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            Integer num = it.next();
            if (num % 2 != 0) {
                it.remove();
            }
        }

        lista.add(0, 8); // añadir al inicio

        System.out.println("\nLista sin impares y con 8 al inicio:");
        System.out.println(lista);

        // 4. Nueva colección sin repetidos
        Set<Integer> sinRepetidos = new HashSet<>(lista);

        // 5. Imprimir
        System.out.println("\nConjunto sin repetidos:");
        System.out.println(sinRepetidos);

        // 6. Nueva colección con orden natural
        Set<Integer> ordenNatural = new TreeSet<>(sinRepetidos);

        // 7. Imprimir
        System.out.println("\nConjunto ordenado (orden natural):");
        System.out.println(ordenNatural);
    }
}
