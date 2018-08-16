<%-- 
    Document   : index
    Created on : 2018-08-06, 14:20:49
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <link href="Scripts/css.css" rel="stylesheet" type="text/css"/>

    </head>
    <body class='container'>
        <%@include file="entete.jspf" %>

    <center>

        <table border="0" cellpadding='10' class='' >

            <tbody>

                <tr>


                    <td><select name="Lang"> 
                            <option>English</option> 
                            <option>Français</option>
                        </select></td>


                </tr>
            </tbody>
        </table>

        </br>


        <input size="30" type="search" id="prov" name="prov" placeholder="Province" onkeyup="chercherProv(this.value)">

        <div id="div_prov">
            
        </div>


        <br><br>
        <input  size="30" type="search" id="ville" placeholder="Ville" onkeyup="chercherVille(this.value)" >
        <div id="div_ville">  
        </div>



    </center>
    <a href="srv_sendingEmail">click to send email</a>
    <script src="Scripts/Script1.js" type="text/javascript"></script>
</body>
</html>
