<%-- 
    Document   : Inscription
    Created on : 24 août 2018, 09:19:13
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <link rel="stylesheet" href="css/css1.css">

    </head>
    <body>
        <%@include file="entetePage.jspf" %>
        <br><br>
    <center>  
       
        <center>
            <div>
                <form action="srv_Inscription" method="POST">

                    <table>
                        <tr>
                            <td>Nom   </td>
                            <td><input type="text" class="form-control" name="nom"  size="30" placeholder="Nom"/></td>
                        </tr>
                        <tr>
                            <td>Prénom  </td>
                            <td><input type="text" class="form-control" name="prenom"  size="30" placeholder="Prénom"/></td>
                        </tr>
                        <tr>
                            <td>Identifiant  </td>
                            <td><input type="text" class="form-control" name="UserName1"  size="30" placeholder="Identifiant"/></td>
                        </tr>
                        <tr>
                            <td>Mot de passe    </td>
                            <td><input type="password" class="form-control" name="PWD1" placeholder="Mot de passe" size="30" /></td>
                        </tr>

                        <tr>
                            <td>Couriel </td>
                            <td><input type="text" class="form-control" name="email1"  size="30" placeholder="xyz@xyz.com"/></td>
                        </tr>
                        <tr>
                            <td>Téléphone </td>
                            <td><input type="text" class="form-control" name="tel1"  size="30" placeholder="(514)000-0000"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align:right"><input  class="btn btn-success" type="submit" value="S'inscrire" /></td>

                        </tr>

                    </table>

                </form>  
                <c:if test="${x == 1}">

                    <p>${x} line inserted </p>

                </c:if>
                    <c:if test="${str != null}">
                        
                        <p> ${str}</p>
                        
                    </c:if>
                        <c:if test="${msg !=null}">
                            
                             <p> ${msg}</p>
                            
                        </c:if>
                    
     
            </div>
        </center>

    </center>

</body>
</html>
