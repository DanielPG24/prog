package prog.ud4.ejer1;


class Persona {
    // Atributos
    String nombre;
    int edad;
    float estatura;
    String apellido;
    DiaDeLaSemana dia;
    Sexo sexo;
    
    
    //Constructor
    Persona(String nombre, int edad, float estatura){
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
    }
    Persona(){
        this.edad = 18;
        this.nombre = "anónimo";
        this.estatura = 1.70f;
    }
    
    Persona(String nombre){
        this.nombre = nombre;
    } 
    
    Persona(String nombre, int edad, float estatura, String apellido){
        this(nombre + apellido, edad, estatura);
        this.apellido = apellido;
    }
    
    Persona(String nombre, int edad, float estatura, String apellido, Sexo sexo){
        this(nombre + apellido, edad, estatura);
        this.sexo = sexo;
    }
    
    public enum Sexo {
    HOMBRE, MUJER, NO_BINARIO
}
    
    //Metodos
    void saludar(){
        System.out.println("Hola");
    }
}
