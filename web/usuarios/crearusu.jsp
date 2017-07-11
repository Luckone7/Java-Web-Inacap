<%-- 
    Document   : crearusu
    Created on : 03-07-2017, 22:34:06
    Author     : LuckoOne7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="POST" action="../ServletUsuario?accion=registrar">
            <table>
                <tr>
                    <td>Nombre</td>
                    <td><input type="text" name="nom"></td>
                </tr>
                <tr>
                    <td>Apellido paterno</td>
                    <td><input type="text" name="apepat"></td>
                </tr>
                <tr>
                    <td>Apellido materno</td>
                    <td><input type="text" name="apemat"></td>
                </tr>
                <tr>
                    <td>Nombre Cuenta</td>
                    <td><input type="text" name="username"></td>
                </tr>
                <tr>
                    <td>Contraseña</td>
                    <td><input type="password" name="password"></td>
                </tr>
                <tr>
                    <td> <input type="submit" value="enviar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
