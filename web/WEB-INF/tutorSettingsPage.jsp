<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tutor Settings</title>
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
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">SETTINGS</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <%--Creating button to send data to servlet below:--%>
        <form action="updateTutorSettings" method="POST">
            <div>
                <table border="3" width="100%">
                    <tr>
                        <th width="20%">Username</th>
                        <th width="20%">Email</th>
                        <th width="5%">First Name</th>
                        <th width="5%">Last Name</th>
                        <th width="4%">Grade Level</th>
                        <th width="4%">Avatar</th>
                        <th width="30%">Bio</th>
                        <th width="10%">Calendly Link</th>
                    </tr>
                    <%--Receiving data from servlet below:--%>
                    <c:forEach var="row" items="${dbData}">
                        <tr>
                            <input style="display: none; visibility: hidden" type="text" name="user" value="${row.get(0)}">
                            <td><c:out value="${row.get(0)}"/></td>
                            <td><input type="text" name="email" value="${row.get(1)}"></td>
                            <td><input type="text" name="firstName" value="${row.get(2)}"></td>
                            <td><input type="text" name="lastName" value="${row.get(3)}"></td>
                            <td><input type="number" name="gradeLevel" min="9" max="12" value="${row.get(4)}"></td>
                            <td><img src="${row.get(5)}" style="width: 100px; height: 100px"></td>
                            <td><input type="text" name="summary" value="${row.get(6)}"></td>
                            <td><input type="text" name="calendarLink" value="${row.get(22)}"></td>
                        </tr>
                        <tr>
                            <th width="20%">First Grade</th>
                            <th width="20%">Second Grade</th>
                            <th width="5%">Third Grade</th>
                            <th width="5%">Fourth Grade</th>
                            <th width="4%">Fifth Grade</th>
                            <th width="4%">Sixth Grade</th>
                            <th width="30%">Seventh Grade</th>
                            <th width="10%">Eighth Grade</th>
                        </tr>
                        <tr>
                            <td><input type="checkbox" name="first" value="first" ${first}></td>
                            <td><input type="checkbox" name="second" value="second" ${second}></td>
                            <td><input type="checkbox" name="third" value="third" ${third}></td>
                            <td><input type="checkbox" name="fourth" value="fourth" ${fourth}></td>
                            <td><input type="checkbox" name="fifth" value="fifth" ${fifth}></td>
                            <td><input type="checkbox" name="sixth" value="sixth" ${sixth}></td>
                            <td><input type="checkbox" name="seventh" value="seventh" ${seventh}></td>
                            <td><input type="checkbox" name="eighth" value="eighth" ${eighth}></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <br>
            <div style="text-align: center">
                <input class="hero__button" type="submit" value="SAVE CHANGES" style="font-size: 20px"/>
            </div>
        </form>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <br>
        <div style="text-align: center">
            <form name="nameEntry" href="#popup1" method="POST">
                <a href="#popup1" class="hero__button" style="font-size: 20px">CHANGE PASSWORD</a>
            </form>
        </div>
        <br>
        <br>
        <div style="text-align: center">
            <form action="tutorHelpPage" method="POST">
                <input class="hero__button" type="submit" value="CONTACT US" style="font-size: 20px"/>
            </form>
        </div>
        <br>
        <div id="popup1" class="overlay">
            <div class="popup">
                <h2>CHANGE PASSWORD</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="tutorChangePassword" method="POST">
                        CURRENT PASSWORD:<br> <input type="password" name="oldPassword"/>
                        <br>
                        <br>
                        NEW PASSWORD:<br> <input type="password" name="newPassword"/>
                        <br>
                        <br>
                        CONFIRM NEW PASSWORD:<br> <input type="password" name="confirmPassword"/>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="CHANGE"/>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
