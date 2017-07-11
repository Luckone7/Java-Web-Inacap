<%@page import="cl.accesodato.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Modulo Usuario</h1>
        <br>
        <a href="crearusu.jsp">Crear un Nuevo Usuario</a>
<table border="1">
    <thead>
        <th>ID</th>
        <th>Nombre</th>
        <th>apellido paterno</th>
        <th>apellido materno</th>
        <th>username</th>
    </thead>
<tbody>
            <%
            Conexion con = new Conexion();
            con.setSql("Select * from users");
            while(con.getRs().next()){
                out.println("<tr>");
                    out.println("<td>"+con.getRs().getString("id")+("</td>"));
                    out.println("<td>"+con.getRs().getString("name")+("</td>"));
                    out.println("<td>"+con.getRs().getString("apepat")+("</td>"));
                    out.println("<td>"+con.getRs().getString("apemat")+("</td>"));
                    out.println("<td>"+con.getRs().getString("username")+("</td>"));
                out.println("</tr>");
            }
            %>
</tbody>
</table>
</body>
</html>
