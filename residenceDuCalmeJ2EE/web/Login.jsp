<%-- 
    Document   : index
    Created on : 2018-06-24, 12:47:49
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>

    <body >
    <%@include file="entetePage.jspf" %>
    <br><br>
    <center>
        <div>
            <form action="srv_Login?logout=false" method="POST">
                <table>
                    <tr>
                        <td>Identifiant</td>
                        <td><input type="text" class="form-control" name="UserName"  size="30" placeholder="Identifiant" required/></td>
                    </tr>
                    <tr>
                        <td>Mot de passe</td>
                        <td><input type="password" class="form-control" name="PWD" placeholder="Mot de passe" size="30" required/></td>  
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align:right"><input  class="btn btn-success" type="submit" value="Se Connecter" /></td>
                    </tr>

                </table>

            </form>  
        </div>
    </center>
</body>
</html>
