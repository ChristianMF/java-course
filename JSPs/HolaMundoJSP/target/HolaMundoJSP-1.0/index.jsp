<%-- 
    Document   : index
    Created on : 2 mar. 2021, 18:20:26
    Author     : root
--%>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola mundo JSPs</title>
    </head>
    <body>
        <h1>Hola mundo JSPs</h1>
        <ul>
            <li> <%out.print("Hola mundo con Scriplets");%> </li>
            <li>${"Hola mundo con Espression Language (EL)"}</li>
            <li> <%= "Hola mundo con Expresiones"  %> </li>
            <li> <c:out value="Hola con  JSTL"/> </li>
        </ul>
    </body>
</html>
