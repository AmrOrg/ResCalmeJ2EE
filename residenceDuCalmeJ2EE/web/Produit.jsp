<%-- 
    Document   : Produit
    Created on : 2018-08-24, 16:38:00
    Author     : 1795162
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <%@include file="entetePage.jspf" %>
        <div class="row">

            <div class="col-sm-6">

                <table class="table table-hover" border="0" cellspacing="8" cellpadding="9">
                   <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col"> Photo</th>
                            <th scope="col"> Prix</th>
                            <th scope="col"> Description </th>
                            <th scope="col"> Location </th>
                            <th scope="col"> include </th>

                        </tr>
                    </thead>
                 
                    <tbody>

                        <c:forEach var="item" items="${listApps}" varStatus="loop">
                        <th scope="row">${loop.index}</th>
                        <tr >
                            <td scope="col"> <img src="${item.app_img1}" width="100" height="200" alt="a"/></td>
                            <td scope="col"> ${item.app_prix}</td>
                            <td scope="col">${item.app_status}</td>
                            <td scope="col"> ${item.app_addr_id}</td>

                        </tr>
                    
                    </c:forEach>




                    </tbody>
                </table>

            </div>


        </div>





    </body>
</html>
