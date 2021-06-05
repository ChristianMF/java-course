
package domain;

public class Persona {
    
    //Atributs
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    //Costructor
    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignar nuevo valor ala variable id
        this.idPersona = Persona.contadorPersonas;
    }
    
    //Getters and Setters
    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        Persona.contadorPersonas = aContadorPersonas;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
}
