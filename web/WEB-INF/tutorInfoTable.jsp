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
                    <th>Email</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Grade Level</th>
                    <th>Avatar</th>
                    <th>Summary</th>
                    <th>Math</th>
                    <th>Social</th>
                    <th>Science</th>
                    <th>English</th>
                    <th>Spanish</th>
                    <th>French</th>
                    <th>Chinese</th>
                    <th>First</th>
                    <th>Second</th>
                    <th>Third</th>
                    <th>Fourth</th>
                    <th>Fifth</th>
                    <th>Sixth</th>
                    <th>Seventh</th>
                    <th>Eighth</th>
                    <th>Calendar Link</th>
                    <th>Ranking</th>
                </tr>
                <%--Receiving data from servlet below:--%>
                <c:forEach var="row" items="${dbData}">
                    <tr>
                        <td><c:out value="${row.get(0)}"/></td>
                        <td><c:out value="${row.get(1)}"/></td>
                        <td><c:out value="${row.get(2)}"/></td>
                        <td><c:out value="${row.get(3)}"/></td>
                        <td><c:out value="${row.get(4)}"/></td>
                        <td><c:out value="${row.get(5)}"/></td>
                        <td><c:out value="${row.get(6)}"/></td>
                        <td><c:out value="${row.get(7)}"/></td>
                        <td><c:out value="${row.get(8)}"/></td>
                        <td><c:out value="${row.get(9)}"/></td>
                        <td><c:out value="${row.get(10)}"/></td>
                        <td><c:out value="${row.get(11)}"/></td>
                        <td><c:out value="${row.get(12)}"/></td>
                        <td><c:out value="${row.get(13)}"/></td>
                        <td><c:out value="${row.get(14)}"/></td>
                        <td><c:out value="${row.get(15)}"/></td>
                        <td><c:out value="${row.get(16)}"/></td>
                        <td><c:out value="${row.get(17)}"/></td>
                        <td><c:out value="${row.get(18)}"/></td>
                        <td><c:out value="${row.get(19)}"/></td>
                        <td><c:out value="${row.get(20)}"/></td>
                        <td><c:out value="${row.get(21)}"/></td>
                        <td><c:out value="${row.get(22)}"/></td>
                        <td><c:out value="${row.get(23)}"/></td>
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
                    <form action="updateTutorInfoTable" method="POST">
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
                        EMAIL: <br> <input type="text" name="email">
                        <br>
                        <br>
                        FIRST NAME: <br> <input type="text" name="firstName">
                        <br>
                        <br>
                        LAST NAME: <br> <input type="text" name="lastName">
                        <br>
                        <br>
                        GRADE LEVEL: <br> <input type="number" name="gradeLevel">
                        <br>
                        <br>
                        AVATAR: <br> <input type="text" name="avatar">
                        <br>
                        <br>
                        SUMMARY: <br> <textarea rows="5" cols="10" id="messageText" name="summary"></textarea>
                        <br>
                        <br>
                        MATH: <br> <input type="number" name="math">
                        <br>
                        <br>
                        SOCIAL STUDIES: <br> <input type="number" name="social">
                        <br>
                        <br>
                        SCIENCE: <br> <input type="number" name="science">
                        <br>
                        <br>
                        ENGLISH: <br> <input type="number" name="english">
                        <br>
                        <br>
                        SPANISH: <br> <input type="number" name="spanish">
                        <br>
                        <br>
                        FRENCH: <br> <input type="number" name="french">
                        <br>
                        <br>
                        CHINESE: <br> <input type="number" name="chinese">
                        <br>
                        <br>
                        FIRST: <br> <input type="number" name="first">
                        <br>
                        <br>
                        SECOND: <br> <input type="number" name="second">
                        <br>
                        <br>
                        THIRD: <br> <input type="number" name="third">
                        <br>
                        <br>
                        FOURTH: <br> <input type="number" name="fourth">
                        <br>
                        <br>
                        FIFTH: <br> <input type="number" name="fifth">
                        <br>
                        <br>
                        SIXTH: <br> <input type="number" name="sixth">
                        <br>
                        <br>
                        SEVENTH: <br> <input type="number" name="seventh">
                        <br>
                        <br>
                        EIGHTH: <br> <input type="number" name="eighth">
                        <br>
                        <br>
                        CALENDAR LINK: <br> <input type="text" name="calendarLink">
                        <br>
                        <br>
                        RATING: <br> <input type="text" name="rating">
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
                    <form action="deleteTutorInfo" method="POST">
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