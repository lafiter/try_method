package com.henu.file;

import java.io.*;
 

public class DemoOutputStreamAndInputStream {
      public static void main(String args[]) throws IOException{
    	  File f = new File("D:/΢��ƽ̨����0413.doc");
    	  char[] data = new char[]{'H','E','L','L','O'};
    	  OutputStream os = new FileOutputStream(f);
    	  //for(int i=0;i<f.length();i++){
    	  os.write(data[0]);
    	 // }
    	  os.close();
    	  InputStream is =new FileInputStream(f);
    	  for(int i=0;i<f.length();i++){
    		  System.out.println((char)is.read());
    	  }
    	  System.out.println("��"+(char)is.read());
    	  //OutputStream��InputStreamÿ��ֻ���Զ�дһ���ַ���
      }
}
