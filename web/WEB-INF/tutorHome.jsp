<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tutor Home</title>
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
        <h2 class="whyus__title" style="text-align: center">TUTOR HOME</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>


        <section class="whyus">
            <div class="whyus__cards-container">
                <div class="whyus__card">
                    <form action="myStudents" method="POST">
                        <input class="hero__button" type="submit" value="My Students" style="font-size: 20px"/>
                    </form>
                </div>
                <div class="whyus__card">
                    <form action="training" method="POST">
                        <input class="hero__button" type="submit" value="Training" style="font-size: 20px"/>
                    </form>
                </div>
                <div class="whyus__card">
                    <form action="tutorInboxPage" method="POST">
                        <input class="hero__button" type="submit" value="Messages" style="font-size: 20px"/>
                    </form>
                </div>
            </div>
            <div class="whyus__cards-container">
                <div class="whyus__card">
                    <a href="#popup1" class="hero__button" style="font-size: 20px">Log Hours</a>
                </div>
                <div class="whyus__card">
                    <a href="https://calendly.com/event_types/user/me" target="_blank" class="hero__button" style="font-size: 20px">My Calendar</a>
                </div>
                <div class="whyus__card">
                    <a href="https://drive.google.com/drive/folders/13ona_ZvbO7sEz0BWJzq-3v4pjwFQW8Jo" target="_blank" class="hero__button" style="font-size: 20px">My Files</a>
                </div>
            </div>
        </section>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>

        <div id="popup1" class="overlay">
            <div class="popupBig">
                <h2>LOG HOURS</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <!--Creating area for user to type in data below:-->
                    <!--                    <form action="certificate" method="POST">
                                            <input type="submit" value="REQUEST CERTIFICATE">
                                        </form>-->
                    <input type="text" style="display: none; visibility: hidden" name="userName" id="userTexting" value="certificates.sp@gmail.com">
                    <input type="text" style="display: none; visibility: hidden" name="header" id="headerTexting" value="CERTIFICATE REQUEST FROM: ${user}">
                    <input type="text" style="display: none; visibility: hidden" name="message" id="messageText" value="The tutor with username '${user2}' has requested a certificate for their tutoring hours.">
                    <!--Creating button to send data to servlet below:-->
                    <button class="Sbutton" onclick="sendMail(); return false">REQUEST CERTIFICATE</button>
                    <br>
                    <br>
                    <iframe style="width: 680px; height: 280px" src="https://docs.google.com/forms/d/e/1FAIpQLSc1deJYc2XNgiS6-8xLiVPoZeTPavh086vPsKFHeWMfc9cAAQ/viewform?usp=sf_link" title="Tutor Sign Up Form"></iframe>
                </div>
            </div>
        </div>
    </body>
</html>
