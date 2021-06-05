package genericos;

public class ClaseGenerica<T> {
    
    //Atributs
    private T objeto;
    
    //Constructors
    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    //Methods
    public void obtenerTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
    
}
