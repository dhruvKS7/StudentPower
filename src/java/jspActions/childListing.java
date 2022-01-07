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
public class childListing {
    private String userName;
    private String connectionURL;
    private Connection dbConn;
    private String parentName;
    public String getParentName() {
        return parentName;
    }
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
    private String[] tableHeaders = {"parentName", "userName"};
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
    public childListing() {
        this.userName = "";
        setDbConn();
    }
    public childListing(String userName) {
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
    public boolean addChild() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String tutorChecker = "INSERT INTO parentChild VALUES (?, ?)";
        boolean status = true;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing insert statement to insert info into the database below:
            PreparedStatement tutorCheck = con.prepareStatement(tutorChecker);
            //Replacing ? with values below:
            tutorCheck.setString(1, this.parentName);
            tutorCheck.setString(2, this.userName);
            //Executing statement below:
            tutorCheck.executeUpdate();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    public ArrayList<ArrayList<String>> getMyChildren() {
        studentListing userInfo = new studentListing();
        ArrayList<ArrayList<String>> finalData = new ArrayList<>();
        String[] tableHeaders = {"parentName", "userName"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeParentData("parentChild", this.parentName, tableHeaders);
        int numberOfChildren = data.size();
        for (int i = 0; i < numberOfChildren; i++) {
            userInfo.setUserName(data.get(i).get(1));
            ArrayList<ArrayList<String>> stuff = userInfo.getUserInfo();
            ArrayList<String> temp = stuff.get(0);
            String classes = "";
            if (temp.get(6).equals("1")) {
                classes += "Math ";
            }
            if (temp.get(7).equals("1")) {
                classes += "Social-Science ";
            }
            if (temp.get(8).equals("1")) {
                classes += "Science ";
            }
            if (temp.get(9).equals("1")) {
                classes += "English ";
            }
            if (temp.get(10).equals("1")) {
                classes += "Spanish ";
            }
            if (temp.get(11).equals("1")) {
                classes += "French ";
            }
            if (temp.get(12).equals("1")) {
                classes += "Chinese ";
            }
            String[] separate = classes.split(" ");
            int numClasses = separate.length;
            String finalClasses = "";
            for (int j = 0; j < numClasses; j++) {
                if (j != numClasses - 1) {
                    finalClasses += separate[j] + ", ";
                } else {
                    finalClasses += separate[j];
                }
            }
            ArrayList<String> row = new ArrayList<>();
            row.add(temp.get(0));
            row.add(temp.get(1));
            row.add(temp.get(2));
            row.add(temp.get(3));
            row.add(temp.get(4));
            row.add(temp.get(5));
            row.add(temp.get(13));
            row.add(finalClasses);
            finalData.add(row);
        }
        return finalData;
    }
    public ArrayList<ArrayList<String>> getMyChildrenTutors() {
        tutorListing userInfo = new tutorListing();
        ArrayList<ArrayList<String>> finalData = new ArrayList<>();
        String[] tableHeaders = {"parentName", "userName"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeParentData("parentChild", this.parentName, tableHeaders);
        int numberOfChildren = data.size();
        for (int i = 0; i < numberOfChildren; i++) {
            userInfo.setUserName(data.get(i).get(1));
            ArrayList<ArrayList<String>> stuff = userInfo.getMyTutors();
            int num = stuff.size();
            for (int j = 0; j < num; j++) {
                finalData.add(stuff.get(j));
            }
        }
        return finalData;
    }
    public ArrayList<ArrayList<String>> getParentChild() {
        //Creating variables below:
        int columnCount = tableHeaders.length;
        ResultSet rs = null;
        Statement s = null;
        String dbQuery = "SELECT * FROM parentChild WHERE parentName = '" + this.parentName + "' AND userName = '" + this.userName + "'";
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
//    public static void main(String[] args) {
//        childListing test = new childListing();
//        test.setParentName("tim");
//        test.setUserName("sanaa");
//        System.out.println(test.getParentChild());
//    }
}
