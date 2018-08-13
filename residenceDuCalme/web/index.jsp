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

        <title>JSP Page</title>
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


        <input size="30" type="search" name="prov" placeholder="Province" onkeyup="chercherProv(this.value)">

        <div id="div_prov">   
            <c:if test="${ar.size() > 0}">

                <c:forEach var="item" items="${ar}">

                    <input  class="typeahead form-control" type="text" value="${item}" autocomplete="on">

                </c:forEach>
            </c:if>
        </div>


        <br><br>
        <input size="30" type="search" name="ville" placeholder="Ville" onkeyup="chercherVille(this.value)">
        <div id="div_ville">  </div>



    </center>
    <script src="Scripts/Script1.js" type="text/javascript"></script>
</body>
</html>
