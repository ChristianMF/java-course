package domain;

public class Persona {
    
    //Atributs
    private String nombre;
    
    //Constructor
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    //Getters and Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
    
}
