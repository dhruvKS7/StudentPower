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
        <title>User Rules</title>
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
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">USER RULES</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <div class="row2">
            <div class="column2" style="background-color:#aaa;">
                <dl style="text-align: center">
                    <h1>Punctuality</h1>
                    <dt class="colText2">Be on time for every scheduled lesson - it is your time for learning and we want you to use the time efficiently. If you have to cancel a session, please contact the tutor at least 12 hours before the scheduled time. If you are more than 10 minutes late, your session is considered canceled and you should reschedule.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Respect</h1>
                    <dt class="colText2">Be respectful towards your tutors during every lesson - they put a lot of effort into bringing the best materials and attitude to every session for you. Lessons are recorded and are subject to being audited by administration - we invite our students to show their best behavior.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Preparation</h1>
                    <dt class="colText2">Be ready with all your materials (including a notebook, pencil, and anything else required for the lesson) beforehand since we want you to use the entire session for learning.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Working Space</h1>
                    <dt class="colText2">Try to find a place to work and study where you can avoid any distractions so that your lesson can be productive and you are focused on the material covered.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Rating</h1>
                    <dt class="colText2">After each lesson, you will have the option to rate your tutor and give feedback on your session. We encourage you to do so, as your rating and feedback will help other students choose the right tutor for them. If you decide to provide a rating, please do so within 24 hours of your lesson.</dt>
                    <br>
                </dl>
            </div>
        </div>
        <br>
        <div style="text-align: center">
            <form action="userGuide" method="POST">
                <input type="submit" class="hero__button" value="Guide" style="font-size: 20px">
            </form>
        </div>
        <br>
    </body>
</html>