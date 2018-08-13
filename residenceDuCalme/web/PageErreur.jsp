<%-- 
    Document   : Falid
    Created on : 2018-06-24, 18:36:56
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet">

        <title>JSP Page</title>
    </head>
    <body class="container">
                <%@include file="entete.jspf" %>

        <% String _username = request.getParameter("UserName");%>
        <h1 style="text-align: center">Votre UserName <%= _username %> ou Votre mot de pass Pas Valid Essayer Autre Fois</h1>
        <center><a href="index.jsp" style="font-size: 40px ">Essayer Login Autre Fois </a></center>
    </body>
</html>
