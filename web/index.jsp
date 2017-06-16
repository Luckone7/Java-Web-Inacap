<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="cl.accesodato.Conexion"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRUEBA BDD</title>
    </head>
    <body>
        <%
            Conexion con=new Conexion();
            con.setInsertar("insert into courses(name,description,created_at,state)"
                    + "values('Sistemas2','Sin Descripcion',now(),'active')");
        %>
    </body>
</html>
