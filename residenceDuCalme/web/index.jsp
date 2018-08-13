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

        <title>JSP Page</title>
    </head>
    <body class='container'>
        <h1><img src="images/images.png" width="246" height="205" alt="images"/></h1>
        <h2>Le séjour idéal</h2>



        <table border="0" cellpadding='10' class='' >

            <tbody>

                <tr>

                    <td> <a href="Login.jsp">Se connecter</a></td>
                    <td> <a href="srv_Inscription">S'inscrire</a></td>
                    <td>             <a href="Contacts.html">Contacts</a></td>
                    <td><select name="Lang"> 
                            <option>English</option> 
                            <option>Français</option>
                        </select></td>


                </tr>
            </tbody>
        </table>

        <form name="srv_RechercheApp" action="srv_RechercheApp">
            </br>
            <div>

                <input size="30" type="search" name="prov" placeholder="Province">
                <div id="div_prov">   
                    <%--  <input class="typeahead form-control"  type="text">
                      <input class="typeahead form-control"  type="text">
                      <input class="typeahead form-control"  type="text">	
                    --%>
                </div>

                </br></br>
            </div>
            <input size="30" type="search" name="ville" placeholder="Ville">
            <div id="div_ville">   
                <%--  <input class="typeahead form-control"  type="text">
                  <input class="typeahead form-control"  type="text">
                  <input class="typeahead form-control"  type="text">	
                --%>
            </div>

        </form>



    </body>
</html>
