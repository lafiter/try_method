package demo;

import java.util.Date;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
				// ��Calendar����ת��ΪDate����
		Date date = (Date) c.getTime();
		        // ����SimpleDateFormat����ָ��Ŀ���ʽ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// ������ת��Ϊָ����ʽ���ַ���
		String now = sdf.format(date);
		System.out.println("��ǰʱ�䣺" + now);
		 System.out.println("��ǰJRE��" + System.getProperty("java.version")); 
         System.out.println("��ǰJVM��Ĭ���ַ�����" + Charset.defaultCharset()); 
	}
}
