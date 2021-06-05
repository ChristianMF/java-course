package domain;

public enum TipoEscritura {
    
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    //Atributs
    private final String descripcion;
    
    //Constructors
    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Getters and Setters
    public String getDescripcion() {
        return this.descripcion;
    }
    
    
    
}
