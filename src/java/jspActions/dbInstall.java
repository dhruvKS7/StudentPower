/*
Dhruv K. Saligram
1/11/2020
This program facilitates mock conferences and debate team management
This page installs the database and tables
 */
//Package below:
package jspActions;
//Imports below:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//Creating class below:
public class dbInstall {
    //Creating main method below:
    public static void main(String[] args) {
        dbInstall installation = new dbInstall();
        dbConnection database = new dbConnection();
        //Creating database below:
        database.createDb("studentPowerDatabase");
        //Creating database table below:
        String adminLogin = "CREATE TABLE adminLogin ( "
                + "userName varchar(30), "
                + "password varchar(30), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(adminLogin, "studentPowerDatabase");
        //Creating database table below:
        String userLogin = "CREATE TABLE userLogin ( "
                + "userName varchar(30), "
                + "password varchar(30), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(userLogin, "studentPowerDatabase");
        //Creating database table below:
        String tutorLogin = "CREATE TABLE tutorLogin ( "
                + "userName varchar(30), "
                + "password varchar(30), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(tutorLogin, "studentPowerDatabase");
        //Creating database table below:
        String parentLogin = "CREATE TABLE parentLogin ( "
                + "userName varchar(30), "
                + "password varchar(30), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(parentLogin, "studentPowerDatabase");
//        //Creating database table below:
//        String userInfo = "CREATE TABLE userInfo ( "
//                + "userName varchar(30), "
//                + "email varchar(100), "
//                + "firstName varchar(30), "
//                + "lastName varchar(30), "
//                + "gradeLevel int, "
//                + "avatar varchar(100), "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(userInfo, "studentPowerDatabase");
//        //Creating database table below:
//        String tutorInfo = "CREATE TABLE tutorInfo ( "
//                + "userName varchar(30), "
//                + "email varchar(100), "
//                + "firstName varchar(30), "
//                + "lastName varchar(30), "
//                + "gradeLevel int, "
//                + "avatar varchar(100), "
//                + "summary varchar(1000), "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(tutorInfo, "studentPowerDatabase");
        //Creating database table below:
        String parentInfo = "CREATE TABLE parentInfo ( "
                + "userName varchar(30), "
                + "email varchar(100), "
                + "firstName varchar(30), "
                + "lastName varchar(30), "
                + "avatar varchar(100), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(parentInfo, "studentPowerDatabase");
        //Creating database table below:
        String messagingSystem = "CREATE TABLE messagingSystem ( "
                + "messageNumber bigint AUTO_INCREMENT, "
                + "recipient varchar(30) NOT NULL, "
                + "message varchar(150) NOT NULL, "
                + "sender varchar(30) NOT NULL, "
                + "PRIMARY KEY (messageNumber, recipient, message, sender), "
                + "UNIQUE(recipient, message, sender) "
                + ")";
        database.createTable(messagingSystem, "studentPowerDatabase");
//        //Creating database table below:
//        String userClasses = "CREATE TABLE userClasses ( "
//                + "userName varchar(30), "
//                + "math int, "
//                + "social int, "
//                + "science int, "
//                + "english int, "
//                + "spanish int, "
//                + "french int, "
//                + "chinese int, "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(userClasses, "studentPowerDatabase");
//        //Creating database table below:
//        String tutorClasses = "CREATE TABLE tutorClasses ( "
//                + "userName varchar(30), "
//                + "math int, "
//                + "social int, "
//                + "science int, "
//                + "english int, "
//                + "spanish int, "
//                + "french int, "
//                + "chinese int, "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(tutorClasses, "studentPowerDatabase");
//        //Creating database table below:
//        String tutorGrades = "CREATE TABLE tutorGrades ( "
//                + "userName varchar(30), "
//                + "first int, "
//                + "second int, "
//                + "third int, "
//                + "fourth int, "
//                + "fifth int, "
//                + "sixth int, "
//                + "seventh int, "
//                + "eighth int, "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(tutorGrades, "studentPowerDatabase");
        //Creating database table below:
        String myTutors = "CREATE TABLE myTutors ( "
                + "tutorName varchar(30), "
                + "userName varchar(30), "
                + "subjectTaught varchar(30), "
                + "tutorFirst varchar(30), "
                + "tutorLast varchar(30), "
                + "studentFirst varchar(30), "
                + "studentLast varchar(30), "
                + "rating varchar(10), "
                + "tutorEmail varchar(100), "
                + "studentEmail varchar(100), "
                + "PRIMARY KEY(tutorName, userName, subjectTaught) "
                + ")";
        database.createTable(myTutors, "studentPowerDatabase");
        //Creating database table below:
        String parentChild = "CREATE TABLE parentChild ( "
                + "parentName varchar(30), "
                + "userName varchar(30), "
                + "PRIMARY KEY(parentName, userName) "
                + ")";
        database.createTable(parentChild, "studentPowerDatabase");
//        //Creating database table below:
//        String scheduleLink = "CREATE TABLE scheduleLink ( "
//                + "userName varchar(30), "
//                + "calendarLink varchar(200), "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(scheduleLink, "studentPowerDatabase");
//        //Creating database table below:
//        String filesLink = "CREATE TABLE filesLink ( "
//                + "userName varchar(30), "
//                + "fileLink varchar(200), "
//                + "PRIMARY KEY(userName) "
//                + ")";
//        database.createTable(filesLink, "studentPowerDatabase");
        //Creating database table below:
        String tutorInfo = "CREATE TABLE tutorInfo ( "
                + "userName varchar(30), "
                + "email varchar(100), "
                + "firstName varchar(30), "
                + "lastName varchar(30), "
                + "gradeLevel int, "
                + "avatar varchar(100), "
                + "summary varchar(1000), "
                + "math int, "
                + "social int, "
                + "science int, "
                + "english int, "
                + "spanish int, "
                + "french int, "
                + "chinese int, "
                + "first int, "
                + "second int, "
                + "third int, "
                + "fourth int, "
                + "fifth int, "
                + "sixth int, "
                + "seventh int, "
                + "eighth int, "
                + "calendarLink varchar(200), "
                + "rating varchar(10), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(tutorInfo, "studentPowerDatabase");
        //Creating database table below:
        String userInfo = "CREATE TABLE userInfo ( "
                + "userName varchar(30), "
                + "email varchar(100), "
                + "firstName varchar(30), "
                + "lastName varchar(30), "
                + "gradeLevel int, "
                + "avatar varchar(100), "
                + "math int, "
                + "social int, "
                + "science int, "
                + "english int, "
                + "spanish int, "
                + "french int, "
                + "chinese int, "
                + "fileLink varchar(200), "
                + "PRIMARY KEY(userName) "
                + ")";
        database.createTable(userInfo, "studentPowerDatabase");
        installation.initializer();
    }
    //Creating method below:
    public void initializer() {
        String initialize1 = "INSERT INTO adminLogin VALUES (?, ?)";
        //Establishing connection to database below:
        Connection dbConnection = null;
        String DbName = "studentPowerDatabase";
        String connectionURL = "jdbc:mysql://localhost:3306/" + DbName;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            dbConnection = DriverManager.getConnection(connectionURL, "user", "pass");
            //Executing insert statement to insert info into the database below:
            PreparedStatement preparedInitialize = dbConnection.prepareStatement(initialize1);
            preparedInitialize.setString(1, "sample_username");
            preparedInitialize.setString(2, "sample_password");
            preparedInitialize.executeUpdate();
            dbConnection.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error inserting");
        }
    }
}
