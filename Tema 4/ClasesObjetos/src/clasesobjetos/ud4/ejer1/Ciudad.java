package prog.ud4.ejer1;


public class Ciudad {
    public static void main (String[] args){
      
        Persona manolo;
        manolo = new Persona("Manolo", 23, 1.85f);
        
        //manolo.nombre = "Manolo";
        //manolo.edad = 23;
        //manolo.estatura = 1.85f;
        Persona david = new Persona("David", 37, 1.85f, "Alvarez", Persona.Sexo.HOMBRE);
        //david.nombre = "David";
        //david.edad = 37;
        //david.estatura = 1.79f;
        Persona fernando = new Persona();
        //fernando.nombre = "Fernando";
        //fernando.edad = 12;
        //fernando.estatura = 1.52f;
        
        System.out.println(manolo);
        
        System.out.println("Hola soy " + manolo.nombre + " y tengo " + manolo.edad + " annos, mido " + manolo.estatura);
        System.out.println("Hola soy " + david.nombre + " y tengo " + david.edad + " annos, mido " + david.estatura + ", soy " + david.sexo);
        System.out.println("Hola soy " + fernando.nombre + " y tengo " + fernando.edad + " annos, mido " + fernando.estatura);
        
        //Parte 4
        
        Persona paco = new Persona("Paco", 30, 1.76f);
        Persona pepe = new Persona("Pepe", 43, 1.72f);
        
        System.out.println("Hola soy " + pepe.nombre + " y tengo " + pepe.edad + " annos, mido " + pepe.estatura);
        System.out.println("Hola soy " + paco.nombre + " y tengo " + paco.edad + " annos, mido " + paco.estatura);
        
        Persona marcos = new Persona();
        Persona javi = new Persona();
        
        System.out.println("Hola soy " + marcos.nombre + " y tengo " + marcos.edad + " annos, mido " + marcos.estatura);
        System.out.println("Hola soy " + javi.nombre + " y tengo " + javi.edad + " annos, mido " + javi.estatura);
        
        Persona pedro = new Persona();
        } 
}
