package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. Procesamos parametros
        String accion = request.getParameter("accion");
        
        //2. JavaBeans
        Rectangulo recRequest = new Rectangulo(1,2);
        Rectangulo recSession = new Rectangulo(3,4);
        Rectangulo recApplication = new Rectangulo(5,6);
        
        //3. Agregamos el JavaBean a algun alcance
        //Revisamos la accion proporcionada
        if("agregaVariables".equals(accion)) {
            //alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSession);
            //alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recApplication);
            //mensaje para saber que se ejecuto
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            //4. Redireccionar al jsp que despliega las variables
            request.getRequestDispatcher("index.jsp").forward(request,response);
        } else if("listarVariables".equals(accion)) {
            //4. Redireccionar al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request,response);
        } else {
            //4. Redireccionar al jsp de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
        
        
        
    }
    
}
