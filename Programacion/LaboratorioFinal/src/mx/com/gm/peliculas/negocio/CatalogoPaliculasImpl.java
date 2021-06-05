package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.*;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.*;

public class CatalogoPaliculasImpl implements ICatalogoPeliculas {
    
    //Atributs
    private final IAccesoDatos datos;
    
    //Constructors
    public CatalogoPaliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    
    //Methods
    @Override
    public void agregarPalicula(String nombrePelicula) {
        boolean anexar = false;
        try {
            anexar = this.datos.existe(NOMBRE_RECURSO);
            this.datos.escribir(new Pelicula(nombrePelicula), NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace();
            System.out.println("Error de acceso a datos");
        }
    }

    @Override
    public void listarPalicuas() {
        try {
            var peliculas = this.datos.listar(NOMBRE_RECURSO);
            for(var pelicula: peliculas) {
                System.out.println("pelicula = " + pelicula);
            }
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace();
            System.out.println("Excepcion al listar");
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO, buscar);
            System.out.println("resultado = " + resultado);
        } catch (LecturaDatosEx ex) {
            ex.printStackTrace();
            System.out.println("Excepcion al buscar");
        }
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try{
            if(this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            } else {
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            ex.printStackTrace();
            System.out.println("Excepcion al crear");
        }
    }
}
