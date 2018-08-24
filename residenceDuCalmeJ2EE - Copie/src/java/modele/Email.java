/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.management.RuntimeErrorException;

/**
 *
 * @author AMR
 */
public class Email {

    public void sendEmail(String adress, String subject, String message) throws Exception {

        String from = "oracleamr@gmail.com";
        String pass = "##AnyPassword##";

        String[] to = {adress};
        String host = "smtp.gmail.com";

        Properties prob = System.getProperties();
        prob.put("mail.smtp.starttls.enable", "true");
        prob.put("mail.smtp.host", host);
        prob.put("mail.smtp.user", from);
        prob.put("mail.smtp.password", pass);
        prob.put("smtp.googlemail.com", "25");
        prob.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(prob,
         new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(from, pass);
			}
		  });
        try{ 
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(from));
        InternetAddress[] toadress = new InternetAddress[to.length];
        for (int i = 0; i < to.length; i++) {
            toadress[i] = new InternetAddress(to[i]);

        }
        for (int i = 0; i < toadress.length; i++) {
            msg.setRecipient(Message.RecipientType.TO, toadress[i]);

        }
        msg.setSubject(subject);
        msg.setContent(message, "text/html;charset=utf-8");
        Transport transport = session.getTransport("smtp");
        transport.connect(host, from, pass);
        transport.sendMessage(msg, msg.getAllRecipients());
        transport.close();
        }catch(MessagingException e){
        throw   new RuntimeException(e);
        
        }
    }

}
