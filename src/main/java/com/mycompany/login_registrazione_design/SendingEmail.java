/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login_registrazione_design;

import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author ildon
 */
public class SendingEmail {
    private String userEmail;
    private int myCode;
    
    
   
    
    public SendingEmail (String userEmail, int myCode ){
        this.userEmail = userEmail;
        this.myCode = myCode;
        
        
        
    }
    public void sendMail(){
        String email = "labbproject@gmail.com";
        String pword = "UninsubriaLabB89";
        Properties properties = new Properties();
        
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(email, pword);
            }
        });
        
        try{
            
            MimeMessage message =new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
            message.setSubject("Il Paroliere, codice verifica Email");
            message.setText("Codice di verifica ...");
            message.setText("il tuo codice di verifica :: "+myCode);
            Transport.send(message);
            
            
        }catch(Exception ex){
            System.out.println("InvioEmail...."+ex);
            
        }
    } 
    
    
}
