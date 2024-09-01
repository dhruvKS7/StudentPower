<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>My Students</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" type="text/css" href="StylingSheet.css"/>
        <link rel="stylesheet" type="text/css" href="css/homepage.css"/>
        <script src="script.js"></script>
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
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">MY STUDENTS</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <div>
            <table border="3" width="90%" style="margin-left: 5%; margin-right: 5%">
                <tr>
                    <th width="35%">Student Username</th>
                    <th width="35%">Name</th>
                    <th width="17%">Subject Taught</th>
                    <th width="13%">Email</th>
                </tr>
                <%--Receiving data from servlet below:--%>
                <c:forEach var="row" items="${dbData}">
                    <tr>
                        <td>
                            <form action="studentInfo" method="POST">
                                <input class="hero__button" type="submit" style="font-size: 20px" value="${row.get(1)}">
                                <input type="text" style="display: none; visibility: hidden" name="user" value="${row.get(1)}">
                            </form>
                        </td>
                        <td><c:out value="${row.get(5)}"/> <c:out value="${row.get(6)}"/></td>
                        <td><c:out value="${row.get(2)}"/></td>
                        <td>
                            <button class="hero__button" onclick="sendMailTo('${row.get(9)}'); return false" style="font-size: 20px; border: 2px solid white">Email</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
