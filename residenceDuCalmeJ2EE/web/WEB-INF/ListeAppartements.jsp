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
        <%@include file="../entetePage.jspf" %>
    </head>
    <body>
        <form action="srv_checkout" method="POST">
            <table class="table" border="0" cellspacing="8" cellpadding="9">
                <tbody>
                    <c:forEach var="item" items="${registreApp}" varStatus="loop">
                        <div class="row">
                            <div class="col-sm-6">
                                <img src="${item.app_image1}" width="200" height="200" alt="a"/>
                             </div>
                             <div class="col-sm-6">
                                <p>${item.app_rue}</p>
                                <p style="color:red">${item.app_prix}</p>
                            </div>
                        </div>

                            
                    </c:forEach>

                <%--
                mES DDSDSDSDSDSDS
                --%>


                </tbody>
            </table>

        </form>         

    </body>
</html>
