package mailSender;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * �����ʼ��Ĳ��Գ���
 * 
 * @author lwq
 * 
 */
public class MailTest {

    public static void main(String[] args) throws MessagingException {
        // ���÷����ʼ��Ļ�������
        final Properties props = new Properties();
        /*
         * ���õ����ԣ� mail.store.protocol / mail.transport.protocol / mail.host /
         * mail.user / mail.from
         */
        // ��ʾSMTP�����ʼ�����Ҫ���������֤
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.163.com");
        // �����˵��˺�
        props.put("mail.user", "13383821198@163.com");
        // ����SMTP����ʱ��Ҫ�ṩ������
        props.put("mail.password", "*******");

        // ������Ȩ��Ϣ�����ڽ���SMTP���������֤
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                // �û���������
                //String userName = props.getProperty("mail.user");
               // String password = props.getProperty("mail.password");
            	String userName="13383821198@163.com";
            	String password="5201314zyx";
                return new PasswordAuthentication(userName, password);
            }
        };
        // ʹ�û������Ժ���Ȩ��Ϣ�������ʼ��Ự
        Session mailSession = Session.getInstance(props, authenticator);
        // �����ʼ���Ϣ
        MimeMessage message = new MimeMessage(mailSession);
        // ���÷�����
        InternetAddress form = new InternetAddress(
                props.getProperty("mail.user"));
        message.setFrom(form);

        // �����ռ���
        InternetAddress to = new InternetAddress("396790244@qq.com");
        message.setRecipient(RecipientType.TO, to);

        // ���ó���
       // InternetAddress cc = new InternetAddress("luo_aaaaa@yeah.net");
       // message.setRecipient(RecipientType.CC, cc);

        // �������ͣ��������ռ��˲��ܿ������͵��ʼ���ַ
        //InternetAddress bcc = new InternetAddress("aaaaa@163.com");
       // message.setRecipient(RecipientType.CC, bcc);

        // �����ʼ�����
        message.setSubject("�²�����˭��");

        // �����ʼ���������
        message.setContent("<a href='http://www.baidu.com'>���Ե�HTML�ʼ�</a>", "text/html;charset=UTF-8");
        
        message.setFileName("C:/qrcode.png");
        // �����ʼ�
        Transport.send(message);
        System.out.println("���ͳɹ���");
    }
}
