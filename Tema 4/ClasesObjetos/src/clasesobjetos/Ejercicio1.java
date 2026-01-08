package clasesobjetos;

public class Ejercicio1 {
    // Atributos
    String nombre;
    int edad;
    double estatura;
    
    //Metodos
    void saludar(){
        System.out.println("Hola. Me llamo " + nombre);
    }
    
    void cumplirAños(){
        edad = edad + 1;
    }
    
    void crecer(double incremento){
        estatura = estatura + incremento;
    }
    
    void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}
