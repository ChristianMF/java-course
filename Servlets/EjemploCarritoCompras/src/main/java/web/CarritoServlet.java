package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Crear o recuperar el objeto http session
        HttpSession sesion = request.getSession();

        //Recuperar artículos previos
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //Verificamos si la lista de articulos existe
        if (articulos == null) {
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Procesar nuevo articulo
        String articuloNuevo = request.getParameter("articulo");

        //Revisar el artículo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        try ( //Imprimir la lista de artículos
                PrintWriter out = response.getWriter()) {
            out.print("<h1>Lista de Articulos</h1>");
            out.print("<br>");

            //Iteramos todos los art.
            articulos.forEach(articulo -> {
                out.print("<li>" + articulo + "</li>");
            });

            //Link para inicio
            out.print("<br>");
            out.print("<a href='/EjemploCarritoCompras'>Regresar al incio</a>");
        }
    }

}
