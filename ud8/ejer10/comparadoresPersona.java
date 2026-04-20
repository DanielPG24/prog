import java.util.Comparator;

public class ComparadoresPersona {

    // 🔹 Comparador por edad
    public static Comparator<Persona> porEdad = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return Integer.compare(p1.getEdad(), p2.getEdad());
        }
    };

    // 🔹 Comparador por apellido
    public static Comparator<Persona> porApellido = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.getApellido().compareTo(p2.getApellido());
        }
    };

    // 🔹 Comparador por apellido, nombre y edad
    public static Comparator<Persona> completo = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {

            int cmp = p1.getApellido().compareTo(p2.getApellido());

            if (cmp == 0) {
                cmp = p1.getNombre().compareTo(p2.getNombre());
            }

            if (cmp == 0) {
                cmp = Integer.compare(p1.getEdad(), p2.getEdad());
            }

            return cmp;
        }
    };

    // 🔹 Ampliación: los que no tienen apellido primero
    public static Comparator<Persona> completoConNulos = new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {

            // Manejo de null o vacío
            if (p1.getApellido() == null && p2.getApellido() != null) return -1;
            if (p1.getApellido() != null && p2.getApellido() == null) return 1;

            if (p1.getApellido() == null && p2.getApellido() == null) return 0;

            int cmp = p1.getApellido().compareTo(p2.getApellido());

            if (cmp == 0) {
                cmp = p1.getNombre().compareTo(p2.getNombre());
            }

            if (cmp == 0) {
                cmp = Integer.compare(p1.getEdad(), p2.getEdad());
            }

            return cmp;
        }
    };
}
