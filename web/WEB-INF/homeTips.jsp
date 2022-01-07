<%--Linking page to servlet and accessing other database languages below:--%>
<%@page import = "java.io.*,java.util.*,java.sql.*"%>
<%@page import = "javax.servlet.http.*,javax.servlet.*"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Home Tips</title>
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
        <h2 class="whyus__title" style="text-align: center; text-transform: uppercase">WHAT TO DO AT HOME</h2>
        <br>
        <div style="height: 1px; background-color: black; margin: 0.5rem 0;"></div>
        <br>
        <div class="row2">
            <div class="column2" style="background-color:#aaa;">
                <dl style="text-align: center">
                    <h1>Set a Schedule</h1>
                    <dt class="colText2">One of the best ways to help your child learn better is to set a schedule that will benefit them. Set specific times to study or to meet with tutors, while also setting aside time to have fun and take a break.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Ensure a Comfortable Learning Environment</h1>
                    <dt class="colText2">Make sure that your child works in an environment where they will not be distracted. They should have any necessary materials near them and should stay focused.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Communicate</h1>
                    <dt class="colText2">Communicate with your child to find ways that you can further help them. Listening to their feedback will assist in facilitating this.</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <h1>Encourage Participation</h1>
                    <dt class="colText2">When your child is being tutored, make sure that they are participating - participation is one of the best ways for students to retain information.</dt>
                    <br>
                </dl>
            </div>
        </div>
        <br>
    </body>
</html>
