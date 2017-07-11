<%-- 
    Document   : index
    Created on : 03-07-2017, 21:57:43
    Author     : LuckoOne7
--%>

<%@page import="cl.accesodato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modulo Cursos</h1>
        <br>
        <a href="crear.jsp">Crear Nuevo Curso</a>
        <table border="1">
            <thead>
            <th>ID</th>
            <th>Nombre</th>
            <th>Descripcion</th>
        </thead>
        <tbody>
            <%
            Conexion con = new Conexion();
            con.setSql("Select * from courses");
            while(con.getRs().next()){
                out.println("<tr>");
                    out.println("<td>"+con.getRs().getString("id")+("</td>"));
                    out.println("<td>"+con.getRs().getString("name")+("</td>"));
                    out.println("<td>"+con.getRs().getString("description")+("</td>"));
                out.println("</tr>");
            }
            %>
        </tbody>
    </table>
</body>
</html>
