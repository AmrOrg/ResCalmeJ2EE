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
    <center>  
        <center><h1><u>Add User</u></h1></center>
        <center>
            <div>
                <form action="srv_Inscription" method="POST">

                    <table>
                        <tr>
                            <td>NOM   </td>
                            <td><input type="text" class="form-control" name="nom"  size="30" placeholder="Username"/></td>
                        </tr>
                        <tr>
                            <td>PRÉNOM  </td>
                            <td><input type="text" class="form-control" name="prenom"  size="30" placeholder="Username"/></td>
                        </tr>
                        <tr>
                            <td>User Name   </td>
                            <td><input type="text" class="form-control" name="UserName1"  size="30" placeholder="Username"/></td>
                        </tr>
                        <tr>
                            <td>Password    </td>
                            <td><input type="password" class="form-control" name="PWD1" placeholder="Password" size="30" /></td>
                        </tr>

                        <tr>
                            <td>Email </td>
                            <td><input type="text" class="form-control" name="email1"  size="30" placeholder="xyz@xyz.com"/></td>
                        </tr>
                        <tr>
                            <td>Telephone </td>
                            <td><input type="text" class="form-control" name="tel1"  size="30" placeholder="xyz@xyz.com"/></td>
                        </tr>
                        <tr>
                            <td colspan="2" style="text-align:center"><input  class="btn btn-success" type="submit" value="Save" /></td>

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
