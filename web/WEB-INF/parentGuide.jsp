<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Parent Guide</title>
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
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">PARENT GUIDE</h2>
        <br>
        <div style="text-align: center">
            <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
            <br>
            <a style="font-size: 25px" href="https://docs.google.com/presentation/d/1z-8T3X11wMbDokACMLPV7clC70gltWlvKNBk6h0o3Pk/edit?usp=sharing" target="_blank">How to Use the Platform</a>
            <br>
            <p style="font-style: italic; font-size: 20px">Check out this presentation to see how you can use the Student Power website!</p>
            <br>
            <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
            <br>
            <iframe width="560" height="315" src="https://www.youtube-nocookie.com/embed/OkaBzJEgUOQ" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            <br>
            <p style="font-style: italic; font-size: 20px">Watch this video to get a better of understand of what Student Power is all about!</p>
            <br>
            <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
            <br>
        </div>
    </body>
</html>
