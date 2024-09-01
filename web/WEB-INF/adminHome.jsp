<%-- 
    Document   : adminHome
    Created on : Jun 5, 2020, 4:20:47 PM
    Author     : IndianRonaldo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="StylingSheet.css"/>
        <title>JSP Page</title>
    </head>
    <body style="background-color: gray" onclick >
        <h1>Hello Admin!</h1>
        <form action="logOut" method="POST"><input type="submit" value="LOGOUT"></form>
        <br>
        <a href="#popup1">
            <input type="submit" value="REGISTER TUTOR">
        </a>
        <br>
        <br>
        <form action="messagingSystemTable" method="POST">
            <input type="submit" value="MESSAGING SYSTEM">
        </form>
        <br>
        <form action="myTutorsTable" method="POST">
            <input type="submit" value="MY TUTORS">
        </form>
        <br>
        <form action="parentChildTable" method="POST">
            <input type="submit" value="PARENT CHILD">
        </form>
        <br>
        <form action="parentInfoTable" method="POST">
            <input type="submit" value="PARENT INFO">
        </form>
        <br>
        <form action="parentLoginTable" method="POST">
            <input type="submit" value="PARENT LOGIN">
        </form>
        <br>
        <form action="tutorInfoTable" method="POST">
            <input type="submit" value="TUTOR INFO">
        </form>
        <br>
        <form action="tutorLoginTable" method="POST">
            <input type="submit" value="TUTOR LOGIN">
        </form>
        <br>
        <form action="userInfoTable" method="POST">
            <input type="submit" value="USER INFO">
        </form>
        <br>
        <form action="userLoginTable" method="POST">
            <input type="submit" value="USER LOGIN">
        </form>
        <div id="popup1" class="overlay">
            <div class="popup">
                <h2>REGISTER TUTOR</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <!--Creating area for user to type in data below:-->
                    <form action="tutorSignUp" method="POST">
                        USER NAME: <br><input type="text" name="createUserName"/>
                        <br>
                        <br>
                        PASSWORD: <br><input type="password" name="createPassword"/>
                        <br>
                        <br>
                        FIRST NAME: <br><input type="text" name="createFirst"/>
                        <br>
                        <br>
                        LAST NAME: <br><input type="text" name="createLast"/>
                        <br>
                        <br>
                        EMAIL: <br><input type="text" name="enterEmail"/>
                        <br>
                        <br>
                        GRADE LEVEL: <br><input type="number" name="gradeLevel"/>
                        <br>
                        <br>
                        SUMMARY/BIO: <br><textarea rows="5" cols="10" id="messageText" name="summary"></textarea>
                        <br>
                        <br>
                        CHOOSE YOUR AVATAR: <br><br>
                        <div id="countries">
                            <br>

                            <label>
                                <input type="radio" name="avatarChoose" value="022.png" checked>
                                <img class="dropImg" src="022.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="023.png">
                                <img class="dropImg" src="023.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="024.png" checked>
                                <img class="dropImg" src="024.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="025.png">
                                <img class="dropImg" src="025.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="026.png" checked>
                                <img class="dropImg" src="026.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="027.png">
                                <img class="dropImg" src="027.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="028.png" checked>
                                <img class="dropImg" src="028.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="029.png">
                                <img class="dropImg" src="029.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="030.png" checked>
                                <img class="dropImg" src="030.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="031.png">
                                <img class="dropImg" src="031.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="032.png" checked>
                                <img class="dropImg" src="032.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="033.png">
                                <img class="dropImg" src="033.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="034.png" checked>
                                <img class="dropImg" src="034.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="035.png">
                                <img class="dropImg" src="035.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="036.png" checked>
                                <img class="dropImg" src="036.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="037.png">
                                <img class="dropImg" src="037.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="038.png" checked>
                                <img class="dropImg" src="038.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="039.png">
                                <img class="dropImg" src="039.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="040.png" checked>
                                <img class="dropImg" src="040.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="041.png">
                                <img class="dropImg" src="041.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="042.png" checked>
                                <img class="dropImg" src="042.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="043.png" checked>
                                <img class="dropImg" src="043.png">
                            </label>
                            <br>
                            <br>
                        </div>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="REGISTER"/>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
