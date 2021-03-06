package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        //Contador
        int contador = 0;
        
        //Revisar
        Cookie cookies[] = request.getCookies();
        
        if(cookies != null) {
           for(Cookie c: cookies) {
               if(c.getName().equals("contadorVisitas")) {
                   contador = Integer.parseInt(c.getValue());
               }
           }
        }
        
        //Incrementar el contador en uno
        contador++;
        
        //Agrgamos al navegador
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));
        
        //La cookie estará en Cliente por una hora (3600 segundo)
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //Mandamos el mensaje a navegador
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        out.print("Contador de visitas de cada Cliente: " + contador);
        
    }
    
}
