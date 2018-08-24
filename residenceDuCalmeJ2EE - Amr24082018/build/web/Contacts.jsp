<%-- 
    Document   : Contacts
    Created on : 2018-08-13, 22:03:31
    Author     : AMR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/cssPageContact.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>


        <h2>Responsive Contact Section</h2>
        <p>Resize the browser window to see the effect.</p>

        <div class="container">
            <div style="text-align:center">
                <h2>Contact Us</h2>
                <p>Swing by for a cup of coffee, or leave us a message:</p>
            </div>
            <div class="row">
                <div class="column">
                    <div id="map" style="width:100%;height:500px"></div>
                </div>
                <div class="column">
                    <form action="srv_sendingEmail" method="POST">
                        <label for="fname">First Name</label>
                        <input type="text" id="fname" name="firstname" placeholder="Your name..">
                        <label for="lname">Last Name</label>
                        <input type="text" id="lname" name="lastname" placeholder="Your last name..">
                        <label for="country">Country</label>
                        <select id="country" name="country">
                            <option value="australia">Australia</option>
                            <option value="canada">Canada</option>
                            <option value="usa">USA</option>
                        </select>
                        <label for="subject">Subject</label>
                        <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
                        <input type="submit" value="Submit">
                    </form>
                </div>
            </div>
        </div>

        <script src="Scripts/jsMap.js" type="text/javascript"></script>

        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBLmkWZ4i3MBC0yblGpMMycUR5L7gwmI1I&callback=myMap"></script>
        <!--
        To use this code on your website, get a free API key from Google.
        Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
        -->


    </body>
</html>
