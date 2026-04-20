import java.util.Objects;

public class Arbol implements Comparable<Arbol> {

    private String especie;
    private int altura;

    // Constructor por defecto
    public Arbol() {
    }

    // Constructor con parámetros
    public Arbol(String especie, int altura) {
        this.especie = especie;
        this.altura = altura;
    }

    // Getters y Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // toString
    @Override
    public String toString() {
        return especie + " (" + altura + "m)";
    }

    // Igualdad SOLO por especie (punto 7)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arbol)) return false;
        Arbol arbol = (Arbol) o;
        return Objects.equals(especie, arbol.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie);
    }

    // Orden natural: alfabético por especie
    @Override
    public int compareTo(Arbol otro) {
        return this.especie.compareTo(otro.especie);
    }
}
