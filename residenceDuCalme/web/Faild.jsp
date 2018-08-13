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
        <title>JSP Page</title>
    </head>
    <body>
        <% String _username = request.getParameter("UserName");%>
        <h1 style="text-align: center">Votre UserName <%= _username %> ou Votre mot de pass Pas Valid Essayer Autre Fois</h1>
        <center><a href="index.jsp" style="font-size: 40px ">Essayer Login Autre Fois </a></center>
    </body>
</html>
