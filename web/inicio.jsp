<%@page import="cl.Negocio.Usuario"%>
<%@page import="cl.accesodato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% HttpSession sesion = request.getSession();
    if (sesion.getAttribute("Conectado") == null || sesion.getAttribute("Conectado").equals("false")) {
        response.sendRedirect("index.jsp");

    } else {
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>

        <h1><u>Bienvenido</u></h1>
        <br>
        <a href="cursos/index.jsp">Modulo Cursos</a>
        <form method="post" action="ServletUsuario?accion=cerrar">
            <input type="submit" value="cerrar sesion">
        </form>
    </body>
</html>
