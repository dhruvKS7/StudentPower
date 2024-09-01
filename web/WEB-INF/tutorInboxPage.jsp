<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tutor Inbox</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" type="text/css" href="StylingSheet.css"/>
        <link rel="stylesheet" type="text/css" href="css/homepage.css"/>
    </head>
    <body onclick >
        <div class="navbar">
            <nav class="navbar__nav">
                <div class="navbar__dropdown navbar__dropdown--grades">
                    <a class="navbar__link" href="https://zoom.us/meeting?_x_zm_rtaid=TlN1OAuAStG_TPpjXcBI8w.1592406649210.1ba784bd92e19a757a48453af380c7c0&_x_zm_rhtaid=783" target="_blank">ZOOM</a>
                </div>
                <form action="tutorHome" method="POST">
                    <input class="navbar__logo" type="image" src="StudentPowerWritingLogo.png"/>
                </form>
                <div class="navbar__buttons">
                    <div class="navbar__dropdown navbar__dropdown--help">
                        <p class="navbar__help">&#9776;</p>
                        <div class="navbar__help-content">
                            <form action="tutorSettingsPage" method="POST">
                                <input class="navbar__link" type="submit" value="Settings"/>
                            </form>
                            <div class="divider"></div>
                            <form action="tutorHelpPage" method="POST">
                                <input class="navbar__link" type="submit" value="Help"/>
                            </form>
                            <div class="divider"></div>
                            <form action="logOut" method="POST">
                                <input class="navbar__link" type="submit" value="Log Out"/>
                            </form>
                        </div>
                    </div>
                </div>
            </nav>
        </div>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">INBOX</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <br>
        <div style="text-align: center">
            <a href="#popup6" class="hero__button" style="font-size: 20px">SEND MESSAGE</a>
        </div>
        <br>
        <br>
        <%--Creating table to display data from database below:--%>
        <div>
            <table border="3" width="90%" style="margin-left: 5%; margin-right: 5%">
                <tr>
                    <th width="30%">Sender</th>
                    <th width="70%">Message</th>
                </tr>
                <%--Receiving data from servlet below:--%>
                <c:forEach var="row" items="${dbData}">
                    <tr>
                        <td><c:out value="${row.get(3)}"/></td>
                        <td><c:out value="${row.get(2)}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <br>
        <br>
        <%--Creating popup to receive data to insert into database below:--%>
        <div id="popup6" class="overlay">
            <div class="popup">
                <h2>SEND MESSAGE:</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <%--Creating area for user to type in data below:--%>
                    <form action="tutorSendMessage" method="POST">
                        RECIPIENT USERNAME: <br><input type="text" name="userNameSend"/>
                        <br>
                        <br>
                        MESSAGE: <br><textarea rows="5" cols="10" id="messageText" name="message"></textarea>
                        <br>
                        <br>
                        <%--Creating button to send data to servlet below:--%>
                        <input class="Sbutton" type="submit" value="SEND"/>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
