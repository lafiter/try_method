package demo;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class StringDemo {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s0 = "����";
		String s1 = "����";
		String s2 = new String("����");
		String s3 = new String("����");
		//��γ��ֵ��ַ���������java������ֻ����һ�� 
		System.out.println(s0==s1);
        System.out.println(s0==s2);
        System.out.println(s2==s3);
        Boolean flag = false;
        System.out.print(flag==true);
        System.out.println(flag=true);
        for (int i = 0; i < 10; i++) {
        	if (i == 3) {
        	 break;//
        	 //continue;//i=3��ʱ�������һ�ε�ѭ��,����ִ��i=4��ѭ��
        	//return;// ֱ�ӽ�����������
        	}
        	System.out.println("----" + i);
        	}
        	System.out.println("-111--");
        //java��˫�ֽڱ���
        String str = "����hh";
        byte[] b = str.getBytes("UTF-8");
        for(int i=0;i<b.length;i++){
        	System.out.print(b[i]+" ");
        }
        File file = new File("D:\\΢��ƽ̨����0413.doc");
        System.out.println(file.isDirectory());
	}
}
