<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crear Nuevo Curso</h1>
        <br>
        <form method="post" action="../ServletCurso?accion=registrar">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="name"></td>
                </tr>
                <tr>
                    <td>Descripcion</td>
                    <td><input type="text" name="description"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="crear curso"></td>    
                </tr>
            </table>
        </form>
    </body>
</html>
