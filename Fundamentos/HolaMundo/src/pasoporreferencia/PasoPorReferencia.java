
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    
    public static void main(String[] args) {
        //Persona persona1 = new Persona();
        
        Persona persona1 = null;
        
//        persona1.nombre = "Juan";
//        System.out.println("persona1 nombre = " + persona1.nombre);
        
        persona1 = cambiarValor(persona1);
        
//        System.out.println("persona1 cambio de nombre = " + persona1.nombre);
    }
    
    public static Persona cambiarValor (Persona persona) {
        
        if (persona == null) {
            System.out.println("Valor de persona invalido");
            return null;
        }
        
        persona.nombre = "Carla";
        
        return persona;
    }
    
}
