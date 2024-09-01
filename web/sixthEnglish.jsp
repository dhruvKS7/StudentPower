<%-- 
    Document   : eighthEnglish
    Created on : Jun 15, 2020, 5:32:51 PM
    Author     : IndianRonaldo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sixth English</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;700&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.1/normalize.css">
        <link rel="stylesheet" type="text/css" href="StylingSheet.css"/>
        <link rel="stylesheet" type="text/css" href="css/homepage.css"/>
    </head>
    <body onclick >
        <!--Creating navbar to login or signup below:-->
        <div class="navbar">
            <nav class="navbar__nav">
                <div class="navbar__dropdown navbar__dropdown--grades">
                    <p class="navbar__grades">Grades <span class="arrow-down"></span></p>
                    <div class="navbar__grades-content">
                        <a class="navbar__link" href="firstClasses.jsp">First Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="secondClasses.jsp">Second Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="thirdClasses.jsp">Third Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="fourthClasses.jsp">Fourth Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="fifthClasses.jsp">Fifth Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="sixthClasses.jsp">Sixth Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="seventhClasses.jsp">Seventh Grade</a>
                        <div class="divider"></div>
                        <a class="navbar__link" href="eighthClasses.jsp">Eighth Grade</a>
                    </div>
                </div>
                <input class="navbar__logo" type="image" src="StudentPowerWritingLogo.png" alt="Student Power Logo" onclick="location.href = 'index.html'"/>
                <div class="navbar__buttons">
                    <div class="navbar__dropdown navbar__dropdown--login">
                        <p class="navbar__login">Login <span class="arrow-down"></span></p>
                        <div class="navbar__login-content">
                            <a class="navbar__link" href="#studentlogin">Student</a>
                            <div class="divider"></div>
                            <a class="navbar__link" href="#tutorlogin">Tutor</a>
                            <div class="divider"></div>
                            <a class="navbar__link" href="#parentlogin">Parent</a>
                        </div>
                    </div>

                </div>
            </nav>
        </div>
        <br>
        <div class="row">
            <div class="column" style="background-color:#aaa;">
                <h1 style="text-align: center">UNIT 1</h1>
                <dl style="text-align: center">
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Vocabulary skills</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Synonyms</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Antonyms</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Prefixes</dt>
                </dl>
            </div>

            <div class="column" style="background-color:#bbb;">
                <h1 style="text-align: center">UNIT 2</h1>
                <dl style="text-align: center">
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Process skills</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Observing</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Predicting</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Communicating</dt>
                </dl>
            </div>

            <div class="column" style="background-color:#ccc;">
                <h1 style="text-align: center">UNIT 3</h1>
                <dl style="text-align: center">
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Advanced reading comprehension</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Metacognition</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Monitoring progressions</dt>
                    <br>
                    <hr style="background-color: black; height: 2px; border: none">
                    <br>
                    <dt class="colText">Generating questions about the text</dt>
                </dl>
            </div>
        </div>
        <br>
        <div class="linkDiv2">
            <a class="hero__button" href="#studentsign" style="font-size: 20px; display: inline-block; width: 40%; text-align: center">FIND A TUTOR</a>
        </div>
        <div class="linkDiv">
            <a class="hero__button" href="#studentsign" style="font-size: 20px; display: inline-block; width: 60%; text-align: center">LEARN A DIFFERENT TOPIC</a>
        </div>
        <div id="studentsign" class="overlay">
            <div class="popup">
                <h2>SIGN UP BOX</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <!--Creating area for user to type in data below:-->
                    <form action="studentSignUp" method="POST">
                        FIRST NAME: <br><input type="text" name="createFirst"/>
                        <br>
                        <br>
                        LAST NAME: <br><input type="text" name="createLast"/>
                        <br>
                        <br>
                        GRADE LEVEL: <br><input style="width: 180px" type="number" name="gradeLevel" min="1" max="8" size="30"/>
                        <br>
                        <br>
                        EMAIL: <br><input type="text" name="enterEmail"/>
                        <br>
                        <br>
                        NEW USER NAME: <br><input type="text" name="createUserName"/>
                        <br>
                        <br>
                        NEW PASSWORD: <br><input type="password" name="createPassword"/>
                        <br>
                        <br>
                        CONFIRM PASSWORD: <br><input type="password" name="confirmPassword"/>
                        <br>
                        <br>
                        CHOOSE YOUR AVATAR: <br><br>
                        <div id="countries">
                            <br>

                            <label>
                                <input type="radio" name="avatarChoose" value="001.png" checked>
                                <img class="dropImg" src="001.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="002.png">
                                <img class="dropImg" src="002.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="003.png" checked>
                                <img class="dropImg" src="003.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="004.png">
                                <img class="dropImg" src="004.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="005.png" checked>
                                <img class="dropImg" src="005.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="006.png">
                                <img class="dropImg" src="006.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="007.png" checked>
                                <img class="dropImg" src="007.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="008.png">
                                <img class="dropImg" src="008.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="009.png" checked>
                                <img class="dropImg" src="009.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="010.png">
                                <img class="dropImg" src="010.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="011.png" checked>
                                <img class="dropImg" src="011.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="012.png">
                                <img class="dropImg" src="012.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="013.png" checked>
                                <img class="dropImg" src="013.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="014.png">
                                <img class="dropImg" src="014.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="015.png" checked>
                                <img class="dropImg" src="015.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="016.png">
                                <img class="dropImg" src="016.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="017.png" checked>
                                <img class="dropImg" src="017.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="018.png">
                                <img class="dropImg" src="018.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="019.png" checked>
                                <img class="dropImg" src="019.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="020.png">
                                <img class="dropImg" src="020.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="021.png" checked>
                                <img class="dropImg" src="021.png">
                            </label>
                            <br>
                            <br>
                        </div>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="SIGNUP"/>
                    </form>
                </div>
            </div>
        </div>

        <div id="tutorsign" class="overlay">
            <div class="popupBig">
                <h2>SIGN UP BOX</h2>
                <a class="close" href="#">&times;</a>
                <a href="https://docs.google.com/forms/d/e/1FAIpQLSdzS7eFGnQUz5IXP0Zp5srdmlw_SpsrHTYpVYbwODocr1TYCg/viewform?usp=sf_link" style="color: white" target="_blank">Can't see the form? Submit your application here.</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <iframe style="width: 680px; height: 280px" src="https://docs.google.com/forms/d/e/1FAIpQLSdzS7eFGnQUz5IXP0Zp5srdmlw_SpsrHTYpVYbwODocr1TYCg/viewform?usp=sf_link" title="Tutor Sign Up Form"></iframe>
                </div>
            </div>
        </div>

        <div id="parentsign" class="overlay">
            <div class="popup">
                <h2>SIGN UP BOX</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <a href="#parentsign1" style="text-decoration: none">
                        <div class="Sbutton" style="text-decoration: none; padding: 10px">
                            <p style="text-decoration: none">My child already has an account</p>
                        </div>
                    </a>
                    <br>
                    <a href="#parentsign2" style="text-decoration: none">
                        <div class="Sbutton" style="text-decoration: none; padding: 10px">
                            <p style="text-decoration: none">My child does not have an account yet</p>
                        </div>
                    </a>
                    <br>
                </div>
            </div>
        </div>

        <div id="parentsign1" class="overlay">
            <div class="popup">
                <h2>SIGN UP BOX</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <!--Creating area for user to type in data below:-->
                    <form action="parentSignUp" method="POST">
                        FIRST NAME: <br><input type="text" name="createFirst"/>
                        <br>
                        <br>
                        LAST NAME: <br><input type="text" name="createLast"/>
                        <br>
                        <br>
                        EMAIL: <br><input type="text" name="enterEmail"/>
                        <br>
                        <br>
                        NEW USER NAME: <br><input type="text" name="createUserName"/>
                        <br>
                        <br>
                        NEW PASSWORD: <br><input type="password" name="createPassword"/>
                        <br>
                        <br>
                        CONFIRM PASSWORD: <br><input type="password" name="confirmPassword"/>
                        <br>
                        <br>
                        CHOOSE YOUR AVATAR: <br><br>
                        <div id="countries">
                            <br>

                            <label>
                                <input type="radio" name="avatarChoose" value="044.png" checked>
                                <img class="dropImg" src="044.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="045.png">
                                <img class="dropImg" src="045.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="046.png" checked>
                                <img class="dropImg" src="046.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="047.png">
                                <img class="dropImg" src="047.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="048.png" checked>
                                <img class="dropImg" src="048.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="049.png">
                                <img class="dropImg" src="049.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="050.png" checked>
                                <img class="dropImg" src="050.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="051.png">
                                <img class="dropImg" src="051.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="052.png" checked>
                                <img class="dropImg" src="052.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="053.png">
                                <img class="dropImg" src="053.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="054.png" checked>
                                <img class="dropImg" src="054.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="055.png">
                                <img class="dropImg" src="055.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="056.png" checked>
                                <img class="dropImg" src="056.png">
                            </label>
                            <br>
                            <br>
                        </div>
                        <br>
                        <br>
                        (Please enter your child's existing account information)<br><br>
                        CHILD'S USERNAME: <br><input type="text" name="childUser"/>
                        <br>
                        <br>
                        CHILD'S PASSWORD: <br><input type="password" name="childPass"/>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="SIGNUP"/>
                    </form>
                </div>
            </div>
        </div>

        <div id="parentsign2" class="overlay">
            <div class="popup">
                <h2>SIGN UP BOX</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <!--Creating area for user to type in data below:-->
                    <form action="parentSignUpWithChild" method="POST">
                        <hr>
                        <br>
                        <p class="whereText">CREATE YOUR PARENT ACCOUNT</p>
                        <hr>
                        <br>
                        YOUR FIRST NAME: <br><input type="text" name="createFirst"/>
                        <br>
                        <br>
                        YOUR LAST NAME: <br><input type="text" name="createLast"/>
                        <br>
                        <br>
                        YOUR EMAIL: <br><input type="text" name="enterEmail"/>
                        <br>
                        <br>
                        YOUR NEW USER NAME: <br><input type="text" name="createUserName"/>
                        <br>
                        <br>
                        YOUR NEW PASSWORD: <br><input type="password" name="createPassword"/>
                        <br>
                        <br>
                        CONFIRM PASSWORD: <br><input type="password" name="confirmPassword"/>
                        <br>
                        <br>
                        CHOOSE YOUR AVATAR: <br><br>
                        <div id="countries">
                            <br>

                            <label>
                                <input type="radio" name="avatarChoose" value="044.png" checked>
                                <img class="dropImg" src="044.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="045.png">
                                <img class="dropImg" src="045.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="046.png" checked>
                                <img class="dropImg" src="046.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="047.png">
                                <img class="dropImg" src="047.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="048.png" checked>
                                <img class="dropImg" src="048.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="049.png">
                                <img class="dropImg" src="049.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="050.png" checked>
                                <img class="dropImg" src="050.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="051.png">
                                <img class="dropImg" src="051.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="052.png" checked>
                                <img class="dropImg" src="052.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="053.png">
                                <img class="dropImg" src="053.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="054.png" checked>
                                <img class="dropImg" src="054.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="055.png">
                                <img class="dropImg" src="055.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose" value="056.png" checked>
                                <img class="dropImg" src="056.png">
                            </label>
                            <br>
                            <br>
                        </div>
                        <br>
                        <br>
                        <hr>
                        <br>
                        <p class="whereText">CREATE YOUR CHILD'S ACCOUNT</p>
                        <hr>
                        <br>
                        CHILD'S FIRST NAME: <br><input type="text" name="createFirst1"/>
                        <br>
                        <br>
                        CHILD'S LAST NAME: <br><input type="text" name="createLast1"/>
                        <br>
                        <br>
                        CHILD'S GRADE LEVEL: <br><input style="width: 180px" type="number" name="gradeLevel1" min="1" max="8" size="30"/>
                        <br>
                        <br>
                        CHILD'S EMAIL: <br><input type="text" name="enterEmail1"/>
                        <br>
                        <br>
                        CHILD'S NEW USER NAME: <br><input type="text" name="createUserName1"/>
                        <br>
                        <br>
                        CHILD'S NEW PASSWORD: <br><input type="password" name="createPassword1"/>
                        <br>
                        <br>
                        CONFIRM PASSWORD: <br><input type="password" name="confirmPassword1"/>
                        <br>
                        <br>
                        CHOOSE THEIR AVATAR: <br><br>
                        <div id="countries">
                            <br>

                            <label>
                                <input type="radio" name="avatarChoose1" value="001.png" checked>
                                <img class="dropImg" src="001.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="002.png">
                                <img class="dropImg" src="002.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="003.png" checked>
                                <img class="dropImg" src="003.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="004.png">
                                <img class="dropImg" src="004.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="005.png" checked>
                                <img class="dropImg" src="005.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="006.png">
                                <img class="dropImg" src="006.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="007.png" checked>
                                <img class="dropImg" src="007.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="008.png">
                                <img class="dropImg" src="008.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="009.png" checked>
                                <img class="dropImg" src="009.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="010.png">
                                <img class="dropImg" src="010.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="011.png" checked>
                                <img class="dropImg" src="011.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="012.png">
                                <img class="dropImg" src="012.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="013.png" checked>
                                <img class="dropImg" src="013.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="014.png">
                                <img class="dropImg" src="014.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="015.png" checked>
                                <img class="dropImg" src="015.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="016.png">
                                <img class="dropImg" src="016.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="017.png" checked>
                                <img class="dropImg" src="017.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="018.png">
                                <img class="dropImg" src="018.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="019.png" checked>
                                <img class="dropImg" src="019.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="020.png">
                                <img class="dropImg" src="020.png">
                            </label>

                            <label>
                                <input type="radio" name="avatarChoose1" value="021.png" checked>
                                <img class="dropImg" src="021.png">
                            </label>
                            <br>
                            <br>
                        </div>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="SIGNUP"/>
                    </form>
                </div>
            </div>
        </div>

        <div id="studentlogin" class="overlay">
            <div class="popup">
                <h2>STUDENT LOGIN</h2>
                <a class="close" href="#">&times;</a>
                <a href="#studentsign" style="color: white">Don't have an account? Make one here.</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="studentLogIn" method="POST">
                        USER NAME: <br><input type="text" name="studentUserName"/>
                        <br>
                        <br>
                        PASSWORD:<br> <input type="password" name="studentPassword"/>
                        <br>
                        <a href="#studentforgot" style="color: white">Forgot Password?</a>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="LOGIN"/>
                    </form>
                </div>
            </div>
        </div>

        <div id="tutorlogin" class="overlay">
            <div class="popup">
                <h2>TUTOR LOGIN</h2>
                <a class="close" href="#">&times;</a>
                <a href="#tutorsign" style="color: white">Don't have an account? Make one here.</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="tutorLogIn" method="POST">
                        USER NAME: <br><input type="text" name="tutorUserName"/>
                        <br>
                        <br>
                        PASSWORD:<br> <input type="password" name="tutorPassword"/>
                        <br>
                        <a href="#tutorforgot" style="color: white">Forgot Password?</a>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="LOGIN"/>
                    </form>
                </div>
            </div>
        </div>

        <div id="parentlogin" class="overlay">
            <div class="popup">
                <h2>PARENT LOGIN</h2>
                <a class="close" href="#">&times;</a>
                <a href="#parentsign" style="color: white">Don't have an account? Make one here.</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="parentLogIn" method="POST">
                        USER NAME: <br><input type="text" name="parentUserName"/>
                        <br>
                        <br>
                        PASSWORD:<br> <input type="password" name="parentPassword"/>
                        <br>
                        <a href="#parentforgot" style="color: white">Forgot Password?</a>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="LOGIN"/>
                    </form>
                </div>
            </div>
        </div>
        <div id="studentforgot" class="overlay">
            <div class="popup">
                <h2>PASSWORD RESET</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="studentForgotPassword" method="POST">
                        ENTER THE EMAIL ASSOCIATED WITH YOUR STUDENT ACCOUNT: <br><input type="text" name="forgotPassword"/>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="SUBMIT"/>
                    </form>
                </div>
            </div>
        </div>
        <div id="tutorforgot" class="overlay">
            <div class="popup">
                <h2>PASSWORD RESET</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="tutorForgotPassword" method="POST">
                        ENTER THE EMAIL ASSOCIATED WITH YOUR TUTOR ACCOUNT: <br><input type="text" name="forgotPassword"/>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="SUBMIT"/>
                    </form>
                </div>
            </div>
        </div>
        <div id="parentforgot" class="overlay">
            <div class="popup">
                <h2>PASSWORD RESET</h2>
                <a class="close" href="#">&times;</a>
                <div class="content">
                    <br>
                    <!--Creating area for user to type in data below:-->
                    <form action="parentForgotPassword" method="POST">
                        ENTER THE EMAIL ASSOCIATED WITH YOUR PARENT ACCOUNT: <br><input type="text" name="forgotPassword"/>
                        <br>
                        <br>
                        <!--Creating button to send data to servlet below:-->
                        <input class="Sbutton" type="submit" value="SUBMIT"/>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>