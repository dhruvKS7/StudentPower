<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StylingSheet.css"/>
        <title>JSP Page</title>
    </head>
    <body style="background-color: gray" onclick>
        <form action="adminHome" method="POST">
            <input type="submit" value="GO BACK">
        </form>
        <br>
        <br>
        <a href="#popup1">UPDATE MEMBER</a>
        <br>
        <br>
        <a href="#popup2">DELETE MEMBER</a>
        <br>
        <br>
        <div>
            <table border="3" width="50%">
                <tr>
                    <th>Username</th>
                    <th>Password</th>
                </tr>
                <%--Receiving data from servlet below:--%>
                <c:forEach var="row" items="${dbData}">
                    <tr>
                        <td><c:out value="${row.get(0)}"/></td>
                        <td><c:out value="${row.get(1)}"/></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <%--Creating popup to receive data to insert into database below:--%>
        <div id="popup1" class="overlay">
            <div class="popup">
                <h2>UPDATE MEMBER:</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <%--Creating area for user to type in data below:--%>
                    <form action="updateParentLoginTable" method="POST">
                        <hr class="whereLeft"> <p class="whereText"> WHERE </p> <hr class="whereRight">
                        <br>
                        USERNAME: <br> <input type="text" name="userNameUpdate"/>
                        <br>
                        <br>
                        <hr class="updateLeft"> <p class="updatingText"> UPDATE </p> <hr class="updateRight">
                        <br>
                        USERNAME: <br> <input type="text" name="userName">
                        <br>
                        <br>
                        PASSWORD: <br> <input type="text" name="password">
                        <br>
                        <br>
                        <%--Creating button to send data to servlet below:--%>
                        <input class="Sbutton" type="submit" value="UPDATE"/>
                    </form>
                </div>
            </div>
        </div>
        <%--Creating popup to receive data to insert into database below:--%>
        <div id="popup2" class="overlay">
            <div class="popup">
                <h2>DELETE MEMBER:</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <%--Creating area for user to type in data below:--%>
                    <form action="deleteParentLogin" method="POST">
                        <hr class="whereLeft"> <p class="whereText"> WHERE </p> <hr class="whereRight">
                        <br>
                        USERNAME: <br> <input type="text" name="userNameDelete"/>
                        <br>
                        <br>
                        <%--Creating button to send data to servlet below:--%>
                        <input class="Sbutton" type="submit" value="DELETE"/>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
