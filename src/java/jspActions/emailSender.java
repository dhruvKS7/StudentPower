/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jspActions;
import java.sql.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**

 @author IndianRonaldo
 */
public class emailSender {
    private String email;
    private String copier;
    public String getCopier() {
        return copier;
    }
    public void setCopier(String copier) {
        this.copier = copier;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean sendEmail(String headerText, String mainText, boolean copy) {
        String reciever = email;
//        System.out.println(email);
        String from = "studentpower21@gmail.com";
//        System.out.println(email + ")//////////////////////////////////");
        String smtpServ = "smtp.gmail.com";
        String message = "Hi!<br><br>";
        message += mainText + "<br><br>";
        message += "From,<br>";
        message += "Student Power";
        try {
            // Get system properties
            Properties properties = System.getProperties();
            properties.put("mail.smtp.host", smtpServ);
            properties.put("mail.smtp.port", "587");
            properties.put("mail.transport.protocol", "smtp");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            Authenticator auth = new SMTPAuthenticator();
            Session session = Session.getInstance(properties, auth);
            // -- Create a new message --
            Message msg = new MimeMessage(session);
            // -- Set the FROM and TO fields --
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(reciever, false));
            if (copy == true) {
                msg.setRecipients(Message.RecipientType.CC, InternetAddress.parse(this.copier, false));
            }
            msg.setSubject("Student Power: " + headerText);
            msg.setContent(message, "text/html");
            // -- Set some other header information --
//            msg.setHeader("MyMail", "Mr. XYZ");
//            msg.setSentDate(new Date());
            // -- Send the message --
            Transport.send(msg);
        } catch (MessagingException mex) {
            mex.printStackTrace();
            return false;
        }
        return true;
    }
    //Sends email from my email address
    private class SMTPAuthenticator extends javax.mail.Authenticator {
        @Override
        public PasswordAuthentication getPasswordAuthentication() {
            String userName = "studentpower21@gmail.com";
            String password = "pass";
            return new PasswordAuthentication(userName, password);
        }
    }
//    public static void main(String[] args) {
//        emailSender test = new emailSender();
//        test.setEmail("");
//        System.out.println(test.sendEmail("ALERT!!", "Hey!", false));
//    }
}
