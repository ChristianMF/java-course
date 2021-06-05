package cpjlaboratoriofinal;

import java.util.Scanner;
import mx.com.gm.peliculas.negocio.*;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {

        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPaliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo de películas.\n"
                    + "2. Agregar pelicula. \n"
                    + "3. Listar peliculas. \n"
                    + "4. Buscar pelicula. \n"
                    + "0. Salir \n");

            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("¿Cuál es el nombre de la palicula?");
                    var nombreArchivo = scanner.nextLine();
                    catalogo.agregarPalicula(nombreArchivo);
                    break;
                case 3:
                    catalogo.listarPalicuas();
                    break;
                case 4:
                    System.out.println("¿Cuál es el nombre de la palicula?");
                    nombreArchivo = scanner.nextLine();
                    catalogo.buscarPelicula(nombreArchivo);
                    break;
                case 0:
                    System.out.println("Adios.");
                    break;
                default:
                    System.out.println("Opcion no reconocida.");
                    break;
            }
        }
    }
}
