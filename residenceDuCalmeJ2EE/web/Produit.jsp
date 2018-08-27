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

        <form action="srv_checkout" method="POST">
            <table class="table table-hover" border="0" cellspacing="8" cellpadding="9">

                <tbody>

                    <c:forEach var="item" items="${listApps}" varStatus="loop">


                        <tr>
                            <td> <img src="${item.app_img1}" width="200" height="200" alt="a"/></td>
                            <td> ${item.app_prix}</td>
                            <td>${item.app_status}</td>
                            <td> ${item.app_addr_id}</td>

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
