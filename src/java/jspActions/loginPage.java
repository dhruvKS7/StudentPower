//Declaring package below:
package jspActions;
//Imports below:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//Creating class below:
public class loginPage {
    //Declaring initializers below:
    private String dbName;
    private String connectionURL;
    private String userName;
    private String password;
    //Creating constructor below:
    public loginPage() {
        this.dbName = "";
        this.connectionURL = "";
        this.userName = "";
        this.password = "";
    }
    //Creating constructor below:
    public loginPage(String dbName, String connectionURL, String userName, String password) {
        this.dbName = dbName;
        this.connectionURL = connectionURL;
        this.userName = userName;
        this.password = password;
    }
    //Creating get and set methods below:
    public String getDbName() {
        return dbName;
    }
    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
    //Creating get and set methods below:
    public String getConnectionURL() {
        return connectionURL;
    }
    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }
    //Creating get and set methods below:
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    //Creating get and set methods below:
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    //Creating method below:
    public boolean checkStudentLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String loginChecker = "SELECT * FROM userLogin WHERE userName = ? and password = ?";
        boolean status;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement loginCheck = con.prepareStatement(loginChecker);
            //Replacing ? with values below:
            loginCheck.setString(1, this.userName);
            loginCheck.setString(2, this.password);
            //Receiving information from select statement below:
            ResultSet rs = loginCheck.executeQuery();
            status = rs.next();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    //Creating method below:
    public boolean checkTutorLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String loginChecker = "SELECT * FROM tutorLogin WHERE userName = ? and password = ?";
        boolean status;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement loginCheck = con.prepareStatement(loginChecker);
            //Replacing ? with values below:
            loginCheck.setString(1, this.userName);
            loginCheck.setString(2, this.password);
            //Receiving information from select statement below:
            ResultSet rs = loginCheck.executeQuery();
            status = rs.next();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    //Creating method below:
    public boolean checkParentLogin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String loginChecker = "SELECT * FROM parentLogin WHERE userName = ? and password = ?";
        boolean status;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement loginCheck = con.prepareStatement(loginChecker);
            //Replacing ? with values below:
            loginCheck.setString(1, this.userName);
            loginCheck.setString(2, this.password);
            //Receiving information from select statement below:
            ResultSet rs = loginCheck.executeQuery();
            status = rs.next();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    //Creating method below:
    public boolean checkAdmin() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String loginChecker = "SELECT * FROM adminLogin WHERE userName = ? and password = ?";
        boolean status;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement loginCheck = con.prepareStatement(loginChecker);
            //Replacing ? with values below:
            loginCheck.setString(1, this.userName);
            loginCheck.setString(2, this.password);
            //Receiving information from select statement below:
            ResultSet rs = loginCheck.executeQuery();
            status = rs.next();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    //Creating main method below:
//    public static void main(String[] args) {
//        loginPage testObj = new loginPage("debateDatabase", "jdbc:mysql://localhost:3306/debateDatabase", "rika", "test", "Ritika", "Saligram", 5);
//        boolean status = testObj.checkLogin();
//        System.out.println(status);
//        status = testObj.checkAdminLogin();
//        System.out.println(status);
//        status = testObj.checkSignUp();
//        System.out.println(status);
//    }
}
