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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <link href="css/css.css" rel="stylesheet" type="text/css"/>

    </head>
    <body class='container'>
        <%@include file="entete.jspf" %>

    <center>

      

        <div class="row">
            <div id="div_prov" class="col-sm-2">
                <input style="height:50px  ; " size="30" type="search" id="prov" name="prov" placeholder="Province" onkeyup="chercherProv(this.value)">


            </div>
            <div id="div_ville" class="col-sm-2">

                <input  style="height:50px ; " size="30" type="search" id="ville" placeholder="Ville" onkeyup="chercherVille(this.value)" >


            </div>
            <div id="div_type" class="col-sm-2">

                <input style="height:50px" size="30" type="search" id="ville" placeholder="Ville" onkeyup="chercherVille(this.value)" >


            </div>
            <div id="div_prix" class="col-sm-2">

                <input style="height:50px" size="30" type="search" id="ville" placeholder="Ville" onkeyup="chercherVille(this.value)" >

            </div>
            <div id="div_prix" class="col-sm-2">

                <input style="height:50px" size="30" type="search" id="ville" placeholder="Ville" onkeyup="chercherVille(this.value)" >

            </div>
            <div id="div_prix" class="col-sm-2">

                <button class="btn"><img src="images/search-icon.png" width="50" height="38" alt="search-icon"/></button>
            </div>
        </div>



    </center>

    <script src="Scripts/Script1.js" type="text/javascript"></script>
</body>
</html>
