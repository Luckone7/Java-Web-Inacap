<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Creacion Curso</h1>
        <br>
        <form method="POST" action="ServletCurso?accion=registrar">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nom"></td>
                </tr>
                <tr>
                    <td>Descripcion</td>
                    <td><input type="text" name="des"></td>
                <tr>
                <tr>
                    <td><input type="submit" value="Enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
