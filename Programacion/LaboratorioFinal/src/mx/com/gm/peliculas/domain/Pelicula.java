package mx.com.gm.peliculas.domain;

public class Pelicula {

    //Atributs
    private String nombre;

    //Constructors
    public Pelicula() {}

    public Pelicula(String nombre) {
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
        sb.append(this.nombre);
        return sb.toString();
    }
    
}
