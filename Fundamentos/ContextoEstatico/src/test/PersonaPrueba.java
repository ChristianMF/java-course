
package test;

import domain.Persona;

public class PersonaPrueba {
    
    private static int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        imprimir(persona1);
        
        Persona persona2 = new Persona("Carla");
        imprimir(persona2);
        
        contador = 1;
        
    }
    
    public static void imprimir(Persona persona) {
        System.out.println("persona = " + persona);
    }
    
}
