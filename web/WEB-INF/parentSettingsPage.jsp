<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Parent Settings</title>
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
                    <form action="parentSettingsPage" method="POST">
                        <input class="navbar__link" type="submit" value="SETTINGS"/>
                    </form>
                </div>
                <form action="parentHome" method="POST">
                    <input class="navbar__logo" type="image" src="StudentPowerWritingLogo.png"/>
                </form>
                <div class="navbar__buttons">
                    <div class="navbar__dropdown navbar__dropdown--help">
                        <p class="navbar__help">&#9776;</p>
                        <div class="navbar__help-content">
                            <form action="parentHelpPage" method="POST">
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
        <form action="updateParentSettings" method="POST">
            <div>
                <table border="3" width="90%" style="margin-left: 5%; margin-right: 5%">
                    <tr>
                        <th width="25%">Username</th>
                        <th width="30%">Email</th>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th width="10%">Avatar</th>
                    </tr>
                    <%--Receiving data from servlet below:--%>
                    <c:forEach var="row" items="${dbData}">
                        <tr>
                            <input style="display: none; visibility: hidden" type="text" name="user" value="${row.get(0)}">
                            <td><c:out value="${row.get(0)}"/></td>
                            <td><input type="text" name="email" value="${row.get(1)}" style="width: 90%"></td>
                            <td><input type="text" name="firstName" value="${row.get(2)}"></td>
                            <td><input type="text" name="lastName" value="${row.get(3)}"></td>
                            <td><img src="${row.get(4)}" style="width: 100px; height: 100px"></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <br>
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
            <form action="parentHelpPage" method="POST">
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
                    <form action="parentChangePassword" method="POST">
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
