<%-- 
    Document   : index
    Created on : 2018-08-06, 14:20:49
    Author     : MAT-AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="css/css.css" rel="stylesheet" type="text/css"/>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

        <meta name="viewport" content="width=device-width, initial-scale=1"><link rel="stylesheet" href="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css">
        <script src="https://code.jquery.com/jquery-1.11.3.min.js"></script>
        <script src="https://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
        
    </head>
    <body>
        <%@include file="entetePage.jspf" %>
        <div  style=" height:600px; background-color: #333; background-image: url('images/background.jpg');">
            <div class='container'>
                <div class="tagline">
                    <div class="tagline-content">
                        <div class="row">
                            <div class="small-17 columns large-14 small-centered">
                                <p class="tagline__title ui-up">Vous cherchez un <br />appartement a louer ?</p>
                                <br> 
                            </div>
                        </div>
                        <div class="row">
                            <div id="div_prov" class="col-sm-2">
                                <input style="height:50px  ; " size="30" type="search" id="prov" name="prov" placeholder="Province" onkeyup="chercherProv(this.value)">

                            </div>
                            <div id="div_ville" class="col-sm-2">

                                <input  style="height:50px ; " size="30" type="search" id="ville" placeholder="Ville"  onkeyup="chercherVille(this.value)" >

                            </div>
                            <div id="div_type" class="col-sm-2">

                                <input style="height:50px" size="30" type="search" id="typeApp" placeholder="Type appartement"  onclick="chercherTypes()"> 


                            </div>
                            <div id="div_prix" class="col-sm-2">

                                <input style="height:50px" size="30" type="search" id="prix" placeholder="Prix" onclick="getPrix()" >


                            </div>
<<<<<<< HEAD
                            <div id="div_services" class="col-sm-2">
=======
                            <div id="div_service" class="col-sm-2">
>>>>>>> 186931ec53133b026440305ac055daa4b7d2d9f5

                                <input style="height:50px" size="30" type="search" id="servicesApp" placeholder="Choix des services" onclick="chercherServices(this.value)" >

                            </div>
                            <div id="div_img" class="col-sm-2">

                                <button class="btn"><img src="images/search-icon.png" width="50" height="38" alt="search-icon"/></button>
                            </div>
                            
                            
                        </div>
                    </div>
                </div>
            </div>
            <script src="Scripts/ScriptsJS.js" type="text/javascript"></script>
    </body>
</html>
