package JavaMail;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;
public class SendMail {

	/**
	 * @param zyx
	 */
     public static void send(String receiveMailAddress,String password){
    	 Properties prop = new Properties();
    	 prop.setProperty("mail.smtp.host", "smtp.qq.com");
    	 prop.put("mail.smtp.port", "587");
    	 prop.setProperty("mail.smtp.auth", "true");
    	 prop.put("mail.smtp.timeout", "25000");
    	 Session session = Session.getDefaultInstance(prop,new Authenticator(){
    		 protected PasswordAuthentication getPasswordAuthentication(){
    			 return new PasswordAuthentication("396790244@qq.com","706430283zyx.");
    		 }
    	 });
    	 Message message = new MimeMessage(session);
    	 try {
			message.setFrom(new InternetAddress("396790244@qq.com"));
			message.setSubject("UTF-8");
    	    message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(receiveMailAddress));
    	 
    	 message.setSubject("哈哈哈");
    	 message.setText("这是一封邮件");
    	 message.setSentDate(new Date());
    	 System.out.println("just do it");
    	 System.out.println(message);
    	 Transport.send(message);
    	 System.out.println("success");
    	 } catch (MessagingException e) {
 			e.printStackTrace();
 		}
     }
	public static void main(String[] args) {
		
	     SendMail.send("396790244@qq.com","706430283zyx."); 
	  
	}

}
