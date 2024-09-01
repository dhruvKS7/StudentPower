<%-- 
    Document   : myTutors
    Created on : Jun 16, 2020, 11:17:54 AM
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
        <title>Third Languages</title>
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
        <div class="row">
            <div class="column" style="background-color:#aaa;">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <h1 style="text-align: center; font-size: 60px">SPANISH</h1>
            </div>

            <div class="column" style="background-color:#bbb;">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <h1 style="text-align: center; font-size: 60px">FRENCH</h1>
            </div>

            <div class="column" style="background-color:#ccc;">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <h1 style="text-align: center; font-size: 60px">CHINESE</h1>
            </div>
        </div>


        <div class="buttonDiv">
            <form action="classRefresh" method="POST">
                <input type="text" name="subject" value="spanish" style="visibility: hidden; display: none">
                <input type="text" name="grade" value="third" style="visibility: hidden; display: none">
                <!--<input style="min-width: 14.55%; text-align: center" type="submit" class="Sbutton" value="FIND A TUTOR">-->
                <input type="submit" class="hero__button" value="FIND A TUTOR" style="font-size: 20px; width: 100%">
            </form>
        </div>
        <div class="linkDiv">
            <a class="hero__button" href="#popup1" style="font-size: 20px; display: inline-block; width: 90%; text-align: center">LEARN A DIFFERENT TOPIC</a>
        </div>
        <div id="popup1" class="overlay">
            <div class="popup">
                <h2>ALERT</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    If you want to learn a different topic, be sure to let your tutor know what it is in the "notes" section when you create your Calendly session!
                    <br>
                    <br>
                </div>
            </div>
        </div>
    </body>
</html>