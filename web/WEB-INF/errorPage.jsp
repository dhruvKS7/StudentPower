<!--Imports below;-->
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <!--Declaring header below:-->
    <head>
        <%--Linking other classes below:--%>
        <!--<meta charset="UTF-8">-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" type="text/css" href="StylingSheet.css"/>
        <link rel="stylesheet" type="text/css" href="css/homepage.css"/>
        <title>Error Page</title>
    </head>
    <%--Creating body below:--%>
    <body onclick>
        <%--Displaying an error message for the user below:--%>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <h1 class="whyus__title" style="text-align: center; text-transform: uppercase; font-size: 100px">ERROR!</h1>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <h2 id="errorText">${errorReason}</h2>
        <%--Allowing the user to return to home page below:--%>
        <form id="errorButton" action="returnError" method="POST">
            <input id="entryButtonTest" type="submit" value="RETURN">
        </form>
        <br>
    </body>
</html>
