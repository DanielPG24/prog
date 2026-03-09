/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer2;

import prog.ud4.ejer1.DiaDeLaSemana;

class Persona {
    // Atributos
    private String nombre;
    private int edad;
    private float estatura;
    private String apellido;
    private DiaDeLaSemana dia;
    private Sexo sexo;
    
    
    //Constructor
    Persona(String nombre, int edad, float estatura){
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
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
    MASCULINO, FEMENINO, NO_BINARIO
}
    
    //Metodos
    void saludar(){
        System.out.println("Hola");
    }
    
    public float getEstatura(){
        return estatura;
    }
    
    public void setEstatura(int estatura){
        this.estatura = estatura;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        if (edad < 0){
            System.out.println("Incorrecto");
        }
        this.edad = edad;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public Sexo getSexo(){
        return sexo;
    }
    
    public void setSexo(Sexo sexo){
        this.sexo = sexo;
    }
}

