//Declaring package below:
package jspActions;
//Imports below:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//Creating class below:
public class signUpPage {
    //Declaring initializers below:
    private String dbName;
    private String connectionURL;
    private String userName;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String childName;
    private String summary;
    private String avatar;
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    //Creating constructor below:
    public signUpPage() {
        this.dbName = "";
        this.connectionURL = "";
        this.userName = "";
        this.password = "";
        this.email = "";
        this.firstName = "";
        this.lastName = "";
        this.gradeLevel = 1;
        this.childName = "";
        this.summary = "";
    }
    //Creating constructor below:
    public signUpPage(String dbName, String connectionURL, String userName, String password, String email, String firstName, String lastName, int gradeLevel, String childName, String summary) {
        this.dbName = dbName;
        this.connectionURL = connectionURL;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.childName = childName;
        this.summary = summary;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getChildName() {
        return childName;
    }
    public void setChildName(String childName) {
        this.childName = childName;
    }
    public String getDbName() {
        return dbName;
    }
    public void setDbName(String dbName) {
        this.dbName = dbName;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
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
    //Creating method below:
    public boolean studentSignUp() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String signUpChecker = "INSERT INTO userLogin VALUES (?, ?)";
        String infoChecker = "INSERT INTO userInfo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean status = true;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing insert statement to insert info into the database below:
            PreparedStatement signUpCheck = con.prepareStatement(signUpChecker);
            //Replacing ? with values below:
            signUpCheck.setString(1, this.userName);
            signUpCheck.setString(2, this.password);
            //Executing statement below:
            signUpCheck.executeUpdate();
            //Executing insert statement to insert info into the database below:
            PreparedStatement infoCheck = con.prepareStatement(infoChecker);
            //Replacing ? with values below:
            infoCheck.setString(1, this.userName);
            infoCheck.setString(2, this.email);
            infoCheck.setString(3, this.firstName);
            infoCheck.setString(4, this.lastName);
            infoCheck.setInt(5, this.gradeLevel);
            infoCheck.setString(6, this.avatar);
            infoCheck.setInt(7, 0);
            infoCheck.setInt(8, 0);
            infoCheck.setInt(9, 0);
            infoCheck.setInt(10, 0);
            infoCheck.setInt(11, 0);
            infoCheck.setInt(12, 0);
            infoCheck.setInt(13, 0);
            infoCheck.setString(14, "working.html");
            //Executing statement below:
            infoCheck.executeUpdate();
            
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    
    //Creating method below:
    public boolean tutorSignUp() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String signUpChecker = "INSERT INTO tutorLogin VALUES (?, ?)";
        String infoChecker = "INSERT INTO tutorInfo VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        boolean status = true;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            //Executing insert statement to insert info into the database below:
            PreparedStatement signUpCheck = con.prepareStatement(signUpChecker);
            //Replacing ? with values below:
            signUpCheck.setString(1, this.userName);
            signUpCheck.setString(2, this.password);
            //Executing statement below:
            signUpCheck.executeUpdate();
            //Executing insert statement to insert info into the database below:
            PreparedStatement infoCheck = con.prepareStatement(infoChecker);
            //Replacing ? with values below:
            infoCheck.setString(1, this.userName);
            infoCheck.setString(2, this.email);
            infoCheck.setString(3, this.firstName);
            infoCheck.setString(4, this.lastName);
            infoCheck.setInt(5, this.gradeLevel);
            infoCheck.setString(6, this.avatar);
            infoCheck.setString(7, this.summary);
            infoCheck.setInt(8, 0);
            infoCheck.setInt(9, 0);
            infoCheck.setInt(10, 0);
            infoCheck.setInt(11, 0);
            infoCheck.setInt(12, 0);
            infoCheck.setInt(13, 0);
            infoCheck.setInt(14, 0);
            infoCheck.setInt(15, 0);
            infoCheck.setInt(16, 0);
            infoCheck.setInt(17, 0);
            infoCheck.setInt(18, 0);
            infoCheck.setInt(19, 0);
            infoCheck.setInt(20, 0);
            infoCheck.setInt(21, 0);
            infoCheck.setInt(22, 0);
            infoCheck.setString(23, "working.html");
            infoCheck.setString(24, "No Rating");
            //Executing statement below:
            infoCheck.executeUpdate();
            
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            status = false;
        }
        return status;
    }
    
    //Creating method below:
    public boolean parentSignUp() {
        //Establishing connection to database below:
        Connection con = null;
        this.setConnectionURL("jdbc:mysql://localhost:3306/studentPowerDatabase");
        String signUpChecker = "INSERT INTO parentLogin VALUES (?, ?)";
        String infoChecker = "INSERT INTO parentInfo VALUES (?, ?, ?, ?, ?)";
        String childChecker = "INSERT INTO parentChild VALUES (?, ?)";
        boolean status = true;
        //Creating try and catch statement below:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.connectionURL, "sample", "sample");
            
            //Executing insert statement to insert info into the database below:
            PreparedStatement signUpCheck = con.prepareStatement(signUpChecker);
            //Replacing ? with values below:
            signUpCheck.setString(1, this.userName);
            signUpCheck.setString(2, this.password);
            //Executing statement below:
            signUpCheck.executeUpdate();
            
            //Executing insert statement to insert info into the database below:
            PreparedStatement infoCheck = con.prepareStatement(infoChecker);
            //Replacing ? with values below:
            infoCheck.setString(1, this.userName);
            infoCheck.setString(2, this.email);
            infoCheck.setString(3, this.firstName);
            infoCheck.setString(4, this.lastName);
            infoCheck.setString(5, this.avatar);
            //Executing statement below:
            infoCheck.executeUpdate();
            
            //Executing insert statement to insert info into the database below:
            PreparedStatement childCheck = con.prepareStatement(childChecker);
            //Replacing ? with values below:
            childCheck.setString(1, this.userName);
            childCheck.setString(2, this.childName);
            //Executing statement below:
            childCheck.executeUpdate();
            
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
    
    //Creating main method below:
//    public static void main(String[] args) {
//        signUpPage test = new signUpPage("studentPowerDatabase", "jdbc:mysql://localhost:3306/", "paul", "test", "saligramdhruv@gmail.com", "Dhruv", "Saligram", 12, "max", "Hi! I'm a comp sci student!");
//        boolean status = test.tutorSignUp();
//        System.out.println(status);
//    }
}
