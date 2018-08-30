<%-- 
    Document   : ListeAppartements
    Created on : 2018-08-30, 11:43:06
    Author     : 1795657
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Liste des appartements</title>
        <%@include file="entetePage.jspf" %>
    </head>
    <body style="background: whitesmoke;" >
        <form action="srv_checkout" method="POST">

            <div id="div_1" class="row ">


                <div id="div_1_1 "class="col-sm-6">

                    <img src="images/background.jpg" width="950" height="800" alt="background"/>

                </div>
                <div style="background: whitesmoke;margin-top:17px;" id="div_1_2" class="col-sm-6">

                    <div class="row center">
                        <div align="center"  id="div_annonce" class="col-sm-12 " >

                            <a href="https://www.rbcroyalbank.com/personal.html"><img src="images/RB_RB_FRE.png" width="509" height="100" alt="RB_RB_FRE"/></a>

                        </div>

                    </div>
                    <div class="row center">
                        <div align="center" style="background:#fff ;margin-top:20px;border-color: red;width: 90%;margin-left: 40px;" id="div_resTitle" class="col-sm-12" >

                            <h2 style="color: #cc3300"> Votre Recherche contient 200 </h2>

                        </div>

                    </div>

                    <div class="row  pre-scrollable" style="max-height: 650px" >

                        <div  style="background :white;margin-top:20px;border-color: red;width: 44%;margin-left: 40px;" id="div_resTitle" class="col-sm-3" >
                            <div class="row">
                                <div class="col-sm-6" >
                                    <img style="margin-left: -15px;" src="images/appartments/14908336563phpi9LI2K.jpg" width="200" height="200" alt="1490405228"/>


                                </div>
                                <div class="col-sm-6" >

                                    <h3>nom de ville ici</h3>
                                    <h3>prix est 9000</h3>
                                    <h5>adress</h5>



                                </div>

                            </div>




                        </div>


                    </div>

                </div>



            </div>


        </form>         

    </body>
</html>
