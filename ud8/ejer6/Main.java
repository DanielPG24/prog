import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //1
        Scanner sc = new Scanner(System.in);
        HashSet<String> paises = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un país: ");
            String pais = sc.nextLine();

            if (paises.contains(pais)) {
                System.out.println("¡Ese ya pasó por la frontera!");
            } else {
                paises.add(pais);
            }
        }

        System.out.println("Número de países únicos: " + paises.size());

        //2
        TreeSet<String> juegos = new TreeSet<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un juego: ");
            juegos.add(sc.nextLine());
        }
        
        System.out.println("\nJuegos ordenados alfabéticamente:");
        for (String juego : juegos) {
            System.out.println(juego);
        }

        //3
        LinkedHashSet<String> colores = new LinkedHashSet<>();
        
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Amarillo");
        colores.add("Negro");
        
        System.out.println("Colores en orden de inserción:");
        for (String color : colores) {
            System.out.println(color);
        }
    }
}