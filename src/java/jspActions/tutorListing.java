/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspActions;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**

 @author IndianRonaldo
 */
public class tutorListing {
    private String userName;
    private String connectionURL;
    private Connection dbConn;
    private String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "summary", "math", "social", "science", "english", "spanish", "french", "chinese", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "calendarLink", "rating"};
    private String subjectTaught;
    private String tutorName;
    public String[] getTableHeaders() {
        return tableHeaders;
    }
    public void setTableHeaders(String[] tableHeaders) {
        this.tableHeaders = tableHeaders;
    }
    public String getSubjectTaught() {
        return subjectTaught;
    }
    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }
    public String getTutorName() {
        return tutorName;
    }
    public void setTutorName(String tutorName) {
        this.tutorName = tutorName;
    }
    public String getConnectionURL() {
        return connectionURL;
    }
    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public tutorListing() {
        this.userName = "";
        setDbConn();
    }
    public tutorListing(String userName) {
        this.userName = userName;
        setDbConn();
    }
    //Setting connection below:
    public Connection getDbConn() {
        return dbConn;
    }
    //Setting database connection below:
    public void setDbConn() {
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
    public ArrayList<ArrayList<String>> getMathTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE math = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getScienceTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE science = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getSocialTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE social = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getEnglishTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE english = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getSpanishTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE spanish = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getFrenchTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE french = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public ArrayList<ArrayList<String>> getChineseTutors(String gradeLevel) {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM tutorInfo WHERE chinese = 1 AND " + gradeLevel + " = 1";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
    public boolean addTutor(String tutorName, String userName, String className, String tutorFirst, String tutorLast, String studentFirst, String studentLast, String rating, String tutorEmail, String userEmail) {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String tutorChecker = "INSERT INTO myTutors VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean status = true;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing insert statement to insert info into the database below:
            PreparedStatement tutorCheck = con.prepareStatement(tutorChecker);
            //Replacing ? with values below:
            tutorCheck.setString(1, tutorName);
            tutorCheck.setString(2, userName);
            tutorCheck.setString(3, className);
            tutorCheck.setString(4, tutorFirst);
            tutorCheck.setString(5, tutorLast);
            tutorCheck.setString(6, studentFirst);
            tutorCheck.setString(7, studentLast);
            tutorCheck.setString(8, rating);
            tutorCheck.setString(9, tutorEmail);
            tutorCheck.setString(10, userEmail);
            //Executing statement below:
            tutorCheck.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public ArrayList<ArrayList<String>> getMyTutors () {
        String[] tableHeaders = {"tutorName", "userName", "subjectTaught", "tutorFirst", "tutorLast", "studentFirst", "studentLast", "rating", "tutorEmail", "studentEmail"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("myTutors", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getMyStudents () {
        String[] tableHeaders = {"tutorName", "userName", "subjectTaught", "tutorFirst", "tutorLast", "studentFirst", "studentLast", "rating", "tutorEmail", "studentEmail"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeTutorData("myTutors", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getMyTutorsComplete() {
        //Creating variables below:
        String[] tableHeaders = {"tutorName", "userName", "subjectTaught", "tutorFirst", "tutorLast", "studentFirst", "studentLast", "rating", "tutorEmail", "studentEmail"};
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM myTutors WHERE tutorName = '" + this.tutorName + "' AND userName = '" + this.userName + "' AND subjectTaught = '" + this.subjectTaught + "'";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders[i]));
                }
                data.add(row);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return data;
    }
//    public static void main (String[] args) {
//        tutorListing test = new tutorListing();
//        ArrayList<ArrayList<String>> data = test.getFrenchTutors("eighth");
//        System.out.println(data);
//        System.out.println(test.addTutor("paul", "dhruv", "science", "Paul", "Richter", "Dhruv", "saligram", "No Rating", "paul@gmail.com", "dhruv@gmail.com"));        
//    }
}
