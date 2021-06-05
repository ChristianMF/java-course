package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.excepciones.*;

public interface ICatalogoPeliculas {
    
    //Atributs
    String NOMBRE_RECURSO = "peliculas.txt";
    
    //Methods
    void agregarPalicula(String nombrePelicula);
    
    void listarPalicuas();
    
    void buscarPelicula(String buscar);
    
    void iniciarCatalogoPeliculas();
    
}
