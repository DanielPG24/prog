/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ud5.ejer2;

/**
 *
 * @author 12_1DAW_Alum
 */
public class Ciudad {
    public static void main (String[] args){
            Persona juan = new Persona("Juan", 20, 1.8f, "Perez", Persona.Sexo.MASCULINO);
            juan.setNombre("Juana");
            juan.setApellido("Perez");
            System.out.println(juan.getNombre());
            System.out.println(juan.getApellido());
            
            juan.setSexo(Persona.Sexo.FEMENINO);
            System.out.println(juan.getSexo());
            
            juan.setEdad(-1);
            System.out.println(juan.getEdad());
        } 
}
