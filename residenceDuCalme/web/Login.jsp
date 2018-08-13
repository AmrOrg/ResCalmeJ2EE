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
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/css1.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
    <center><h1><u>Login Here</u></h1></center>
    <center>
        <div>
            <form action="login" method="POST">

                <table>

                    <tr>
                        <td>User Name   </td>
                        <td><input type="text" class="form-control" name="UserName"  size="30" placeholder="Username"/></td>
                    </tr>
                    <tr>
                        <td>Password    </td>
                        <td><input type="password" class="form-control" name="PWD" placeholder="Password" size="30" /></td>
                    </tr>
                        <tr>
                        <td>Language    </td>
                        <td><input type="radio" name="lang" value="Fr" checked="checked" />Francais <br>
                            <input type="radio" name="lang" value="En"  />English <br>
                        
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align:center"><input  class="btn btn-success" type="submit" value="Login" /></td>

                    </tr>

                </table>

            </form>  
        </div>
    </center>
</body>
</html>
