<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSLT Core</title>
    </head>
    <body>
        <h1>JSLT Core (JSP Standard Tag Library)</h1>
        <%--Manupulacion de variables--%>
        <%--Se define la variable--%>
        <c:set var="nombre" value="Ernesto" />
        <%--Se despliega el valor de la variable--%>
        Variable nombre: <c:out value="${nombre}"/>
        <br/>
        <br/>
        Variable con c�digo html:
        <c:out value="<h4>Hola</h4>"escapeXml="false"/>
        <br/>
        <br/>
        <%--C�digo condicionado--%>
        <c:set var="bandera" value="true"/>

        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>
        <%--C�digo condicionado, uso de switch--%>
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br/>
                    Opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br/>
                    Opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    <br/>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if>
        <%--Iteracion de un arreglo--%>
        <%
            String nombres[] = {"Claudia","Pedro","Juan"};
            request.setAttribute("nombres", nombres);
        %>
        <br/>
        Lista de Nombres:
        <br/>
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>Nombre: ${persona}</li>
            </c:forEach>
        </ul>
        <a href="index.jsp">Regresar al inicio</a>
    </body>
</html>
