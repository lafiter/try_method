package demo;

import java.util.Date;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
				// 将Calendar对象转换为Date对象
		Date date = (Date) c.getTime();
		        // 创建SimpleDateFormat对象，指定目标格式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 将日期转换为指定格式的字符串
		String now = sdf.format(date);
		System.out.println("当前时间：" + now);
		 System.out.println("当前JRE：" + System.getProperty("java.version")); 
         System.out.println("当前JVM的默认字符集：" + Charset.defaultCharset()); 
	}
}
