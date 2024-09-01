/*
Dhruv K. Saligram
1/11/2020
This program facilitates mock conferences and debate team management
This page checks if members exist in the databse when the user tries to change information
*/
//Declaring package below:
package jspActions;
//Imports below:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
//Creating class below:
public class checkIfExisting {
    //Defining instance variables below:
    private String connectionURL;
    private String dbName;
    private String userName;
    private String leaderName;
    private String conferenceName;
    private int conferenceYear;
    private String countryName;
    //Creating constructor below:
    public checkIfExisting() {
        this.connectionURL = "";
        this.dbName = "";
        this.userName = "";
        this.leaderName = "";
        this.conferenceName = "";
        this.conferenceYear = 0;
        this.countryName = "";
    }
    //Creating constructor below:
    public checkIfExisting(String connectionURL, String dbName, String userName, String leaderName, String conferenceName, int conferenceYear, String countryName) {
        this.connectionURL = connectionURL;
        this.dbName = dbName;
        this.userName = userName;
        this.leaderName = leaderName;
        this.conferenceName = conferenceName;
        this.conferenceYear = conferenceYear;
        this.countryName = countryName;
    }
    //Creating get and set methods below:
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    //Creating get and set methods below:
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    //Creating get and set methods below:
    public String getLeaderName() {
        return leaderName;
    }
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }
    //Creating get and set methods below:
    public String getConferenceName() {
        return conferenceName;
    }
    public void setConferenceName(String conferenceName) {
        this.conferenceName = conferenceName;
    }
    //Creating get and set methods below:
    public int getConferenceYear() {
        return conferenceYear;
    }
    public void setConferenceYear(int conferenceYear) {
        this.conferenceYear = conferenceYear;
    }
    //Creating get and set methods below:
    public String getConnectionURL() {
        return connectionURL;
    }
    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }
    //Creating get and set methods below:
    public String getDbName() {
        return dbName;
    }
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
    //Creating method below:
    public boolean existingUsername() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/" + "studentPowerDatabase");
        String userNameChecker = "SELECT * FROM userLogin WHERE userName = ?";
        String tutorNameChecker = "SELECT * FROM tutorLogin WHERE userName = ?";
        String parentNameChecker = "SELECT * FROM parentLogin WHERE userName = ?";
        boolean userStatus;
        boolean tutorStatus;
        boolean parentStatus;
        boolean status = true;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentPowerDatabase", "sample", "sample");
            
            //Executing select statement to get info from the database below:
            PreparedStatement userNameCheck = con.prepareStatement(userNameChecker);
            //Replacing ? with values below:
            userNameCheck.setString(1, this.userName);
            //Receiving information from select statement below:
            ResultSet rs1 = userNameCheck.executeQuery();
            userStatus = rs1.next();
            
            //Executing select statement to get info from the database below:
            PreparedStatement tutorNameCheck = con.prepareStatement(tutorNameChecker);
            //Replacing ? with values below:
            tutorNameCheck.setString(1, this.userName);
            //Receiving information from select statement below:
            ResultSet rs2 = tutorNameCheck.executeQuery();
            tutorStatus = rs2.next();
            
            //Executing select statement to get info from the database below:
            PreparedStatement parentNameCheck = con.prepareStatement(parentNameChecker);
            //Replacing ? with values below:
            parentNameCheck.setString(1, this.userName);
            //Receiving information from select statement below:
            ResultSet rs3 = parentNameCheck.executeQuery();
            parentStatus = rs3.next();
            
            if (userStatus == false && tutorStatus == false && parentStatus == false) {
                status = false;
            }
            
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    //Creating main method below:
//    public static void main(String[] args) {
//        checkIfExisting testObj = new checkIfExisting("jdbc:mysql://localhost:3306/studentPowerDatabase", "studentPowerDatabase", "rika", "dhruv", "CTMUN Fall", 2020, "Albania");
//        boolean status = testObj.existingUsername();
//        System.out.println(status);
//        status = testObj.existingLeader();
//        System.out.println(status);
//        status = testObj.existingConference();
//        System.out.println(status);
//        status = testObj.leaderAbsent();
//        System.out.println(status);
//    }
}
