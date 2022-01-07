<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Tutor Rules</title>
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
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">TUTOR RULES</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <div class="row2">
            <div class="column2" style="background-color:#aaa;">
                <dl style="text-align: center">
                    <h1>Punctuality</h1>
                    <dt class="colText2">Once you have been late to a meeting with a student three times, you will no longer be permitted to tutor with Student Power. You are considered late if you join a meeting more than 5 minutes after the scheduled time.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Appropriateness</h1>
                    <dt class="colText2">If any inappropriate behavior or language is used during a lesson, you will immediately be removed as part of Student Power. Lessons are recorded and are subject to being audited by administration - lead by example, and be on your best behavior.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Introduction</h1>
                    <dt class="colText2">Remember to introduce yourself properly during every lesson with a student. Check out our template in the "Training" section for more information.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Preparation</h1>
                    <dt class="colText2">Have a rough lesson plan for each meeting that includes appropriate and relevant activities. You can select activities from: Khan Academy, Kahoot, Quizlet, FlipGrid, Gimkit, Quizizz Live, Hippocampus, Edready, or another appropriate online resource.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Personal Information</h1>
                    <dt class="colText2">Remember to always file correct, authentic, and appropriate personal information. All parents and students can view your profile, so make sure it's appropriate.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Ratings</h1>
                    <dt class="colText2">After each session, the tutored student will give you a rating and provide feedback on the class they just had. Your overall rating will appear to both students and parents when they see your profile. The more effort you put into each class, the better your rating will be.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Recordings</h1>
                    <dt class="colText2">Every session should be recorded and uploaded into the correct Google Drive folder. If a session is not recorded, we cannot guarantee that the hours will count in the certificate generated by Student Power.</dt>
                    <br>
                </dl>
            </div>
        </div>
        <br>
        <div style="text-align: center">
            <form action="training" method="POST">
                <input type="submit" class="hero__button" value="Training" style="font-size: 20px">
            </form>
        </div>
        <br>
    </body>
</html>
