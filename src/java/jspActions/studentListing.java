/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspActions;
import java.util.ArrayList;
/**

 @author IndianRonaldo
 */
public class studentListing {
    private String userName;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public studentListing() {
        this.userName = "";
    }
    
    public studentListing(String userName) {
        this.userName = userName;
    }
    
    public ArrayList<ArrayList<String>> getUserInfo () {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "math", "social", "science", "english", "spanish", "french", "chinese", "fileLink"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("userInfo", this.userName, tableHeaders);
        return data;
    }
    public ArrayList<ArrayList<String>> getUserLogin () {
        String[] tableHeaders = {"userName", "password"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("userLogin", this.userName, tableHeaders);
        return data;
    }
}
