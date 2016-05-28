package demo;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class StringDemo {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s0 = "请问";
		String s1 = "请问";
		String s2 = new String("请问");
		String s3 = new String("请问");
		//多次出现的字符串常量，java编译器只创建一次 
		System.out.println(s0==s1);
        System.out.println(s0==s2);
        System.out.println(s2==s3);
        Boolean flag = false;
        System.out.print(flag==true);
        System.out.println(flag=true);
        for (int i = 0; i < 10; i++) {
        	if (i == 3) {
        	 break;//
        	 //continue;//i=3的时候结束这一次的循环,继续执行i=4的循环
        	//return;// 直接结束整个函数
        	}
        	System.out.println("----" + i);
        	}
        	System.out.println("-111--");
        //java是双字节编码
        String str = "哈哈hh";
        byte[] b = str.getBytes("UTF-8");
        for(int i=0;i<b.length;i++){
        	System.out.print(b[i]+" ");
        }
        File file = new File("D:\\微信平台测试0413.doc");
        System.out.println(file.isDirectory());
	}
}
