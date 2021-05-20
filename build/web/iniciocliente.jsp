<%-- 
    Document   : inicio
    Created on : 2/11/2017, 01:15:11 AM
    Author     : Notebook
--%>

<%@page import="Beans.BeanCarreraCliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:400,700">
        <link href="style.css" type="text/css" rel="stylesheet"></link>

    </head>
    <body>
        <div id="login">
            <form action="faces/ValidarCliente" method="POST" name='form-login'>
                <h2>Ingreso Para Clientes</h2>
                <span class="fontawesome-user"></span>
                <input type="text" placeholder="Usuario" required="" name="txt_usuario"/>
                <span class="fontawesome-lock"></span>
                <input type="password" placeholder="Cedula" required="" name="txt_cedula"/>
                

                <input type="submit" value="Iniciar Sesion"/>
                <a href="inicio taxista.jsp">Si eres taxista click aqui!</a><br /><br />

                <a href="faces/RegistrarCliente.xhtml" > No estas registrado? Registrate Aquí</a>!<br /><br />
                <%
                    session.setAttribute("ROL", "CLIENTE");
            
                    
             %>   
            </form>
        </div>
    </body>
</html>
