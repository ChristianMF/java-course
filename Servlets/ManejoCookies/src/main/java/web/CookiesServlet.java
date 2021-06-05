package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //Cuando se visita por primera vez
        boolean usuario = true;
        Cookie cookies[] = request.getCookies();
        String mensaje;
        
        //Buscamos si ya existe una Cookie = visitanteRecurrente
        if(cookies != null) {
            for(Cookie c: cookies) {
                if(c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    usuario = false;
                    break;
                }
            }
        }
        
        if(usuario) {
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            response.addCookie(visitanteCookie);
            mensaje = "Gracias por visitar nuestro sitio por primera vez";
        } else {
            mensaje = "Gracias por visitar nuevamente nuestro sitio";
        }
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.print("Mensaje: " + mensaje);
        out.close();
        
    }
    
}
