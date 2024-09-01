/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspActions;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**

 @author IndianRonaldo
 */
@WebServlet(name = "servletPage",
        loadOnStartup = 1,
        urlPatterns = {"/studentSignUp", "/tutorSignUp", "/parentSignUp",
            "/studentLogIn", "/tutorLogIn", "/parentLogIn", "/parentHome",
            "/studentHome", "/tutorHome", "/errorPage", "/adminHome",
            "/returnError", "/helpPage", "/secureEighthClasses",
            "/secureEighthEnglish", "/secureEighthLanguage", "/secureEighthMath",
            "/secureEighthScience", "/secureEighthSocial", "/secureFifthClasses",
            "/secureFifthEnglish", "/secureFifthLanguage", "/secureFifthMath",
            "/secureFifthScience", "/secureFifthSocial", "/secureFirstClasses",
            "/secureFirstEnglish", "/secureFirstLanguage", "/secureFirstMath",
            "/secureFirstScience", "/secureFirstSocial", "/secureFourthClasses",
            "/secureFourthEnglish", "/secureFourthLanguage", "/secureFourthMath",
            "/secureFourthScience", "/secureFourthSocial", "/secureSecondClasses",
            "/secureSecondEnglish", "/secureSecondLanguage", "/secureSecondMath",
            "/secureSecondScience", "/secureSecondSocial", "/secureSeventhClasses",
            "/secureSeventhEnglish", "/secureSeventhLanguage", "/secureSeventhMath",
            "/secureSeventhScience", "/secureSeventhSocial", "/secureSixthClasses",
            "/secureSixthEnglish", "/secureSixthLanguage", "/secureSixthMath",
            "/secureSixthScience", "/secureSixthSocial", "/secureThirdClasses",
            "/secureThirdEnglish", "/secureThirdLanguage", "/secureThirdMath",
            "/secureThirdScience", "/secureThirdSocial", "/settingsPage",
            "/tutorSettingsPage", "/tutorList", "/myClasses", "/classOverview",
            "/tutorInfo", "/studentInfo", "/addClasses", "/myTutors", "/parentInboxPage",
            "/calendarPage", "/userGuide", "/parentGuide", "/userRules",
            "/tutorRules", "/myStudents", "/tutorCalendar", "/training",
            "/myChild", "/homeTips", "/parentHelpPage", "/tutorHelpPage",
            "/tutorInboxPage", "/studentInboxPage", "/logOut", "/studentEmailSend",
            "/myScheduling", "/parentSettingsPage", "/childTutors",
            "/tutorInfoParent", "/studentSendMessage", "/parentSendMessage",
            "/tutorSendMessage", "/subjectRefresh", "/addTutor", "/addClass",
            "/updateStudentSettings", "/studentChangePassword",
            "/tutorChangePassword", "/parentChangePassword", "/updateTutorSettings",
            "/updateParentSettings", "/studentEmailSend", "/tutorEmailSend",
            "/parentEmailSend", "/certificate", "/addChild",
            "/studentForgotPassword", "/tutorForgotPassword", "/parentForgotPassword",
            "/messagingSystemTable", "/myTutorsTable", "/parentChildTable",
            "/parentInfoTable", "/parentLoginTable", "/tutorInfoTable", "/tutorLoginTable",
            "/userInfoTable", "/userLoginTable", "/updateMessagingSystemTable",
            "/updateMyTutorsTable", "/updateParentChildTable", "/updateParentInfoTable",
            "/updateParentLoginTable", "/updateTutorInfoTable", "/updateTutorLoginTable",
            "/updateUserInfoTable", "/updateUserLoginTable", "/classRefresh",
            "/deleteMyTutors", "/deleteParentChild", "/deleteParentInfo",
            "/deleteParentLogin", "/deleteTutorInfo", "/deleteTutorLogin",
            "/deleteUserInfo", "/deleteUserLogin", "/parentSignUpWithChild"})
public class servletPage extends HttpServlet {
    /**
     Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     @param request servlet request
     @param response servlet response
     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletPage</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletPage at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     Handles the HTTP <code>GET</code> method.
     @param request servlet request
     @param response servlet response
     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    /**
     Handles the HTTP <code>POST</code> method.
     @param request servlet request
     @param response servlet response
     @throws ServletException if a servlet-specific error occurs
     @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        HttpSession session = request.getSession();
        String userPath = request.getServletPath();
        checkIfExisting existing = new checkIfExisting();
        if (userPath.equals("/studentSignUp")) {
            try {
                signUpPage signUp = new signUpPage();
                String newUserName = request.getParameter("createUserName");
                String newPassword = request.getParameter("createPassword");
                String confirmPassword = request.getParameter("confirmPassword");
                String newFirstName = request.getParameter("createFirst");
                String newLastName = request.getParameter("createLast");
                int gradeLevel = Integer.parseInt(request.getParameter("gradeLevel"));
                String email = request.getParameter("enterEmail");
                String avatar = request.getParameter("avatarChoose");
                int userValidity = signUp.characterTester(newUserName);
                int passwordValidity = signUp.characterTester(newPassword);
                int firstValidity = signUp.characterTester(newFirstName);
                int lastValidity = signUp.characterTester(newLastName);
                int emailValidity = signUp.characterTester(email);
                if (confirmPassword.equals(newPassword)) {
                    if (userValidity == 0 && passwordValidity == 0 && firstValidity == 0 && lastValidity == 0 && emailValidity == 0) {
                        //Setting information below:
                        signUp.setConnectionURL("jdbc:mysql://localhost:3306/");
                        signUp.setDbName("studentPowerDatabase");
                        signUp.setUserName(newUserName);
                        signUp.setPassword(newPassword);
                        signUp.setFirstName(newFirstName);
                        signUp.setLastName(newLastName);
                        signUp.setGradeLevel(gradeLevel);
                        signUp.setEmail(email);
                        signUp.setAvatar(avatar);
                        boolean checker = signUp.studentSignUp();
                        //Checking for success below:
                        if (checker == true) {
                            String myUrl = "studentHome";
                            session.setAttribute("currentUserName", newUserName);
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "USERNAME ALREADY EXISTS, USERNAME IS TOO LONG, OR PASSWORD IS TOO LONG (30 CHARACTER MAX)");
                            session.setAttribute("returningPage", "index.html");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        }
                    } else if (userValidity == 1 || passwordValidity == 1 || firstValidity == 1 || lastValidity == 1 || emailValidity == 1) {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "TEXT FIELDS LEFT BLANK");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else if (userValidity == 2 || passwordValidity == 2 || firstValidity == 2 || lastValidity == 2) {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else if (emailValidity == 2) {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "ENTERED EMAIL IS NOT VALID");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "PASSWORDS DO NOT MATCH");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (NumberFormatException ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Sign Up Failure");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorSignUp")) {
            try {
                signUpPage signUp = new signUpPage();
                String newUserName = request.getParameter("createUserName");
                String newPassword = request.getParameter("createPassword");
                String newFirstName = request.getParameter("createFirst");
                String newLastName = request.getParameter("createLast");
                int gradeLevel = Integer.parseInt(request.getParameter("gradeLevel"));
                String email = request.getParameter("enterEmail");
                String summary = request.getParameter("summary");
                String avatar = request.getParameter("avatarChoose");
                int userValidity = signUp.characterTester(newUserName);
                int passwordValidity = signUp.characterTester(newPassword);
                int firstValidity = signUp.characterTester(newFirstName);
                int lastValidity = signUp.characterTester(newLastName);
                int emailValidity = signUp.characterTester(email);
                int summaryValidity = signUp.characterTester(summary);
                if (userValidity == 0 && passwordValidity == 0 && firstValidity == 0 && lastValidity == 0 && emailValidity == 0 && summaryValidity == 0) {
                    //Setting information below:
                    signUp.setConnectionURL("jdbc:mysql://localhost:3306/");
                    signUp.setDbName("studentPowerDatabase");
                    signUp.setUserName(newUserName);
                    signUp.setPassword(newPassword);
                    signUp.setFirstName(newFirstName);
                    signUp.setLastName(newLastName);
                    signUp.setGradeLevel(gradeLevel);
                    signUp.setEmail(email);
                    signUp.setSummary(summary);
                    signUp.setAvatar(avatar);
                    boolean checker = signUp.tutorSignUp();
                    //Checking for success below:
                    if (checker == true) {
                        String myUrl = "adminHome";
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "USERNAME ALREADY EXISTS");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else if (userValidity == 1 || passwordValidity == 1 || firstValidity == 1 || lastValidity == 1 || emailValidity == 1) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "TEXT FIELDS LEFT BLANK");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else if (userValidity == 2 || passwordValidity == 2 || firstValidity == 2 || lastValidity == 2) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else if (emailValidity == 2) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "ENTERED EMAIL IS NOT VALID");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (NumberFormatException ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Sign Up Failure");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentSignUp")) {
            try {
                signUpPage signUp = new signUpPage();
                loginPage login = new loginPage();
                String newUserName = request.getParameter("createUserName");
                String newPassword = request.getParameter("createPassword");
                String confirmPassword = request.getParameter("confirmPassword");
                String newFirstName = request.getParameter("createFirst");
                String newLastName = request.getParameter("createLast");
                String email = request.getParameter("enterEmail");
                String childUsername = request.getParameter("childUser");
                String childPassword = request.getParameter("childPass");
                String avatar = request.getParameter("avatarChoose");
                //Setting information below:
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(childUsername);
                login.setPassword(childPassword);
                boolean check = login.checkStudentLogin();
                if (check == true) {
                    int userValidity = signUp.characterTester(newUserName);
                    int passwordValidity = signUp.characterTester(newPassword);
                    int firstValidity = signUp.characterTester(newFirstName);
                    int lastValidity = signUp.characterTester(newLastName);
                    int emailValidity = signUp.characterTester(email);
                    if (confirmPassword.equals(newPassword)) {
                        if (userValidity == 0 && passwordValidity == 0 && firstValidity == 0 && lastValidity == 0 && emailValidity == 0) {
                            //Setting information below:
                            signUp.setConnectionURL("jdbc:mysql://localhost:3306/");
                            signUp.setDbName("studentPowerDatabase");
                            signUp.setUserName(newUserName);
                            signUp.setPassword(newPassword);
                            signUp.setFirstName(newFirstName);
                            signUp.setLastName(newLastName);
                            signUp.setEmail(email);
                            signUp.setChildName(childUsername);
                            signUp.setAvatar(avatar);
                            boolean checker = signUp.parentSignUp();
                            //Checking for success below:
                            if (checker == true) {
                                String myUrl = "parentHome";
                                session.setAttribute("currentUserName", newUserName);
                                try {
                                    request.getRequestDispatcher(myUrl).forward(request, response);
                                } catch (IOException | ServletException ed) {
                                    ed.printStackTrace();
                                }
                            } else {
                                //Setting error information below:
                                session.setAttribute("causeOfError", "USERNAME ALREADY EXISTS");
                                session.setAttribute("returningPage", "index.html");
                                String myUrl = "errorPage";
                                //Sending user to error page below:
                                try {
                                    request.getRequestDispatcher(myUrl).forward(request, response);
                                } catch (IOException | ServletException ed) {
                                    ed.printStackTrace();
                                }
                            }
                        } else if (userValidity == 1 || passwordValidity == 1 || firstValidity == 1 || lastValidity == 1 || emailValidity == 1) {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "TEXT FIELDS LEFT BLANK");
                            session.setAttribute("returningPage", "index.html");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else if (userValidity == 2 || passwordValidity == 2 || firstValidity == 2 || lastValidity == 2) {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                            session.setAttribute("returningPage", "index.html");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else if (emailValidity == 2) {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "ENTERED EMAIL IS NOT VALID");
                            session.setAttribute("returningPage", "index.html");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "PASSWORDS DO NOT MATCH");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "CHILD IS NOT REGISTERED OR CHILD'S INFORMATION IS INCORRECT");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (NumberFormatException ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Sign Up Failure");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentSignUpWithChild")) {
            try {
                signUpPage signUp = new signUpPage();
                loginPage login = new loginPage();
                String newUserName = request.getParameter("createUserName");
                String newPassword = request.getParameter("createPassword");
                String confirmPassword = request.getParameter("confirmPassword");
                String newFirstName = request.getParameter("createFirst");
                String newLastName = request.getParameter("createLast");
                int gradeLevel1 = Integer.parseInt(request.getParameter("gradeLevel1"));
                String email = request.getParameter("enterEmail");
                String avatar = request.getParameter("avatarChoose");
                String newUserName1 = request.getParameter("createUserName1");
                String newPassword1 = request.getParameter("createPassword1");
                String confirmPassword1 = request.getParameter("confirmPassword1");
                String newFirstName1 = request.getParameter("createFirst1");
                String newLastName1 = request.getParameter("createLast1");
                String email1 = request.getParameter("enterEmail1");
                String avatar1 = request.getParameter("avatarChoose1");
                int userValidity = signUp.characterTester(newUserName1);
                int passwordValidity = signUp.characterTester(newPassword1);
                int firstValidity = signUp.characterTester(newFirstName1);
                int lastValidity = signUp.characterTester(newLastName1);
                int emailValidity = signUp.characterTester(email1);
                if (confirmPassword1.equals(newPassword1)) {
                    if (userValidity == 0 && passwordValidity == 0 && firstValidity == 0 && lastValidity == 0 && emailValidity == 0) {
                        //Setting information below:
                        signUp.setConnectionURL("jdbc:mysql://localhost:3306/");
                        signUp.setDbName("studentPowerDatabase");
                        signUp.setUserName(newUserName1);
                        signUp.setPassword(newPassword1);
                        signUp.setFirstName(newFirstName1);
                        signUp.setLastName(newLastName1);
                        signUp.setGradeLevel(gradeLevel1);
                        signUp.setEmail(email1);
                        signUp.setAvatar(avatar1);
                        boolean checker = signUp.studentSignUp();
                        //Checking for success below:
                        if (checker == true) {
                            //Setting information below:
                            login.setConnectionURL("jdbc:mysql://localhost:3306/");
                            login.setDbName("studentPowerDatabase");
                            login.setUserName(newUserName1);
                            login.setPassword(newPassword1);
                            boolean check = login.checkStudentLogin();
                            if (check == true) {
                                userValidity = signUp.characterTester(newUserName);
                                passwordValidity = signUp.characterTester(newPassword);
                                firstValidity = signUp.characterTester(newFirstName);
                                lastValidity = signUp.characterTester(newLastName);
                                emailValidity = signUp.characterTester(email);
                                if (confirmPassword.equals(newPassword)) {
                                    if (userValidity == 0 && passwordValidity == 0 && firstValidity == 0 && lastValidity == 0 && emailValidity == 0) {
                                        //Setting information below:
                                        signUp.setConnectionURL("jdbc:mysql://localhost:3306/");
                                        signUp.setDbName("studentPowerDatabase");
                                        signUp.setUserName(newUserName);
                                        signUp.setPassword(newPassword);
                                        signUp.setFirstName(newFirstName);
                                        signUp.setLastName(newLastName);
                                        signUp.setEmail(email);
                                        signUp.setChildName(newUserName1);
                                        signUp.setAvatar(avatar);
                                        checker = signUp.parentSignUp();
                                        //Checking for success below:
                                        if (checker == true) {
                                            String myUrl = "parentHome";
                                            session.setAttribute("currentUserName", newUserName);
                                            try {
                                                request.getRequestDispatcher(myUrl).forward(request, response);
                                            } catch (IOException | ServletException ed) {
                                                ed.printStackTrace();
                                            }
                                        } else {
                                            //Setting error information below:
                                            session.setAttribute("causeOfError", "PARENT'S USERNAME ALREADY EXISTS, PARENT'S USERNAME IS TOO LONG, OR PARENT'S PASSWORD IS TOO LONG (30 CHARACTER MAX) - CHILD'S ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                                            session.setAttribute("returningPage", "index.html");
                                            String myUrl = "errorPage";
                                            //Sending user to error page below:
                                            try {
                                                request.getRequestDispatcher(myUrl).forward(request, response);
                                            } catch (IOException | ServletException ed) {
                                                ed.printStackTrace();
                                            }
                                        }
                                    } else if (userValidity == 1 || passwordValidity == 1 || firstValidity == 1 || lastValidity == 1 || emailValidity == 1) {
                                        //Setting error information below:
                                        session.setAttribute("causeOfError", "PARENT'S TEXT FIELDS LEFT BLANK - CHILD'S ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                                        session.setAttribute("returningPage", "index.html");
                                        String myUrl = "errorPage";
                                        //Sending user to error page below:
                                        try {
                                            request.getRequestDispatcher(myUrl).forward(request, response);
                                        } catch (IOException | ServletException ed) {
                                            ed.printStackTrace();
                                        }
                                    } else if (userValidity == 2 || passwordValidity == 2 || firstValidity == 2 || lastValidity == 2) {
                                        //Setting error information below:
                                        session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED - CHILD'S ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                                        session.setAttribute("returningPage", "index.html");
                                        String myUrl = "errorPage";
                                        //Sending user to error page below:
                                        try {
                                            request.getRequestDispatcher(myUrl).forward(request, response);
                                        } catch (IOException | ServletException ed) {
                                            ed.printStackTrace();
                                        }
                                    } else if (emailValidity == 2) {
                                        //Setting error information below:
                                        session.setAttribute("causeOfError", "PARENT'S ENTERED EMAIL IS NOT VALID - CHILD'S ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                                        session.setAttribute("returningPage", "index.html");
                                        String myUrl = "errorPage";
                                        //Sending user to error page below:
                                        try {
                                            request.getRequestDispatcher(myUrl).forward(request, response);
                                        } catch (IOException | ServletException ed) {
                                            ed.printStackTrace();
                                        }
                                    }
                                } else {
                                    //Setting error information below:
                                    session.setAttribute("causeOfError", "PARENT'S PASSWORDS DO NOT MATCH - CHILD'S ACCOUNT HAS BEEN SUCCESSFULLY CREATED");
                                    session.setAttribute("returningPage", "index.html");
                                    String myUrl = "errorPage";
                                    //Sending user to error page below:
                                    try {
                                        request.getRequestDispatcher(myUrl).forward(request, response);
                                    } catch (IOException | ServletException ed) {
                                        ed.printStackTrace();
                                    }
                                }
                            } else {
                                //Setting error information below:
                                session.setAttribute("causeOfError", "CHILD IS NOT REGISTERED OR CHILD'S INFORMATION IS INCORRECT");
                                session.setAttribute("returningPage", "index.html");
                                String myUrl = "errorPage";
                                //Sending user to error page below:
                                try {
                                    request.getRequestDispatcher(myUrl).forward(request, response);
                                } catch (IOException | ServletException ed) {
                                    ed.printStackTrace();
                                }
                            }
                            String myUrl = "studentHome";
                            session.setAttribute("currentUserName", newUserName);
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "CHILD'S USERNAME ALREADY EXISTS, CHILD'S USERNAME IS TOO LONG, OR CHILD'S PASSWORD IS TOO LONG (30 CHARACTER MAX)");
                            session.setAttribute("returningPage", "index.html");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        }
                    } else if (userValidity == 1 || passwordValidity == 1 || firstValidity == 1 || lastValidity == 1 || emailValidity == 1) {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "TEXT FIELDS LEFT BLANK");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else if (userValidity == 2 || passwordValidity == 2 || firstValidity == 2 || lastValidity == 2) {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else if (emailValidity == 2) {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "ENTERED EMAIL IS NOT VALID");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "CHILD'S PASSWORDS DO NOT MATCH");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (NumberFormatException ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Sign Up Failure");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentLogIn")) {
            try {
                loginPage login = new loginPage();
                //Getting data from JSP file below:
                String userName = request.getParameter("studentUserName");
                String password = request.getParameter("studentPassword");
                //Setting information below:
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(userName);
                login.setPassword(password);
                boolean master = login.checkAdmin();
                if (master == true) {
                    String myUrl = "adminHome";
                    session.setAttribute("currentUserName", userName);
                    //Sending user to page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    boolean checker = login.checkStudentLogin();
                    //Checking success below:
                    if (checker == true) {
                        String myUrl = "studentHome";
                        session.setAttribute("currentUserName", userName);
                        //Sending user to page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "Username or Password is Incorrect");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                }
                //Catching exceptions below:
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Login Failed");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorLogIn")) {
            try {
                loginPage login = new loginPage();
                //Getting data from JSP file below:
                String userName = request.getParameter("tutorUserName");
                String password = request.getParameter("tutorPassword");
                //Setting information below:
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(userName);
                login.setPassword(password);
                boolean master = login.checkAdmin();
                if (master == true) {
                    String myUrl = "adminHome";
                    session.setAttribute("currentUserName", userName);
                    //Sending user to page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    boolean checker = login.checkTutorLogin();
                    //Checking success below:
                    if (checker == true) {
                        String myUrl = "tutorHome";
                        session.setAttribute("currentUserName", userName);
                        //Sending user to page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "Username or Password is Incorrect");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                }
                //Catching exceptions below:
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Login Failed");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentLogIn")) {
            try {
                loginPage login = new loginPage();
                //Getting data from JSP file below:
                String userName = request.getParameter("parentUserName");
                String password = request.getParameter("parentPassword");
                //Setting information below:
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(userName);
                login.setPassword(password);
                boolean master = login.checkAdmin();
                if (master == true) {
                    String myUrl = "adminHome";
                    session.setAttribute("currentUserName", userName);
                    //Sending user to page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    boolean checker = login.checkParentLogin();
                    //Checking success below:
                    if (checker == true) {
                        String myUrl = "parentHome";
                        session.setAttribute("currentUserName", userName);
                        //Sending user to page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "Username or Password is Incorrect");
                        session.setAttribute("returningPage", "index.html");
                        String myUrl = "errorPage";
                        //Sending user to page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                }
                //Catching exceptions below:
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Login Failed");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentHome")) {
            try {
                linksPage files = new linksPage();
                String currentUser = (String) session.getAttribute("currentUserName");
                files.setUserName(currentUser);
//                System.out.println(currentUser);
                ArrayList<ArrayList<String>> members = files.getDrive();
                ArrayList<String> stuff = members.get(0);
                String driveLink = stuff.get(13);
                session.setAttribute("fileLink", driveLink);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Student Home");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentHome")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Parent Home");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorHome")) {
            try {
                String currentUserName = (String) session.getAttribute("currentUserName");
                session.setAttribute("user", currentUserName);
                session.setAttribute("user2", currentUserName);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Tutor Home");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/errorPage")) {
            try {
                //Setting error information below:
                String error = (String) session.getAttribute("causeOfError");
//                System.out.println("ERROR:" + error);
                session.setAttribute("errorReason", error);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "something's really messed up...");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/returnError")) {
            try {
                //Travelling to another JSP page below:
                String myUrl = (String) session.getAttribute("returningPage");
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING BACK");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/adminHome")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Admin Home");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentHelpPage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/settingsPage")) {
            try {
                //Displaying information from the database below:
                settings settingsPage = new settings();
                String currentUser = (String) session.getAttribute("currentUserName");
                settingsPage.setUserName(currentUser);
                ArrayList<ArrayList<String>> members = settingsPage.getUserInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorSettingsPage")) {
            try {
                //Displaying information from the database below:
                settings settingsPage = new settings();
                String currentUser = (String) session.getAttribute("currentUserName");
                settingsPage.setUserName(currentUser);
                ArrayList<ArrayList<String>> members = settingsPage.getTutorInfo();
                session.setAttribute("dbData", members);
                ArrayList<String> stuff = members.get(0);
                if (stuff.get(14).equals("1")) {
                    session.setAttribute("first", "checked");
                } else {
                    session.setAttribute("first", "unchecked");
                }
                if (stuff.get(15).equals("1")) {
                    session.setAttribute("second", "checked");
                } else {
                    session.setAttribute("second", "unchecked");
                }
                if (stuff.get(16).equals("1")) {
                    session.setAttribute("third", "checked");
                } else {
                    session.setAttribute("third", "unchecked");
                }
                if (stuff.get(17).equals("1")) {
                    session.setAttribute("fourth", "checked");
                } else {
                    session.setAttribute("fourth", "unchecked");
                }
                if (stuff.get(18).equals("1")) {
                    session.setAttribute("fifth", "checked");
                } else {
                    session.setAttribute("fifth", "unchecked");
                }
                if (stuff.get(19).equals("1")) {
                    session.setAttribute("sixth", "checked");
                } else {
                    session.setAttribute("sixth", "unchecked");
                }
                if (stuff.get(20).equals("1")) {
                    session.setAttribute("seventh", "checked");
                } else {
                    session.setAttribute("seventh", "unchecked");
                }
                if (stuff.get(21).equals("1")) {
                    session.setAttribute("eighth", "checked");
                } else {
                    session.setAttribute("eighth", "unchecked");
                }
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/addClasses")) {
            try {
                //Displaying information from the database below:
                String userName = (String) session.getAttribute("currentUserName");
                classes classesPage = new classes();
                classesPage.setUserName(userName);
                ArrayList<ArrayList<String>> members = classesPage.getMyNotClasses();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/calendarPage")) {
            try {
                //Displaying information from the database below:
                String userName = request.getParameter("user");
                linksPage links = new linksPage();
                links.setUserName(userName);
                ArrayList<ArrayList<String>> members = links.getCalendar();
                ArrayList<String> stuff = members.get(0);
                String link = stuff.get(22);
                session.setAttribute("calendarLink", link);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/classOverview")) {
            try {
                //Displaying information from the database below:
                String className = request.getParameter("className");
                String userName = (String) session.getAttribute("currentUserName");
                classes classPages = new classes();
                ArrayList<ArrayList<String>> members = classPages.classOverview(className, userName);
                session.setAttribute("className", className);
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/homeTips")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/myChild")) {
            try {
                //Displaying information from the database below:
                childListing child = new childListing();
                String current = (String) session.getAttribute("currentUserName");
                child.setParentName(current);
                ArrayList<ArrayList<String>> members = child.getMyChildren();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/myClasses")) {
            try {
                //Displaying information from the database below:
                classes classPages = new classes();
                String userName = (String) session.getAttribute("currentUserName");
                classPages.setUserName(userName);
                ArrayList<ArrayList<String>> members = classPages.getMyClasses();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/myStudents")) {
            try {
                //Displaying information from the database below:
                tutorListing tutors = new tutorListing();
                String userName = (String) session.getAttribute("currentUserName");
                tutors.setUserName(userName);
                ArrayList<ArrayList<String>> members = tutors.getMyStudents();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/myTutors")) {
            try {
                //Displaying information from the database below:
                session.setAttribute("selectedClass", "science");
                tutorListing tutors = new tutorListing();
                String userName = (String) session.getAttribute("currentUserName");
                tutors.setUserName(userName);
                ArrayList<ArrayList<String>> members = tutors.getMyTutors();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentInboxPage")) {
            try {
                //Displaying information from the database below:
                messagingSystem messagesDatabase = new messagingSystem();
                messagesDatabase.setDbName("studentPowerDatabase");
                messagesDatabase.setTableName("messagingSystem");
                String currentUser = (String) session.getAttribute("currentUserName");
                ArrayList<ArrayList<String>> members = messagesDatabase.specificMessagesDisplay(currentUser);
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO INBOX");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentGuide")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/helpPage")) {
            try {
                String myUrl = "/WEB-INF" + "/studentHelpPage" + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentInboxPage")) {
            try {
                //Displaying information from the database below:
                messagingSystem messagesDatabase = new messagingSystem();
                messagesDatabase.setDbName("studentPowerDatabase");
                messagesDatabase.setTableName("messagingSystem");
                String currentUser = (String) session.getAttribute("currentUserName");
                ArrayList<ArrayList<String>> members = messagesDatabase.specificMessagesDisplay(currentUser);
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO INBOX");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentInfo")) {
            try {
                //Displaying information from the database below:
                String user = request.getParameter("user");
                settings tutor = new settings();
                tutor.setUserName(user);
                ArrayList<ArrayList<String>> members = tutor.getUserInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/training")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorHelpPage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorInfo")) {
            try {
                //Displaying information from the database below:
                String user = request.getParameter("user");
                settings tutor = new settings();
                tutor.setUserName(user);
                ArrayList<ArrayList<String>> members = tutor.getTutorInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorInboxPage")) {
            try {
                //Displaying information from the database below:
                messagingSystem messagesDatabase = new messagingSystem();
                messagesDatabase.setDbName("studentPowerDatabase");
                messagesDatabase.setTableName("messagingSystem");
                String currentUser = (String) session.getAttribute("currentUserName");
                ArrayList<ArrayList<String>> members = messagesDatabase.specificMessagesDisplay(currentUser);
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO INBOX");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorList")) {
            try {
                //Displaying information from the database below:
                String currentUser = (String) session.getAttribute("currentUserName");
                studentListing student = new studentListing();
                student.setUserName(currentUser);
                ArrayList<ArrayList<String>> stuff = student.getUserInfo();
                ArrayList<String> stuff2 = stuff.get(0);
                String gradeNumber = stuff2.get(4);
                String gradeName = "";
                if (gradeNumber.equals("1")) {
                    gradeName = "first";
                } else if (gradeNumber.equals("2")) {
                    gradeName = "second";
                } else if (gradeNumber.equals("3")) {
                    gradeName = "third";
                } else if (gradeNumber.equals("4")) {
                    gradeName = "fourth";
                } else if (gradeNumber.equals("5")) {
                    gradeName = "fifth";
                } else if (gradeNumber.equals("6")) {
                    gradeName = "sixth";
                } else if (gradeNumber.equals("7")) {
                    gradeName = "seventh";
                } else if (gradeNumber.equals("8")) {
                    gradeName = "eighth";
                }
                tutorListing tutor = new tutorListing();
                ArrayList<ArrayList<String>> members = tutor.getScienceTutors(gradeName);
                session.setAttribute("dbData", members);
                session.setAttribute("selectedClass", "science");
                String className = (String) session.getAttribute("selectedClass");
                String text = gradeName + " grade " + className;
                session.setAttribute("classNameText", text);
                session.setAttribute("test", "1");
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorRules")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/userGuide")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/userRules")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFirstClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFirstEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFirstLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFirstMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFirstScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFirstSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSecondClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSecondEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSecondLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSecondMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSecondScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSecondSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureThirdClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureThirdEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureThirdLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureThirdMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureThirdScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureThirdSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFourthClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFourthEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFourthLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFourthMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFourthScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFourthSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFifthClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFifthEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFifthLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFifthMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFifthScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureFifthSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSixthClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSixthEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSixthLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSixthMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSixthScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSixthSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSeventhClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSeventhEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSeventhLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSeventhMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSeventhScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureSeventhSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureEighthClasses")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureEighthEnglish")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureEighthLanguage")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureEighthMath")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureEighthScience")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/secureEighthSocial")) {
            try {
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/logOut")) {
            try {
                session.setAttribute("currentUserName", "");
                String myUrl = "index.html";
                //Travelling to another JSP page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR LOGGING OUT");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "ErrorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/myScheduling")) {
            try {
                //Displaying information from the database below:
                tutorListing tutors = new tutorListing();
                String userName = (String) session.getAttribute("currentUserName");
                tutors.setUserName(userName);
                ArrayList<ArrayList<String>> members = tutors.getMyTutors();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception e) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Error Going To Page");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentSettingsPage")) {
            try {
                //Displaying information from the database below:
                settings settingsPage = new settings();
                String currentUser = (String) session.getAttribute("currentUserName");
                settingsPage.setUserName(currentUser);
                ArrayList<ArrayList<String>> members = settingsPage.getParentInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/childTutors")) {
            try {
                //Displaying information from the database below:
                childListing child = new childListing();
                String current = (String) session.getAttribute("currentUserName");
                child.setParentName(current);
                ArrayList<ArrayList<String>> members = child.getMyChildrenTutors();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorInfoParent")) {
            try {
                //Displaying information from the database below:
                String user = request.getParameter("user");
                settings tutor = new settings();
                tutor.setUserName(user);
                ArrayList<ArrayList<String>> members = tutor.getTutorInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentSendMessage")) {
            try {
                //Getting information from JSP file below:
                String currentUser = (String) session.getAttribute("currentUserName");
                messagingSystem sendMessage = new messagingSystem();
                String recipient = request.getParameter("userNameSend");
                String message = request.getParameter("message");
                message = message.replace("\n", " ").replace("\r", " ");
                int messageValidity = sendMessage.characterTester(message);
                if (messageValidity == 0) {
                    //Setting information below:
                    sendMessage.setConnectionURL("jdbc:mysql://localhost:3306/");
                    sendMessage.setDbName("studentPowerDatabase");
                    sendMessage.setRecipient(recipient);
                    sendMessage.setMessage(message);
                    sendMessage.setSender(currentUser);
                    existing.setUserName(recipient);
                    //Checking for misinformation below:
                    boolean existingCheck = existing.existingUsername();
                    if (existingCheck == true) {
                        boolean checker = sendMessage.sendMessages();
                        String myUrl = "studentInboxPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "RECIPIENT DOES NOT EXIST");
                        session.setAttribute("returningPage", "studentHome");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else if (messageValidity == 1) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "MESSAGE FIELD EMPTY");
                    session.setAttribute("returningPage", "studentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else if (messageValidity == 2) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                    session.setAttribute("returningPage", "studentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR SENDING MESSAGE");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorSendMessage")) {
            try {
                //Getting information from JSP file below:
                String currentUser = (String) session.getAttribute("currentUserName");
                messagingSystem sendMessage = new messagingSystem();
                String recipient = request.getParameter("userNameSend");
                String message = request.getParameter("message");
                message = message.replace("\n", " ").replace("\r", " ");
                int messageValidity = sendMessage.characterTester(message);
                if (messageValidity == 0) {
                    //Setting information below:
                    sendMessage.setConnectionURL("jdbc:mysql://localhost:3306/");
                    sendMessage.setDbName("studentPowerDatabase");
                    sendMessage.setRecipient(recipient);
                    sendMessage.setMessage(message);
                    sendMessage.setSender(currentUser);
                    existing.setUserName(recipient);
                    //Checking for misinformation below:
                    boolean existingCheck = existing.existingUsername();
                    if (existingCheck == true) {
                        boolean checker = sendMessage.sendMessages();
                        String myUrl = "tutorInboxPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "RECIPIENT DOES NOT EXIST");
                        session.setAttribute("returningPage", "tutorHome");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else if (messageValidity == 1) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "MESSAGE FIELD EMPTY");
                    session.setAttribute("returningPage", "tutorHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else if (messageValidity == 2) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                    session.setAttribute("returningPage", "tutorHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR SENDING MESSAGE");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentSendMessage")) {
            try {
                //Getting information from JSP file below:
                String currentUser = (String) session.getAttribute("currentUserName");
                messagingSystem sendMessage = new messagingSystem();
                String recipient = request.getParameter("userNameSend");
                String message = request.getParameter("message");
                message = message.replace("\n", " ").replace("\r", " ");
                int messageValidity = sendMessage.characterTester(message);
                if (messageValidity == 0) {
                    //Setting information below:
                    sendMessage.setConnectionURL("jdbc:mysql://localhost:3306/");
                    sendMessage.setDbName("studentPowerDatabase");
                    sendMessage.setRecipient(recipient);
                    sendMessage.setMessage(message);
                    sendMessage.setSender(currentUser);
                    existing.setUserName(recipient);
                    //Checking for misinformation below:
                    boolean existingCheck = existing.existingUsername();
                    if (existingCheck == true) {
                        boolean checker = sendMessage.sendMessages();
                        String myUrl = "parentInboxPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "RECIPIENT DOES NOT EXIST");
                        session.setAttribute("returningPage", "parentHome");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else if (messageValidity == 1) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "MESSAGE FIELD EMPTY");
                    session.setAttribute("returningPage", "parentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else if (messageValidity == 2) {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "CERTAIN CHARACTERS NOT ACCEPTED");
                    session.setAttribute("returningPage", "parentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR SENDING MESSAGE");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/subjectRefresh")) {
            String classNameSet = request.getParameter("subjects");
            session.setAttribute("selectedClass", classNameSet);
            System.out.println("CLASSSSS: " + classNameSet);
            //Displaying information from the database below:
            String currentUser = (String) session.getAttribute("currentUserName");
            studentListing student = new studentListing();
            student.setUserName(currentUser);
            ArrayList<ArrayList<String>> stuff = student.getUserInfo();
            ArrayList<String> stuff2 = stuff.get(0);
            String gradeNumber = stuff2.get(4);
            String gradeName = "";
            if (gradeNumber.equals("1")) {
                gradeName = "first";
            } else if (gradeNumber.equals("2")) {
                gradeName = "second";
            } else if (gradeNumber.equals("3")) {
                gradeName = "third";
            } else if (gradeNumber.equals("4")) {
                gradeName = "fourth";
            } else if (gradeNumber.equals("5")) {
                gradeName = "fifth";
            } else if (gradeNumber.equals("6")) {
                gradeName = "sixth";
            } else if (gradeNumber.equals("7")) {
                gradeName = "seventh";
            } else if (gradeNumber.equals("8")) {
                gradeName = "eighth";
            } else {
                gradeName = "eighth";
            }
            tutorListing tutor = new tutorListing();
            ArrayList<ArrayList<String>> members = null;
            String className = (String) session.getAttribute("selectedClass");
            if (className.equals("math")) {
                members = tutor.getMathTutors(gradeName);
            } else if (className.equals("science")) {
                members = tutor.getScienceTutors(gradeName);
            } else if (className.equals("social")) {
                members = tutor.getSocialTutors(gradeName);
            } else if (className.equals("english")) {
                members = tutor.getEnglishTutors(gradeName);
            } else if (className.equals("french")) {
                members = tutor.getFrenchTutors(gradeName);
            } else if (className.equals("spanish")) {
                members = tutor.getSpanishTutors(gradeName);
            } else if (className.equals("chinese")) {
                members = tutor.getChineseTutors(gradeName);
            } else if (className.equals("")) {
                members = tutor.getScienceTutors(gradeName);
            }
            session.setAttribute("dbData", members);
            String text = gradeName + " grade " + className;
            session.setAttribute("classNameText", text);
            session.setAttribute("test", "1");
            String myUrl = "/WEB-INF" + "/tutorList" + ".jsp";
            try {
                request.getRequestDispatcher(myUrl).forward(request, response);
                //Catching exceptions below:
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        } else if (userPath.equals("/addTutor")) {
            String test = (String) session.getAttribute("test");
            if (test.equals("1")) {
                String tutorName = request.getParameter("user");
                String userName = (String) session.getAttribute("currentUserName");
                String className = (String) session.getAttribute("selectedClass");
                settings info = new settings();
                info.setUserName(tutorName);
                ArrayList<ArrayList<String>> stuff = info.getTutorInfo();
                ArrayList<String> stuff2 = stuff.get(0);
                String tutorFirst = stuff2.get(2);
                String tutorLast = stuff2.get(3);
                String rating = stuff2.get(23);
                String tutorEmail = stuff2.get(1);
                info.setUserName(userName);
                stuff = info.getUserInfo();
                stuff2 = stuff.get(0);
                String studentFirst = stuff2.get(2);
                String studentLast = stuff2.get(3);
                String studentEmail = stuff2.get(1);
//            System.out.println("aksndaksnd");
//            System.out.println(className);
//            System.out.println("TutorName: " + tutorName);
//            System.out.println("TutorFirst: " + tutorFirst);
//            System.out.println("TutorLast: " + tutorLast);
//            System.out.println("Email: " + tutorEmail);
//            System.out.println("Rating: " + rating);
//            System.out.println("UserName: " + userName);
//            System.out.println("UserFirst: " + studentFirst);
//            System.out.println("UserLast: " + studentLast);
//            System.out.println("Email: " + studentEmail);
                tutorListing tutor = new tutorListing();
                boolean checker = tutor.addTutor(tutorName, userName, className, tutorFirst, tutorLast, studentFirst, studentLast, rating, tutorEmail, studentEmail);
                if (checker == true) {
                    session.setAttribute("test", "0");
                    String myUrl = "myTutors";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "The selected tutor is already tutoring you");
                    session.setAttribute("returningPage", "studentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else {
                String myUrl = "myTutors";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/addClass")) {
            classes update = new classes();
            String userName = (String) session.getAttribute("currentUserName");
            String newClass = request.getParameter("className");
            update.setUserName(userName);
            boolean checker = update.addClasses(newClass);
            if (checker == true) {
                String myUrl = "myClasses";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else {
                //Setting error information below:
                session.setAttribute("causeOfError", "Something went wrong...");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateStudentSettings")) {
            settings update = new settings();
            String userName = request.getParameter("user");
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String gradeLevelString = request.getParameter("gradeLevel");
            int emailVal = update.characterTester(email);
            int firstVal = update.characterTester(firstName);
            int lastVal = update.characterTester(lastName);
            int gradeVal = update.characterTester(gradeLevelString);
            if (emailVal == 0 && firstVal == 0 && lastVal == 0 && gradeVal == 0) {
                update.setUserName(userName);
                update.setEmail(email);
                update.setFirstName(firstName);
                update.setLastName(lastName);
                update.setGradeLevel(Integer.parseInt(gradeLevelString));
                boolean checker = update.updateStudentSettings();
                if (checker == true) {
                    String myUrl = "settingsPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Something went wrong...");
                    session.setAttribute("returningPage", "studentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else if (emailVal == 1 || firstVal == 1 || lastVal == 1 || gradeVal == 1) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain text fields left blank");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else if (emailVal == 2 || firstVal == 2 || lastVal == 2 || gradeVal == 2) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain characters not accepted");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateTutorSettings")) {
            settings update = new settings();
            String userName = request.getParameter("user");
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String summary = request.getParameter("summary");
            String calendarLink = request.getParameter("calendarLink");
            String gradeLevelString = request.getParameter("gradeLevel");
            String first = request.getParameter("first");
            String second = request.getParameter("second");
            String third = request.getParameter("third");
            String fourth = request.getParameter("fourth");
            String fifth = request.getParameter("fifth");
            String sixth = request.getParameter("sixth");
            String seventh = request.getParameter("seventh");
            String eighth = request.getParameter("eighth");
            int emailVal = update.characterTester(email);
            int firstVal = update.characterTester(firstName);
            int lastVal = update.characterTester(lastName);
            int sumVal = update.characterTester(summary);
            int calVal = update.characterTester(calendarLink);
            int gradeVal = update.characterTester(gradeLevelString);
            if (emailVal == 0 && firstVal == 0 && lastVal == 0 && sumVal == 0 && calVal == 0 && gradeVal == 0) {
                if (first != null) {
                    update.setFirst(1);
                } else {
                    update.setFirst(0);
                }
                if (second != null) {
                    update.setSecond(1);
                } else {
                    update.setSecond(0);
                }
                if (third != null) {
                    update.setThird(1);
                } else {
                    update.setThird(0);
                }
                if (fourth != null) {
                    update.setFourth(1);
                } else {
                    update.setFourth(0);
                }
                if (fifth != null) {
                    update.setFifth(1);
                } else {
                    update.setFifth(0);
                }
                if (sixth != null) {
                    update.setSixth(1);
                } else {
                    update.setSixth(0);
                }
                if (seventh != null) {
                    update.setSeventh(1);
                } else {
                    update.setSeventh(0);
                }
                if (eighth != null) {
                    update.setEighth(1);
                } else {
                    update.setEighth(0);
                }
                update.setUserName(userName);
                update.setEmail(email);
                update.setFirstName(firstName);
                update.setLastName(lastName);
                update.setGradeLevel(Integer.parseInt(gradeLevelString));
                update.setSummary(summary);
                update.setCalendarLink(calendarLink);
                boolean checker = update.updateTutorSettings();
                if (checker == true) {
                    String myUrl = "tutorSettingsPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Something went wrong...");
                    session.setAttribute("returningPage", "tutorHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else if (emailVal == 1 || firstVal == 1 || lastVal == 1 || sumVal == 1 || calVal == 1 || gradeVal == 1) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain text fields left blank");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else if (emailVal == 2 || firstVal == 2 || lastVal == 2 || sumVal == 2 || calVal == 2 || gradeVal == 2) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain characters not accepted");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateParentSettings")) {
            settings update = new settings();
            String userName = request.getParameter("user");
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            int emailVal = update.characterTester(email);
            int firstVal = update.characterTester(firstName);
            int lastVal = update.characterTester(lastName);
            if (emailVal == 0 && firstVal == 0 && lastVal == 0) {
                update.setUserName(userName);
                update.setEmail(email);
                update.setFirstName(firstName);
                update.setLastName(lastName);
                boolean checker = update.updateParentSettings();
                if (checker == true) {
                    String myUrl = "parentSettingsPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Something went wrong...");
                    session.setAttribute("returningPage", "parentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else if (emailVal == 1 || firstVal == 1 || lastVal == 1) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain text fields left blank");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else if (emailVal == 2 || firstVal == 2 || lastVal == 2) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain characters not accepted");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentChangePassword")) {
            settings pass = new settings();
            String oldPass = request.getParameter("oldPassword");
            String newPass = request.getParameter("newPassword");
            String confirm = request.getParameter("confirmPassword");
            String userName = (String) session.getAttribute("currentUserName");
            int oldVal = pass.characterTester(oldPass);
            int newVal = pass.characterTester(newPass);
            int conVal = pass.characterTester(confirm);
            if (oldVal == 0 && newVal == 0 && conVal == 0) {
                loginPage login = new loginPage();
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(userName);
                login.setPassword(oldPass);
                boolean check = login.checkStudentLogin();
                if (check == true) {
                    if (newPass.equals(confirm)) {
                        pass.setUserName(userName);
                        pass.setPassword(newPass);
                        boolean checker = pass.updateStudentPassword();
                        if (checker == true) {
                            String myUrl = "settingsPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "Something went wrong...");
                            session.setAttribute("returningPage", "studentHome");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "Passwords don't match");
                        session.setAttribute("returningPage", "studentHome");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Current username or password is incorrect");
                    session.setAttribute("returningPage", "studentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else if (oldVal == 1 || newVal == 1 || conVal == 1) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain text fields left blank");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else if (oldVal == 2 || newVal == 2 || conVal == 2) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain characters not accepted");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorChangePassword")) {
            settings pass = new settings();
            String oldPass = request.getParameter("oldPassword");
            String newPass = request.getParameter("newPassword");
            String confirm = request.getParameter("confirmPassword");
            String userName = (String) session.getAttribute("currentUserName");
            int oldVal = pass.characterTester(oldPass);
            int newVal = pass.characterTester(newPass);
            int conVal = pass.characterTester(confirm);
            if (oldVal == 0 && newVal == 0 && conVal == 0) {
                loginPage login = new loginPage();
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(userName);
                login.setPassword(oldPass);
                boolean check = login.checkTutorLogin();
                if (check == true) {
                    if (newPass.equals(confirm)) {
                        pass.setUserName(userName);
                        pass.setPassword(newPass);
                        boolean checker = pass.updateTutorPassword();
                        if (checker == true) {
                            String myUrl = "tutorSettingsPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "Something went wrong...");
                            session.setAttribute("returningPage", "tutorHome");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "Passwords don't match");
                        session.setAttribute("returningPage", "tutorHome");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Current username or password is incorrect");
                    session.setAttribute("returningPage", "tutorHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else if (oldVal == 1 || newVal == 1 || conVal == 1) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain text fields left blank");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else if (oldVal == 2 || newVal == 2 || conVal == 2) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain characters not accepted");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentChangePassword")) {
            settings pass = new settings();
            String oldPass = request.getParameter("oldPassword");
            String newPass = request.getParameter("newPassword");
            String confirm = request.getParameter("confirmPassword");
            String userName = (String) session.getAttribute("currentUserName");
            int oldVal = pass.characterTester(oldPass);
            int newVal = pass.characterTester(newPass);
            int conVal = pass.characterTester(confirm);
            if (oldVal == 0 && newVal == 0 && conVal == 0) {
                loginPage login = new loginPage();
                login.setConnectionURL("jdbc:mysql://localhost:3306/");
                login.setDbName("studentPowerDatabase");
                login.setUserName(userName);
                login.setPassword(oldPass);
                boolean check = login.checkParentLogin();
                if (check == true) {
                    if (newPass.equals(confirm)) {
                        pass.setUserName(userName);
                        pass.setPassword(newPass);
                        boolean checker = pass.updateParentPassword();
                        if (checker == true) {
                            String myUrl = "parentSettingsPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        } else {
                            //Setting error information below:
                            session.setAttribute("causeOfError", "Something went wrong...");
                            session.setAttribute("returningPage", "parentHome");
                            String myUrl = "errorPage";
                            //Sending user to error page below:
                            try {
                                request.getRequestDispatcher(myUrl).forward(request, response);
                            } catch (IOException | ServletException ed) {
                                ed.printStackTrace();
                            }
                        }
                    } else {
                        //Setting error information below:
                        session.setAttribute("causeOfError", "Passwords don't match");
                        session.setAttribute("returningPage", "parentHome");
                        String myUrl = "errorPage";
                        //Sending user to error page below:
                        try {
                            request.getRequestDispatcher(myUrl).forward(request, response);
                        } catch (IOException | ServletException ed) {
                            ed.printStackTrace();
                        }
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Current username or password is incorrect");
                    session.setAttribute("returningPage", "parentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else if (oldVal == 1 || newVal == 1 || conVal == 1) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain text fields left blank");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else if (oldVal == 2 || newVal == 2 || conVal == 2) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Certain characters not accepted");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentEmailSend")) {
            emailSender email = new emailSender();
            String recipientUser = request.getParameter("user");
            settings info = new settings();
            info.setUserName(recipientUser);
            ArrayList<ArrayList<String>> stuff = info.getTutorInfo();
            ArrayList<String> stuff2 = stuff.get(0);
            String recipient = stuff2.get(1);
            String current = (String) session.getAttribute("currentUserName");
            info.setUserName(current);
            ArrayList<ArrayList<String>> stuff3 = info.getUserInfo();
            ArrayList<String> stuff4 = stuff3.get(0);
            String copier = stuff4.get(1);
            String header = request.getParameter("header");
            String message = request.getParameter("message");
            email.setEmail(recipient);
            email.setCopier(copier);
            boolean checker = email.sendEmail(header, message, true);
            if (checker == true) {
                String myUrl = "studentHome";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else {
                //Setting error information below:
                session.setAttribute("causeOfError", "Problem sending email");
                session.setAttribute("returningPage", "studentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorEmailSend")) {
            emailSender email = new emailSender();
            String recipientUser = request.getParameter("user");
            settings info = new settings();
            info.setUserName(recipientUser);
            ArrayList<ArrayList<String>> stuff = info.getUserInfo();
            ArrayList<String> stuff2 = stuff.get(0);
            String recipient = stuff2.get(1);
            String current = (String) session.getAttribute("currentUserName");
            info.setUserName(current);
            ArrayList<ArrayList<String>> stuff3 = info.getTutorInfo();
            ArrayList<String> stuff4 = stuff3.get(0);
            String copier = stuff4.get(1);
            String header = request.getParameter("header");
            String message = request.getParameter("message");
            email.setEmail(recipient);
            email.setCopier(copier);
            boolean checker = email.sendEmail(header, message, true);
            if (checker == true) {
                String myUrl = "tutorHome";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else {
                //Setting error information below:
                session.setAttribute("causeOfError", "Problem sending email");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentEmailSend")) {
            emailSender email = new emailSender();
            String recipientUser = request.getParameter("user");
            settings info = new settings();
            info.setUserName(recipientUser);
            ArrayList<ArrayList<String>> stuff = info.getTutorInfo();
            ArrayList<String> stuff2 = stuff.get(0);
            String recipient = stuff2.get(1);
            String current = (String) session.getAttribute("currentUserName");
            info.setUserName(current);
            ArrayList<ArrayList<String>> stuff3 = info.getParentInfo();
            ArrayList<String> stuff4 = stuff3.get(0);
            String copier = stuff4.get(1);
            String header = request.getParameter("header");
            String message = request.getParameter("message");
            email.setEmail(recipient);
            email.setCopier(copier);
            boolean checker = email.sendEmail(header, message, true);
            if (checker == true) {
                String myUrl = "parentHome";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            } else {
                //Setting error information below:
                session.setAttribute("causeOfError", "Problem sending email");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/certificate")) {
            emailSender email = new emailSender();
            String recipient = "certificates.sp@gmail.com";
            String user = (String) session.getAttribute("currentUserName");
            String header = "CERTIFICATE REQUEST FROM: " + user;
            String message = "The tutor with username '" + user + "' has requested a certificate for their tutoring hours.";
            email.setEmail(recipient);
            boolean checker = email.sendEmail(header, message, false);
            if (checker == true) {
                settings info = new settings();
                info.setUserName(user);
                ArrayList<ArrayList<String>> stuff = info.getTutorInfo();
                ArrayList<String> stuff2 = stuff.get(0);
                recipient = stuff2.get(1);
                email.setEmail(recipient);
                header = "Your Certificate Request";
                message = "Your request for a certificate of your tutoring hours is being processed, and will be emailed to you";
                boolean checker2 = email.sendEmail(header, message, false);
                if (checker2 == true) {
                    String myUrl = "tutorHome";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Problem sending you an email");
                    session.setAttribute("returningPage", "tutorHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else {
                //Setting error information below:
                session.setAttribute("causeOfError", "Problem sending email");
                session.setAttribute("returningPage", "tutorHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/addChild")) {
            String childName = request.getParameter("childUserName");
            String childPass = request.getParameter("childPassword");
            loginPage login = new loginPage();
            login.setUserName(childName);
            login.setPassword(childPass);
            boolean check = login.checkStudentLogin();
            if (check == true) {
                childListing child = new childListing();
                String current = (String) session.getAttribute("currentUserName");
                child.setParentName(current);
                child.setUserName(childName);
                boolean checker = child.addChild();
                if (checker == true) {
                    String myUrl = "myChild";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "You've already registered this child");
                    session.setAttribute("returningPage", "parentHome");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } else {
                //Setting error information below:
                session.setAttribute("causeOfError", "Entered information is incorrect");
                session.setAttribute("returningPage", "parentHome");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/studentForgotPassword")) {
            emailSender email = new emailSender();
            settings info = new settings();
            String recipient = request.getParameter("forgotPassword");
            email.setEmail(recipient);
            String userName = "";
            String password = "";
            boolean test;
            try {
                info.setEmail(recipient);
                ArrayList<ArrayList<String>> stuff = info.getUserInfoEmail();
                ArrayList<String> stuff2 = stuff.get(0);
                userName = stuff2.get(0);
                info.setUserName(userName);
                stuff = info.getUserLogin();
                stuff2 = stuff.get(0);
                password = stuff2.get(1);
                test = true;
            } catch (Exception d) {
                test = false;
                //Setting error information below:
                session.setAttribute("causeOfError", "Email entered is not registered with a Student Power student account");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
            if (test == true) {
                String header = "Forgot Password";
                String message = "The username associated with this email account is: '" + userName + "', and the password is: '" + password + "'. <br> You are receiving this email because someone accessed the 'Forgot Password' feature of our website and used this email account to retrieve the password. <br> If this was not you, please contact us at 'studentpower21@gmail.com'";
                boolean checker2 = email.sendEmail(header, message, false);
                if (checker2 == true) {
                    String myUrl = "index.html";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Problem sending you an email");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            }
        } else if (userPath.equals("/tutorForgotPassword")) {
            emailSender email = new emailSender();
            settings info = new settings();
            String recipient = request.getParameter("forgotPassword");
            email.setEmail(recipient);
            String userName = "";
            String password = "";
            boolean test;
            try {
                info.setEmail(recipient);
                ArrayList<ArrayList<String>> stuff = info.getTutorInfoEmail();
                ArrayList<String> stuff2 = stuff.get(0);
                userName = stuff2.get(0);
                info.setUserName(userName);
                stuff = info.getTutorLogin();
                stuff2 = stuff.get(0);
                password = stuff2.get(1);
                test = true;
            } catch (Exception d) {
                test = false;
                //Setting error information below:
                session.setAttribute("causeOfError", "Email entered is not registered with a Student Power tutor account");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
            if (test == true) {
                String header = "Forgot Password";
                String message = "The username associated with this email account is: '" + userName + "', and the password is: '" + password + "'. <br> You are receiving this email because someone accessed the 'Forgot Password' feature of our website and used this email account to retrieve the password. <br> If this was not you, please contact us at 'studentpower21@gmail.com'";
                boolean checker2 = email.sendEmail(header, message, false);
                if (checker2 == true) {
                    String myUrl = "index.html";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Problem sending you an email");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            }
        } else if (userPath.equals("/parentForgotPassword")) {
            emailSender email = new emailSender();
            settings info = new settings();
            String recipient = request.getParameter("forgotPassword");
            email.setEmail(recipient);
            String userName = "";
            String password = "";
            boolean test;
            try {
                info.setEmail(recipient);
                ArrayList<ArrayList<String>> stuff = info.getParentInfoEmail();
                ArrayList<String> stuff2 = stuff.get(0);
                userName = stuff2.get(0);
                info.setUserName(userName);
                stuff = info.getParentLogin();
                stuff2 = stuff.get(0);
                password = stuff2.get(1);
                test = true;
            } catch (Exception d) {
                test = false;
                //Setting error information below:
                session.setAttribute("causeOfError", "Email entered is not registered with a Student Power parent account");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
            if (test == true) {
                String header = "Forgot Password";
                String message = "The username associated with this email account is: '" + userName + "', and the password is: '" + password + "'. <br> You are receiving this email because someone accessed the 'Forgot Password' feature of our website and used this email account to retrieve the password. <br> If this was not you, please contact us at 'studentpower21@gmail.com'";
                boolean checker2 = email.sendEmail(header, message, false);
                if (checker2 == true) {
                    String myUrl = "index.html";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                } else {
                    //Setting error information below:
                    session.setAttribute("causeOfError", "Problem sending you an email");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            }
        } else if (userPath.equals("/messagingSystemTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.messagingSystem();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/myTutorsTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.myTutors();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentChildTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.parentChild();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentInfoTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.parentInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/parentLoginTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.parentLogin();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorInfoTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.tutorInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/tutorLoginTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.tutorLogin();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + userPath + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/userInfoTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.userInfo();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + "/studentInfoTable" + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/userLoginTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                ArrayList<ArrayList<String>> members = db.userLogin();
                session.setAttribute("dbData", members);
                String myUrl = "/WEB-INF" + "/studentLoginTable" + ".jsp";
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                    //Catching exceptions below:
                } catch (IOException | ServletException e) {
                    e.printStackTrace();
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "ERROR GOING TO PAGE");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateMyTutorsTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String tutorNameUpdater = request.getParameter("tutorNameUpdate");
                String userNameUpdater = request.getParameter("userNameUpdate");
                String subjectTaughtUpdater = request.getParameter("subjectTaughtUpdate");
                String tutorName = request.getParameter("tutorName");
                String userName = request.getParameter("userName");
                String subjectTaught = request.getParameter("subjectTaught");
                String tutorFirst = request.getParameter("tutorFirst");
                String tutorLast = request.getParameter("tutorLast");
                String studentFirst = request.getParameter("studentFirst");
                String studentLast = request.getParameter("studentLast");
                String rating = request.getParameter("rating");
                String tutorEmail = request.getParameter("tutorEmail");
                String studentEmail = request.getParameter("studentEmail");
                tutorListing tester = new tutorListing();
                tester.setUserName(userNameUpdater);
                tester.setTutorName(tutorNameUpdater);
                tester.setSubjectTaught(subjectTaughtUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getMyTutorsComplete();
                ArrayList<String> stuff2 = stuff.get(0);
                if (tutorName.equals("")) {
                    db.setTutorName(stuff2.get(0));
                } else {
                    db.setTutorName(tutorName);
                }
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(1));
                } else {
                    db.setUserName(userName);
                }
                if (subjectTaught.equals("")) {
                    db.setSubjectTaught(stuff2.get(2));
                } else {
                    db.setSubjectTaught(subjectTaught);
                }
                if (tutorFirst.equals("")) {
                    db.setTutorFirst(stuff2.get(3));
                } else {
                    db.setTutorFirst(tutorFirst);
                }
                if (tutorLast.equals("")) {
                    db.setTutorLast(stuff2.get(4));
                } else {
                    db.setTutorLast(tutorLast);
                }
                if (studentFirst.equals("")) {
                    db.setStudentFirst(stuff2.get(5));
                } else {
                    db.setStudentFirst(studentFirst);
                }
                if (studentLast.equals("")) {
                    db.setStudentLast(stuff2.get(6));
                } else {
                    db.setStudentLast(studentLast);
                }
                if (rating.equals("")) {
                    db.setRating(stuff2.get(7));
                } else {
                    db.setRating(rating);
                }
                if (tutorEmail.equals("")) {
                    db.setTutorEmail(stuff2.get(8));
                } else {
                    db.setTutorEmail(tutorEmail);
                }
                if (studentEmail.equals("")) {
                    db.setUserEmail(stuff2.get(9));
                } else {
                    db.setUserEmail(studentEmail);
                }
                db.setUserNameUpdater(userNameUpdater);
                db.setTutorNameUpdater(tutorNameUpdater);
                db.setSubjectTaughtUpdater(subjectTaughtUpdater);
                boolean checker = db.updateMyTutors();
                if (checker == true) {
                    String myUrl = "myTutorsTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateParentChildTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String parentNameUpdater = request.getParameter("parentNameUpdate");
                String userName = request.getParameter("userName");
                String parentName = request.getParameter("parentName");
                childListing tester = new childListing();
                tester.setUserName(userNameUpdater);
                tester.setParentName(parentNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getParentChild();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(1));
                } else {
                    db.setUserName(userName);
                }
                if (parentName.equals("")) {
                    db.setParentName(stuff2.get(0));
                } else {
                    db.setParentName(parentName);
                }
                db.setUserNameUpdater(userNameUpdater);
                db.setParentNameUpdater(parentNameUpdater);
                boolean checker = db.updateParentChild();
                if (checker == true) {
                    String myUrl = "parentChildTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateParentInfoTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String userName = request.getParameter("userName");
                String email = request.getParameter("email");
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String avatar = request.getParameter("avatar");
                settings tester = new settings();
                tester.setUserName(userNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getParentInfo();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(0));
                } else {
                    db.setUserName(userName);
                }
                if (email.equals("")) {
                    db.setEmail(stuff2.get(1));
                } else {
                    db.setEmail(email);
                }
                if (firstName.equals("")) {
                    db.setFirstName(stuff2.get(2));
                } else {
                    db.setFirstName(firstName);
                }
                if (lastName.equals("")) {
                    db.setLastName(stuff2.get(3));
                } else {
                    db.setLastName(lastName);
                }
                if (avatar.equals("")) {
                    db.setAvatar(stuff2.get(4));
                } else {
                    db.setAvatar(avatar);
                }
                db.setUserNameUpdater(userNameUpdater);
                boolean checker = db.updateParentInfo();
                if (checker == true) {
                    String myUrl = "parentInfoTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateParentLoginTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                settings tester = new settings();
                tester.setUserName(userNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getParentLogin();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(0));
                } else {
                    db.setUserName(userName);
                }
                if (password.equals("")) {
                    db.setPassword(stuff2.get(1));
                } else {
                    db.setPassword(password);
                }
                db.setUserNameUpdater(userNameUpdater);
                boolean checker = db.updateParentLogin();
                if (checker == true) {
                    String myUrl = "parentLoginTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateTutorInfoTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String userName = request.getParameter("userName");
                String email = request.getParameter("email");
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String summary = request.getParameter("summary");
                String gradeLevelString = request.getParameter("gradeLevel");
                String avatar = request.getParameter("avatar");
                String mathString = request.getParameter("math");
                String scienceString = request.getParameter("science");
                String socialString = request.getParameter("social");
                String englishString = request.getParameter("english");
                String spanishString = request.getParameter("spanish");
                String frenchString = request.getParameter("french");
                String chineseString = request.getParameter("chinese");
                String firstString = request.getParameter("first");
                String secondString = request.getParameter("second");
                String thirdString = request.getParameter("third");
                String fourthString = request.getParameter("fourth");
                String fifthString = request.getParameter("fifth");
                String sixthString = request.getParameter("sixth");
                String seventhString = request.getParameter("seventh");
                String eighthString = request.getParameter("eighth");
                String calendarLink = request.getParameter("calendarLink");
                String rating = request.getParameter("rating");
                settings tester = new settings();
                tester.setUserName(userNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getTutorInfo();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(0));
                } else {
                    db.setUserName(userName);
                }
                if (email.equals("")) {
                    db.setEmail(stuff2.get(1));
                } else {
                    db.setEmail(email);
                }
                if (firstName.equals("")) {
                    db.setFirstName(stuff2.get(2));
                } else {
                    db.setFirstName(firstName);
                }
                if (lastName.equals("")) {
                    db.setLastName(stuff2.get(3));
                } else {
                    db.setLastName(lastName);
                }
                if (gradeLevelString.equals("")) {
                    db.setGradeLevel(Integer.parseInt(stuff2.get(4)));
                } else {
                    int gradeLevel = Integer.parseInt(gradeLevelString);
                    db.setGradeLevel(gradeLevel);
                }
                if (avatar.equals("")) {
                    db.setAvatar(stuff2.get(5));
                } else {
                    db.setAvatar(avatar);
                }
                if (summary.equals("")) {
                    db.setSummary(stuff2.get(6));
                } else {
                    db.setSummary(summary);
                }
                if (mathString.equals("")) {
                    db.setMath(Integer.parseInt(stuff2.get(7)));
                } else {
                    int math = Integer.parseInt(mathString);
                    db.setMath(math);
                }
                if (socialString.equals("")) {
                    db.setSocial(Integer.parseInt(stuff2.get(8)));
                } else {
                    int social = Integer.parseInt(socialString);
                    db.setSocial(social);
                }
                if (scienceString.equals("")) {
                    db.setScience(Integer.parseInt(stuff2.get(9)));
                } else {
                    int science = Integer.parseInt(scienceString);
                    db.setScience(science);
                }
                if (englishString.equals("")) {
                    db.setEnglish(Integer.parseInt(stuff2.get(10)));
                } else {
                    int english = Integer.parseInt(englishString);
                    db.setEnglish(english);
                }
                if (spanishString.equals("")) {
                    db.setSpanish(Integer.parseInt(stuff2.get(11)));
                } else {
                    int spanish = Integer.parseInt(spanishString);
                    db.setSpanish(spanish);
                }
                if (frenchString.equals("")) {
                    db.setFrench(Integer.parseInt(stuff2.get(12)));
                } else {
                    int french = Integer.parseInt(frenchString);
                    db.setFrench(french);
                }
                if (chineseString.equals("")) {
                    db.setChinese(Integer.parseInt(stuff2.get(13)));
                } else {
                    int chinese = Integer.parseInt(chineseString);
                    db.setChinese(chinese);
                }
                if (firstString.equals("")) {
                    db.setFirst(Integer.parseInt(stuff2.get(14)));
                } else {
                    int first = Integer.parseInt(firstString);
                    db.setFirst(first);
                }
                if (secondString.equals("")) {
                    db.setSecond(Integer.parseInt(stuff2.get(15)));
                } else {
                    int second = Integer.parseInt(secondString);
                    db.setSecond(second);
                }
                if (thirdString.equals("")) {
                    db.setThird(Integer.parseInt(stuff2.get(16)));
                } else {
                    int third = Integer.parseInt(thirdString);
                    db.setThird(third);
                }
                if (fourthString.equals("")) {
                    db.setFourth(Integer.parseInt(stuff2.get(17)));
                } else {
                    int fourth = Integer.parseInt(fourthString);
                    db.setFourth(fourth);
                }
                if (fifthString.equals("")) {
                    db.setFifth(Integer.parseInt(stuff2.get(18)));
                } else {
                    int fifth = Integer.parseInt(fifthString);
                    db.setFifth(fifth);
                }
                if (sixthString.equals("")) {
                    db.setSixth(Integer.parseInt(stuff2.get(19)));
                } else {
                    int sixth = Integer.parseInt(sixthString);
                    db.setSixth(sixth);
                }
                if (seventhString.equals("")) {
                    db.setSeventh(Integer.parseInt(stuff2.get(20)));
                } else {
                    int seventh = Integer.parseInt(seventhString);
                    db.setSeventh(seventh);
                }
                if (eighthString.equals("")) {
                    db.setEighth(Integer.parseInt(stuff2.get(21)));
                } else {
                    int eighth = Integer.parseInt(eighthString);
                    db.setEighth(eighth);
                }
                if (calendarLink.equals("")) {
                    db.setCalendarLink(stuff2.get(22));
                } else {
                    db.setCalendarLink(calendarLink);
                }
                if (rating.equals("")) {
                    db.setRating(stuff2.get(23));
                } else {
                    db.setRating(rating);
                }
                db.setUserNameUpdater(userNameUpdater);
                boolean checker = db.updateTutorInfo();
                if (checker == true) {
                    String myUrl = "tutorInfoTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateTutorLoginTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                settings tester = new settings();
                tester.setUserName(userNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getTutorLogin();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(0));
                } else {
                    db.setUserName(userName);
                }
                if (password.equals("")) {
                    db.setPassword(stuff2.get(1));
                } else {
                    db.setPassword(password);
                }
                db.setUserNameUpdater(userNameUpdater);
                boolean checker = db.updateTutorLogin();
                if (checker == true) {
                    String myUrl = "tutorLoginTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateUserInfoTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String userName = request.getParameter("userName");
                String email = request.getParameter("email");
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                String gradeLevelString = request.getParameter("gradeLevel");
                String fileLink = request.getParameter("fileLink");
                String avatar = request.getParameter("avatar");
                String mathString = request.getParameter("math");
                String scienceString = request.getParameter("science");
                String socialString = request.getParameter("social");
                String englishString = request.getParameter("english");
                String spanishString = request.getParameter("spanish");
                String frenchString = request.getParameter("french");
                String chineseString = request.getParameter("chinese");
                studentListing tester = new studentListing();
                tester.setUserName(userNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getUserInfo();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(0));
                } else {
                    db.setUserName(userName);
                }
                if (email.equals("")) {
                    db.setEmail(stuff2.get(1));
                } else {
                    db.setEmail(email);
                }
                if (firstName.equals("")) {
                    db.setFirstName(stuff2.get(2));
                } else {
                    db.setFirstName(firstName);
                }
                if (lastName.equals("")) {
                    db.setLastName(stuff2.get(3));
                } else {
                    db.setLastName(lastName);
                }
                if (gradeLevelString.equals("")) {
                    db.setGradeLevel(Integer.parseInt(stuff2.get(4)));
                } else {
                    int gradeLevel = Integer.parseInt(gradeLevelString);
                    db.setGradeLevel(gradeLevel);
                }
                if (avatar.equals("")) {
                    db.setAvatar(stuff2.get(5));
                } else {
                    db.setAvatar(avatar);
                }
                if (mathString.equals("")) {
                    db.setMath(Integer.parseInt(stuff2.get(6)));
                } else {
                    int math = Integer.parseInt(mathString);
                    db.setMath(math);
                }
                if (socialString.equals("")) {
                    db.setSocial(Integer.parseInt(stuff2.get(7)));
                } else {
                    int social = Integer.parseInt(socialString);
                    db.setSocial(social);
                }
                if (scienceString.equals("")) {
                    db.setScience(Integer.parseInt(stuff2.get(8)));
                } else {
                    int science = Integer.parseInt(scienceString);
                    db.setScience(science);
                }
                if (englishString.equals("")) {
                    db.setEnglish(Integer.parseInt(stuff2.get(9)));
                } else {
                    int english = Integer.parseInt(englishString);
                    db.setEnglish(english);
                }
                if (spanishString.equals("")) {
                    db.setSpanish(Integer.parseInt(stuff2.get(10)));
                } else {
                    int spanish = Integer.parseInt(spanishString);
                    db.setSpanish(spanish);
                }
                if (frenchString.equals("")) {
                    db.setFrench(Integer.parseInt(stuff2.get(11)));
                } else {
                    int french = Integer.parseInt(frenchString);
                    db.setFrench(french);
                }
                if (chineseString.equals("")) {
                    db.setChinese(Integer.parseInt(stuff2.get(12)));
                } else {
                    int chinese = Integer.parseInt(chineseString);
                    db.setChinese(chinese);
                }
                if (fileLink.equals("")) {
                    db.setFileLink(stuff2.get(13));
                } else {
                    db.setFileLink(fileLink);
                }
                db.setUserNameUpdater(userNameUpdater);
                boolean checker = db.updateUserInfo();
                if (checker == true) {
                    String myUrl = "userInfoTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/updateUserLoginTable")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userNameUpdater = request.getParameter("userNameUpdate");
                String userName = request.getParameter("userName");
                String password = request.getParameter("password");
                studentListing tester = new studentListing();
                tester.setUserName(userNameUpdater);
                ArrayList<ArrayList<String>> stuff = tester.getUserLogin();
                ArrayList<String> stuff2 = stuff.get(0);
                if (userName.equals("")) {
                    db.setUserName(stuff2.get(0));
                } else {
                    db.setUserName(userName);
                }
                if (password.equals("")) {
                    db.setPassword(stuff2.get(1));
                } else {
                    db.setPassword(password);
                }
                db.setUserNameUpdater(userNameUpdater);
                boolean checker = db.updateUserLogin();
                if (checker == true) {
                    String myUrl = "userLoginTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/classRefresh")) {
            String classNameSet = request.getParameter("subject");
            session.setAttribute("selectedClass", classNameSet);
            String gradeName = request.getParameter("grade");
            tutorListing tutor = new tutorListing();
            ArrayList<ArrayList<String>> members = null;
            String className = (String) session.getAttribute("selectedClass");
            if (className.equals("math")) {
                members = tutor.getMathTutors(gradeName);
            } else if (className.equals("science")) {
                members = tutor.getScienceTutors(gradeName);
            } else if (className.equals("social")) {
                members = tutor.getSocialTutors(gradeName);
            } else if (className.equals("english")) {
                members = tutor.getEnglishTutors(gradeName);
            } else if (className.equals("french")) {
                members = tutor.getFrenchTutors(gradeName);
            } else if (className.equals("spanish")) {
                members = tutor.getSpanishTutors(gradeName);
            } else if (className.equals("chinese")) {
                members = tutor.getChineseTutors(gradeName);
            }
            session.setAttribute("dbData", members);
            String text = gradeName + " grade " + className;
            session.setAttribute("classNameText", text);
            session.setAttribute("test", "1");
            String myUrl = "/WEB-INF" + "/tutorList" + ".jsp";
            try {
                request.getRequestDispatcher(myUrl).forward(request, response);
                //Catching exceptions below:
            } catch (IOException | ServletException e) {
                e.printStackTrace();
            }
        } else if (userPath.equals("/deleteMyTutors")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String tutorName = request.getParameter("tutorNameDelete");
                String userName = request.getParameter("userNameDelete");
                String subjectTaught = request.getParameter("subjectTaughtDelete");
                db.setTutorNameUpdater(tutorName);
                db.setUserNameUpdater(userName);
                db.setSubjectTaughtUpdater(subjectTaught);
                boolean checker = db.deleteMyTutors();
                if (checker == true) {
                    String myUrl = "myTutorsTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Something Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteParentChild")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String parentName = request.getParameter("parentNameDelete");
                String userName = request.getParameter("userNameDelete");
                db.setParentNameUpdater(parentName);
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteParentChild();
                if (checker == true) {
                    String myUrl = "parentChildTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Something Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteParentInfo")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userName = request.getParameter("userNameDelete");
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteParentInfo();
                if (checker == true) {
                    String myUrl = "parentInfoTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteParentLogin")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userName = request.getParameter("userNameDelete");
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteParentLogin();
                if (checker == true) {
                    String myUrl = "parentLoginTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteTutorInfo")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userName = request.getParameter("userNameDelete");
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteTutorInfo();
                if (checker == true) {
                    String myUrl = "tutorInfoTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteTutorLogin")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userName = request.getParameter("userNameDelete");
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteTutorLogin();
                if (checker == true) {
                    String myUrl = "tutorLoginTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteUserInfo")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userName = request.getParameter("userNameDelete");
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteUserInfo();
                if (checker == true) {
                    String myUrl = "userInfoTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else if (userPath.equals("/deleteUserLogin")) {
            try {
                //Displaying information from the database below:
                admin db = new admin();
                String userName = request.getParameter("userNameDelete");
                db.setUserNameUpdater(userName);
                boolean checker = db.deleteUserLogin();
                if (checker == true) {
                    String myUrl = "userLoginTable";
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                        //Catching exceptions below:
                    } catch (IOException | ServletException e) {
                        e.printStackTrace();
                    }
                } else {
                    session.setAttribute("causeOfError", "ERROR UPDATING");
                    session.setAttribute("returningPage", "index.html");
                    String myUrl = "errorPage";
                    //Sending user to error page below:
                    try {
                        request.getRequestDispatcher(myUrl).forward(request, response);
                    } catch (IOException | ServletException ed) {
                        ed.printStackTrace();
                    }
                }
            } catch (Exception ex) {
                //Setting error information below:
                session.setAttribute("causeOfError", "Username Doesn't Exist");
                session.setAttribute("returningPage", "index.html");
                String myUrl = "errorPage";
                //Sending user to error page below:
                try {
                    request.getRequestDispatcher(myUrl).forward(request, response);
                } catch (IOException | ServletException ed) {
                    ed.printStackTrace();
                }
            }
        } else {
            processRequest(request, response);
        }
    }
    /**
     Returns a short description of the servlet.
     @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
