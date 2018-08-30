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
                        <tr>
                            <td> <img src="${item.app_image1}" width="200" height="200" alt="a"/></td>
                            <td> ${item.app_prix}</td>
                            <td>${item.app_statut}</td>
                            <td> ${item.app_rue}</td>

                            <td>

                                <input type="hidden" name="Index" value="${loop.index}" />
                                <input type="hidden" name="action" value="add" />
                                <input type="submit"  style="color: red;"value="Add" name="add" />

                            </td>  


                        </tr>

                    </c:forEach>




                </tbody>
            </table>

        </form>         

    </body>
</html>
