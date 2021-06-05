<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriptlets</title>
    </head>
    <body>
        <h1>JSP con Scriptlets</h1>
        <br>
        <%-- Scriptlet para enviar info al navegador --%>
        <%
            out.print("Saludos desde un Scriptlet");
        %>
        <%-- Scriptlet para manipular los objetos implicitos --%>
        <%
            String nombreAplicacion = request.getContextPath();
            out.print("Nombre de la aplicación: " + nombreAplicacion);
        %>
        <br>
        <%-- Scriptlet con código condicionado --%>
        
        <%
            if(session!=null && session.isNew()) {
        %>
        La sesion sí es nueva
        
        <%
            } else if(session!=null) {
        %>
        La sesion no es nueva
        <%
            }
        %>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
