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
public class settings {
    private String userName;
    private String email;
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String connectionURL;
    private Connection dbConn;
    private String password;
    private String summary;
    private String calendarLink;
    private int first;
    private int second;
    private int third;
    private int fourth;
    private int fifth;
    private int sixth;
    private int seventh;
    private int eighth;
    public String getCalendarLink() {
        return calendarLink;
    }
    public void setCalendarLink(String calendarLink) {
        this.calendarLink = calendarLink;
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
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getConnectionURL() {
        return connectionURL;
    }
    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
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
    public int getGradeLevel() {
        return gradeLevel;
    }
    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public settings() {
        this.userName = "";
        setDbConn();
    }
    public settings(String userName) {
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
    public ArrayList<ArrayList<String>> getUserInfo() {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "math", "social", "science", "english", "spanish", "french", "chinese", "fileLink"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("userInfo", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getParentInfo() {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "avatar"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("parentInfo", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getTutorInfo() {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "summary", "math", "social", "science", "english", "spanish", "french", "chinese", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "calendarLink", "rating"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("tutorInfo", this.userName, tableHeaders);
        return data;
    }
    
    public ArrayList<ArrayList<String>> getUserInfoEmail() {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "math", "social", "science", "english", "spanish", "french", "chinese", "fileLink"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeEmailData("userInfo", this.email, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getParentInfoEmail() {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "avatar"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeEmailData("parentInfo", this.email, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getTutorInfoEmail() {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "summary", "math", "social", "science", "english", "spanish", "french", "chinese", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "calendarLink", "rating"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeEmailData("tutorInfo", this.email, tableHeaders);
        return data;
    }
    
    public ArrayList<ArrayList<String>> getUserLogin() {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("userLogin", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getParentLogin() {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("parentLogin", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getTutorLogin() {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("tutorLogin", this.userName, tableHeaders);
        return data;
    }
    
    public boolean updateStudentSettings() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE userInfo SET email = ?, firstName = ?, lastName = ?, gradeLevel = ? WHERE userName = ?";
//        String memberUpdate = "UPDATE userInfo SET email = '" + email + "', firstName = '" + firstName + "', lastName = '" + lastName + "', gradeLevel = " + gradeLevel + " WHERE userName = '" + userName + "'";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.email);
            updateMembers.setString(2, this.firstName);
            updateMembers.setString(3, this.lastName);
            updateMembers.setInt(4, this.gradeLevel);
            updateMembers.setString(5, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateTutorSettings() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE tutorInfo SET email = ?, firstName = ?, lastName = ?, gradeLevel = ?, summary = ?, first = ?, second = ?, third = ?, fourth = ?, fifth = ?, sixth = ?, seventh = ?, eighth = ?, calendarLink = ? WHERE userName = ?";
//        String memberUpdate = "UPDATE userInfo SET email = '" + email + "', firstName = '" + firstName + "', lastName = '" + lastName + "', gradeLevel = " + gradeLevel + " WHERE userName = '" + userName + "'";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.email);
            updateMembers.setString(2, this.firstName);
            updateMembers.setString(3, this.lastName);
            updateMembers.setInt(4, this.gradeLevel);
            updateMembers.setString(5, this.summary);
            updateMembers.setInt(6, this.first);
            updateMembers.setInt(7, this.second);
            updateMembers.setInt(8, this.third);
            updateMembers.setInt(9, this.fourth);
            updateMembers.setInt(10, this.fifth);
            updateMembers.setInt(11, this.sixth);
            updateMembers.setInt(12, this.seventh);
            updateMembers.setInt(13, this.eighth);
            updateMembers.setString(14, this.calendarLink);
            updateMembers.setString(15, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateParentSettings() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE parentInfo SET email = ?, firstName = ?, lastName = ? WHERE userName = ?";
//        String memberUpdate = "UPDATE userInfo SET email = '" + email + "', firstName = '" + firstName + "', lastName = '" + lastName + "', gradeLevel = " + gradeLevel + " WHERE userName = '" + userName + "'";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.email);
            updateMembers.setString(2, this.firstName);
            updateMembers.setString(3, this.lastName);
            updateMembers.setString(4, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateStudentPassword() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE userLogin SET password = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.password);
            updateMembers.setString(2, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateTutorPassword() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE tutorLogin SET password = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.password);
            updateMembers.setString(2, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public boolean updateParentPassword() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE parentLogin SET password = ? WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.password);
            updateMembers.setString(2, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    
    public int characterTester(String message) {
        int status = 0;
        int entryLength = message.length();
        if (entryLength == 0) {
            status = 1;
        } else {
            for (int i=0; i<entryLength; i++) {
                if (!isAccepted(message.charAt(i))) {
                    status = 2;
                    break;
                }
            }
        }
        return status;
    }
    
    public boolean isAccepted(char character) {
        return (character>= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z') || (character >= '0' && character <= '9') ||
               (character == '@') || (character == '.') || (character == '_') || (character == '-') || (character == '$') ||
               (character == '!') || (character == '#') || (character == '%') || (character == '^') || (character == '&') ||
               (character == '*') || (character == '(') || (character == (')') || (character == '/') || (character == '?') ||
               (character == ',') || (character == '+') || (character == '=') || (character == ';') || (character == ':') ||
               (character == '"') || (character == '<') || (character == '>') || (character == '{') || (character == '}') ||
               (character == '[') || (character == ']') || (character == ' ') || (character == 39) || (character == '~') ||
               (character == '`') || (character == '|') || (character == 92) || (character == 32));
    }
//    public static void main(String[] args) {
//        settings test = new settings();
//        test.setUserName("max");
//        test.setEmail("email");
//        test.setFirstName("first");
//        test.setLastName("last");
//        test.setGradeLevel(7);
//        System.out.println(test.updateStudentSettings("max", "maxine@gmail", "max", "huh", 9));
//    }
}
