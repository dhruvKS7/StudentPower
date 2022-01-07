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
public class linksPage {
    private String userName;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public linksPage() {
        this.userName = "";
    }
    
    public linksPage(String userName) {
        this.userName = userName;
    }
    
    public ArrayList<ArrayList<String>> getCalendar () {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "summary", "math", "social", "science", "english", "spanish", "french", "chinese", "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "calendarLink", "rating"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("tutorInfo", this.userName, tableHeaders);
        return data;
    }
    
    public ArrayList<ArrayList<String>> getDrive () {
        String[] tableHeaders = {"userName", "email", "firstName", "lastName", "gradeLevel", "avatar", "math", "social", "science", "english", "spanish", "french", "chinese", "fileLink"};
        dbConnection databaseObject = new dbConnection("studentPowerDatabase");
        //Sending information to receive info from the database below:
        ArrayList<ArrayList<String>> data = databaseObject.getSomeData("userInfo", this.userName, tableHeaders);
        return data;
    }
}
