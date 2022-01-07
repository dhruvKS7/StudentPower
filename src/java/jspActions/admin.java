/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspActions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
/**

 @author IndianRonaldo
 */
public class admin {
    private String connectionURL;
    private Connection dbConn;
    public String getConnectionURL() {
        return connectionURL;
    }
    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }
    public Connection getDbConn() {
        return dbConn;
    }
    public void setDbConn(Connection dbConn) {
        String connectionURL = "jdbc:mysql://localhost:3306/studentPowerDatabase";
        this.dbConn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.dbConn = DriverManager.getConnection(connectionURL, "sample", "sample");
        } catch (SQLException a) {
            System.out.println("SQL Connection error");
            System.exit(0);
        } catch (ClassNotFoundException i) {
            System.out.println("Class name not found");
            System.exit(0);
        }
    }
    private String recipient;
    private String message;
    private String sender;
    private String tutorName;
    private String userName;
    private String subjectTaught;
    private String tutorFirst;
    private String tutorLast;
    private String studentFirst;
    private String studentLast;
    private String rating;
    private String parentName;
    private String email;
    private String firstName;
    private String lastName;
    private String avatar;
    private String password;
    private String tutorEmail;
    private String userEmail;
    public String getTutorEmail() {
        return tutorEmail;
    }
    public void setTutorEmail(String tutorEmail) {
        this.tutorEmail = tutorEmail;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    private int gradeLevel;
    private int math;
    private int social;
    private int science;
    private int english;
    private int spanish;
    private int french;
    private int chinese;
    private String fileLink;
    private String summary;
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;
    private int sixth;
    private int seventh;
    private int eighth;
    private String calendarLink;
    private String tutorNameUpdater;
    private String userNameUpdater;
    private String subjectTaughtUpdater;
    private String parentNameUpdater;
    public String getTutorNameUpdater() {
        return tutorNameUpdater;
    }
    public void setTutorNameUpdater(String tutorNameUpdater) {
        this.tutorNameUpdater = tutorNameUpdater;
    }
    public String getUserNameUpdater() {
        return userNameUpdater;
    }
    public void setUserNameUpdater(String userNameUpdater) {
        this.userNameUpdater = userNameUpdater;
    }
    public String getSubjectTaughtUpdater() {
        return subjectTaughtUpdater;
    }
    public void setSubjectTaughtUpdater(String subjectTaughtUpdater) {
        this.subjectTaughtUpdater = subjectTaughtUpdater;
    }
    public String getParentNameUpdater() {
        return parentNameUpdater;
    }
    public void setParentNameUpdater(String parentNameUpdater) {
        this.parentNameUpdater = parentNameUpdater;
    }
    public String getTutorName() {
        return tutorName;
    }
    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getSubjectTaught() {
        return subjectTaught;
    }
    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }
    public String getTutorFirst() {
        return tutorFirst;
    }
    public void setTutorFirst(String tutorFirst) {
        this.tutorFirst = tutorFirst;
    }
    public String getTutorLast() {
        return tutorLast;
    }
    public void setTutorLast(String tutorLast) {
        this.tutorLast = tutorLast;
    }
    public String getStudentFirst() {
        return studentFirst;
    }
    public void setStudentFirst(String studentFirst) {
        this.studentFirst = studentFirst;
    }
    public String getStudentLast() {
        return studentLast;
    }
    public void setStudentLast(String studentLast) {
        this.studentLast = studentLast;
    }
    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getParentName() {
        return parentName;
    }
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getSocial() {
        return social;
    }
    public void setSocial(int social) {
        this.social = social;
    }
    public int getScience() {
        return science;
    }
    public void setScience(int science) {
        this.science = science;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }
    public int getSpanish() {
        return spanish;
    }
    public void setSpanish(int spanish) {
        this.spanish = spanish;
    }
    public int getFrench() {
        return french;
    }
    public void setFrench(int french) {
        this.french = french;
    }
    public int getChinese() {
        return chinese;
    }
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }
    public String getFileLink() {
        return fileLink;
    }
    public void setFileLink(String fileLink) {
        this.fileLink = fileLink;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public int getFirst() {
        return first;
    }
    public void setFirst(int first) {
        this.first = first;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public int getThird() {
        return third;
    }
    public void setThird(int third) {
        this.third = third;
    }
    public int getFourth() {
        return fourth;
    }
    public void setFourth(int fourth) {
        this.fourth = fourth;
    }
    public int getFifth() {
        return fifth;
    }
    public void setFifth(int fifth) {
        this.fifth = fifth;
    }
    public int getSixth() {
        return sixth;
    }
    public void setSixth(int sixth) {
        this.sixth = sixth;
    }
    public int getSeventh() {
        return seventh;
    }
    public void setSeventh(int seventh) {
        this.seventh = seventh;
    }
    public int getEighth() {
        return eighth;
    }
    public void setEighth(int eighth) {
        this.eighth = eighth;
    }
    public String getCalendarLink() {
        return calendarLink;
    }
    public void setCalendarLink(String calendarLink) {
        this.calendarLink = calendarLink;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public ArrayList<ArrayList<String>> messagingSystem () {
        String[] tableHeaders = {"messageNumber", "recipient", "message", "sender"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("messagingSystem", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> myTutors () {
        String[] tableHeaders = {"tutorName", "userName", "subjectTaught", "tutorFirst", "tutorLast", "studentFirst", "studentLast", "rating", "tutorEmail", "studentEmail"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("myTutors", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> parentChild () {
        String[] tableHeaders = {"parentName", "userName"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("parentChild", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> parentInfo () {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "avatar"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("parentInfo", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> parentLogin () {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("parentLogin", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> userLogin () {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("userLogin", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> tutorLogin () {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("tutorLogin", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> userInfo () {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "math", "social", "science", "english", "spanish", "french", "chinese", "fileLink"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("userInfo", tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> tutorInfo () {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "summary", "math", "social", "science", "english", "spanish", "french", "chinese", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "calendarLink", "rating"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getData("tutorInfo", tableHeaders);
        return data;
    }
    public boolean updateMyTutors() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE myTutors SET tutorName = ?, userName = ?, subjectTaught = ?, tutorFirst = ?, tutorLast = ?, studentFirst = ?, studentLast = ?, rating = ?, tutorEmail = ?, studentEmail = ? WHERE tutorName = ? AND userName = ? AND subjectTaught = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.tutorName);
            updateMembers.setString(2, this.userName);
            updateMembers.setString(3, this.subjectTaught);
            updateMembers.setString(4, this.tutorFirst);
            updateMembers.setString(5, this.tutorLast);
            updateMembers.setString(6, this.studentFirst);
            updateMembers.setString(7, this.studentLast);
            updateMembers.setString(8, this.rating);
            updateMembers.setString(9, this.tutorEmail);
            updateMembers.setString(10, this.userEmail);
            updateMembers.setString(11, this.tutorNameUpdater);
            updateMembers.setString(12, this.userNameUpdater);
            updateMembers.setString(13, this.subjectTaughtUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateParentChild() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE parentChild SET parentName = ?, userName = ? WHERE parentName = ? AND userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.parentName);
            updateMembers.setString(2, this.userName);
            updateMembers.setString(3, this.parentNameUpdater);
            updateMembers.setString(4, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateParentInfo() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE parentInfo SET userName = ?, email = ?, firstName = ?, lastName = ?, avatar = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            updateMembers.setString(2, this.email);
            updateMembers.setString(3, this.firstName);
            updateMembers.setString(4, this.lastName);
            updateMembers.setString(5, this.avatar);
            updateMembers.setString(6, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateParentLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE parentLogin SET userName = ?, password = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            updateMembers.setString(2, this.password);
            updateMembers.setString(3, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateTutorInfo() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE tutorInfo SET userName = ?, email = ?, firstName = ?, lastName = ?, gradeLevel = ?, avatar = ?, summary = ?, math = ?, social = ?, science = ?, english = ?, spanish = ?, french = ?, chinese = ?, first = ?, second = ?, third = ?, fourth = ?, fifth = ?, sixth = ?, seventh = ?, eighth = ?, calendarLink = ?, rating = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            updateMembers.setString(2, this.email);
            updateMembers.setString(3, this.firstName);
            updateMembers.setString(4, this.lastName);
            updateMembers.setInt(5, this.gradeLevel);
            updateMembers.setString(6, this.avatar);
            updateMembers.setString(7, this.summary);
            updateMembers.setInt(8, this.math);
            updateMembers.setInt(9, this.social);
            updateMembers.setInt(10, this.science);
            updateMembers.setInt(11, this.english);
            updateMembers.setInt(12, this.spanish);
            updateMembers.setInt(13, this.french);
            updateMembers.setInt(14, this.chinese);
            updateMembers.setInt(15, this.first);
            updateMembers.setInt(16, this.second);
            updateMembers.setInt(17, this.third);
            updateMembers.setInt(18, this.fourth);
            updateMembers.setInt(19, this.fifth);
            updateMembers.setInt(20, this.sixth);
            updateMembers.setInt(21, this.seventh);
            updateMembers.setInt(22, this.eighth);
            updateMembers.setString(23, this.calendarLink);
            updateMembers.setString(24, this.rating);
            updateMembers.setString(25, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateTutorLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE tutorLogin SET userName = ?, password = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            updateMembers.setString(2, this.password);
            updateMembers.setString(3, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateUserInfo() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE userInfo SET userName = ?, email = ?, firstName = ?, lastName = ?, gradeLevel = ?, avatar = ?, math = ?, social = ?, science = ?, english = ?, spanish = ?, french = ?, chinese = ?, fileLink = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            updateMembers.setString(2, this.email);
            updateMembers.setString(3, this.firstName);
            updateMembers.setString(4, this.lastName);
            updateMembers.setInt(5, this.gradeLevel);
            updateMembers.setString(6, this.avatar);
            updateMembers.setInt(7, this.math);
            updateMembers.setInt(8, this.social);
            updateMembers.setInt(9, this.science);
            updateMembers.setInt(10, this.english);
            updateMembers.setInt(11, this.spanish);
            updateMembers.setInt(12, this.french);
            updateMembers.setInt(13, this.chinese);
            updateMembers.setString(14, this.fileLink);
            updateMembers.setString(15, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateUserLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE userLogin SET userName = ?, password = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            updateMembers.setString(2, this.password);
            updateMembers.setString(3, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteMyTutors() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM myTutors WHERE tutorName = ? AND userName = ? AND subjectTaught = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.tutorNameUpdater);
            updateMembers.setString(2, this.userNameUpdater);
            updateMembers.setString(3, this.subjectTaughtUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteParentChild() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM parentChild WHERE parentName = ? AND userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.parentNameUpdater);
            updateMembers.setString(2, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteParentInfo() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM parentInfo WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteParentLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM parentLogin WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteTutorInfo() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM tutorInfo WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteTutorLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM tutorLogin WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteUserInfo() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM userInfo WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean deleteUserLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "DELETE FROM userLogin WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userNameUpdater);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
//    public static void main(String[] args) {
//        admin test = new admin();
//        test.setTutorName("paul");
//        test.setUserName("harry");
//        test.setSubjectTaught("math");
//        test.setTutorFirst("Dhruv");
//        test.setTutorLast("Saligram");
//        test.setStudentFirst("Harry");
//        test.setStudentLast("Potter");
//        test.setRating("No Rating");
//        test.setTutorNameUpdater("paul");
//        test.setUserNameUpdater("max");
//        test.setSubjectTaughtUpdater("science");
//        System.out.println(test.deleteMyTutors());
//    }
}
