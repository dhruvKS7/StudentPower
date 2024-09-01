<%-- 
    Document   : classOverview
    Created on : Jun 16, 2020, 10:40:28 AM
    Author     : IndianRonaldo
--%>
<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Class Overview</title>
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
                    <p class="navbar__grades">Grades <span class="arrow-down"></span></p>
                    <div class="navbar__grades-content">
                        <form action="secureFirstClasses" method="POST">
                            <input class="navbar__link" type="submit" value="First Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureSecondClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Second Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureThirdClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Third Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureFourthClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Fourth Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureFifthClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Fifth Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureSixthClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Sixth Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureSeventhClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Seventh Grade"/>
                        </form>
                        <div class="divider"></div>
                        <form action="secureEighthClasses" method="POST">
                            <input class="navbar__link" type="submit" value="Eighth Grade"/>
                        </form>
                    </div>
                </div>
                <form action="studentHome" method="POST">
                    <input class="navbar__logo" type="image" src="StudentPowerWritingLogo.png"/>
                </form>
                <div class="navbar__buttons">
                    <div class="navbar__dropdown navbar__dropdown--help">
                        <p class="navbar__help">&#9776;</p>
                        <div class="navbar__help-content">
                            <form action="settingsPage" method="POST">
                                <input class="navbar__link" type="submit" value="Settings"/>
                            </form>
                            <div class="divider"></div>
                            <form action="helpPage" method="POST">
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
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">${className} OVERVIEW</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <div>
            <table border="3" width="90%" style="margin-left: 5%; margin-right: 5%">
                <tr>
                    <th>Tutor Username</th>
                    <th>Name</th>
                    <th>Rating</th>
                    <th>Schedule a Session</th>
                    <th>Email</th>
                </tr>
                <%--Receiving data from servlet below:--%>
                <c:forEach var="row" items="${dbData}">
                    <tr>
                        <td>
                            <form action="tutorInfo" method="POST">
                                <input class="hero__button" type="submit" style="font-size: 20px" value="${row.get(0)}">
                                <input style="display: none; visibility: hidden" type="text" name="user" value="${row.get(0)}">
                            </form>
                        </td>
                        <td><c:out value="${row.get(3)}"/> <c:out value="${row.get(4)}"/></td>
                        <td><c:out value="${row.get(7)}"/></td>
                        <td>
                            <form action="calendarPage" method="POST">
                                <input class="hero__button" type="submit" style="font-size: 20px" value="Schedule a Session">
                                <input style="display: none; visibility: hidden" type="text" name="user" value="${row.get(0)}">
                            </form>
                        </td>
                        <td>
                            <button class="hero__button" onclick="sendMailTo('${row.get(8)}'); return false" style="font-size: 20px; border: 2px solid white">Email</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <br>
        <div style="text-align: center">
            <form action="subjectRefresh" method="POST">
                <input style="display: none; visibility: hidden" type="text" name="subjects" value="${className}">
                <input class="hero__button" style="font-size: 25px" type="submit" value="Find New Tutor"/>
            </form>
        </div>
    </body>
</html>