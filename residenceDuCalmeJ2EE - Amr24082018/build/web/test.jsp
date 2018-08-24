<%-- 
    Document   : test
    Created on : 2018-08-13, 17:37:51
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
          <div id="div_prov">   
            <c:if test="${ar.size() > 0}">

                <c:forEach var="item" items="${ar}">

                    <input  class="typeahead form-control"  type="text" value="${item}" autocomplete="on">

                </c:forEach>
            </c:if>
        </div>
    </body>
</html>
