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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**

 @author IndianRonaldo
 */
public class classes {
    private String userName;
    private String connectionURL;
    private Connection dbConn;
    private String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "math", "social", "science", "english", "spanish", "french", "chinese", "fileLink"};
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
    public classes() {
        this.userName = "";
        setDbConn();
    }
    public classes(String userName) {
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
    public ArrayList<ArrayList<String>> getMyClasses() {
        //Creating variables below:
        ArrayList<String> classBool = new ArrayList<>();
        ArrayList<ArrayList<String>> finalData = new ArrayList<>();
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM userInfo WHERE userName = '" + this.userName + "'";
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
            ArrayList<String> stuff = data.get(0);
            classBool.add(stuff.get(6));
            classBool.add(stuff.get(7));
            classBool.add(stuff.get(8));
            classBool.add(stuff.get(9));
            classBool.add(stuff.get(10));
            classBool.add(stuff.get(11));
            classBool.add(stuff.get(12));
            //math
            if (classBool.get(0).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("math.png");
                tempData.add("math");
                finalData.add(tempData);
            }
            //social science
            if (classBool.get(1).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("social.png");
                tempData.add("social");
                finalData.add(tempData);
            }
            //science
            if (classBool.get(2).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("science.png");
                tempData.add("science");
                finalData.add(tempData);
            }
            //english
            if (classBool.get(3).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("english.png");
                tempData.add("english");
                finalData.add(tempData);
            }
            //spanish
            if (classBool.get(4).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("spanish.png");
                tempData.add("spanish");
                finalData.add(tempData);
            }
            //french
            if (classBool.get(5).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("french.png");
                tempData.add("french");
                finalData.add(tempData);
            }
            //chinese
            if (classBool.get(6).equals("1")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("chinese.png");
                tempData.add("chinese");
                finalData.add(tempData);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return finalData;
    }
    public ArrayList<ArrayList<String>> getMyNotClasses() {
        //Creating variables below:
        ArrayList<String> classBool = new ArrayList<>();
        ArrayList<ArrayList<String>> finalData = new ArrayList<>();
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM userInfo WHERE userName = '" + this.userName + "'";
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
            ArrayList<String> stuff = data.get(0);
            classBool.add(stuff.get(6));
            classBool.add(stuff.get(7));
            classBool.add(stuff.get(8));
            classBool.add(stuff.get(9));
            classBool.add(stuff.get(10));
            classBool.add(stuff.get(11));
            classBool.add(stuff.get(12));
            //math
            if (classBool.get(0).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("math.png");
                tempData.add("math");
                finalData.add(tempData);
            }
            //social science
            if (classBool.get(1).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("social.png");
                tempData.add("social");
                finalData.add(tempData);
            }
            //science
            if (classBool.get(2).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("science.png");
                tempData.add("science");
                finalData.add(tempData);
            }
            //english
            if (classBool.get(3).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("english.png");
                tempData.add("english");
                finalData.add(tempData);
            }
            //spanish
            if (classBool.get(4).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("spanish.png");
                tempData.add("spanish");
                finalData.add(tempData);
            }
            //french
            if (classBool.get(5).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("french.png");
                tempData.add("french");
                finalData.add(tempData);
            }
            //chinese
            if (classBool.get(6).equals("0")) {
                ArrayList<String> tempData = new ArrayList<>();
                tempData.add("chinese.png");
                tempData.add("chinese");
                finalData.add(tempData);
            }
        } //Catching SQL exceptions below:
        catch (SQLException e) {
            //Giving user error message below:
            System.out.println("Error getting data from database!");
            System.exit(0);
        }
        return finalData;
    }
    public ArrayList<ArrayList<String>> classOverview(String className, String userName) {
        //Creating variables below:
        String[] tableHeaders2 = {"tutorName", "userName", "subjectTaught", "tutorFirst", "tutorLast", "studentFirst", "studentLast", "rating", "tutorEmail", "studentEmail"};
        int columnCount = tableHeaders2.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM myTutors WHERE subjectTaught = '" + className + "' AND userName = '" + userName + "'";
        ArrayList<ArrayList<String>> data = new ArrayList<>();
        try {
            //Adding values to 2D array from array list below:
            s = this.dbConn.createStatement();
            rs = s.executeQuery(dbQuery);
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int i = 0; i < columnCount; i++) {
                    row.add(rs.getString(tableHeaders2[i]));
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
    public boolean addClasses(String newClass) {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String memberUpdate = "UPDATE userInfo SET " + newClass + " = 1 WHERE userName = ?";
        boolean status = true;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing select statement to get info from the database below:
            PreparedStatement updateMembers = con.prepareStatement(memberUpdate);
            //Replacing ? with values below:
            updateMembers.setString(1, this.userName);
            //Executing statement below:
            updateMembers.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
//    public static void main (String[] args) {
//        classes test = new classes();
//        test.setUserName("max");
//        System.out.println(test.getMyNotClasses());
//    }
}
