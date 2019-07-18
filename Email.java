/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vinit
 */
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class Email  
{  
 public void sendMail (String r){   
     // String to = "vj1494@gmail.com";//change accordingly  
      String from = "vjsmte16@gmail.com";//change accordingly  
  
      final String username = "vjsmte16@gmail.com";
      final String password = "soniyachawla";
     
      
      
      Properties properties = new Properties();
      properties.put("mail.smtp.auth", "true");
      properties.put("mail.smtp.starttls.enable", "true");
      properties.put("mail.smtp.host", "smtp.gmail.com");
      properties.put("mail.smtp.port", "587");
      
      Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
          @Override
          protected PasswordAuthentication getPasswordAuthentication(){
              return new PasswordAuthentication(username, password);
          }
});
  
     //compose the message  
      try{  
         MimeMessage message = new MimeMessage(session);  
         message.setFrom(new InternetAddress(from));  
         message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(r));
                 //;.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
        // message.setSubject("Testing....sending emails with attachment");    
         BodyPart messageBodyPart = new MimeBodyPart();

         // Now set the actual message
         messageBodyPart.setText("This is message body");

         // Create a multipar message
         Multipart multipart = new MimeMultipart();

         // Set text message part
         multipart.addBodyPart(messageBodyPart);

         // Part two is attachment
         messageBodyPart = new MimeBodyPart();
         String filename = "D:\\Result.pdf";
         DataSource source = new FileDataSource(filename);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(filename);
         multipart.addBodyPart(messageBodyPart);
         // Send the complete message parts
         message.setContent(multipart);  
         // Send message  
         Transport.send(message);  
         System.out.println("message sent successfully....");   
      }catch (MessagingException mex) {mex.printStackTrace();}  
   }  
}  
