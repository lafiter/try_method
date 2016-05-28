package com.henu.file;

import java.io.*;
 

public class DemoOutputStreamAndInputStream {
      public static void main(String args[]) throws IOException{
    	  File f = new File("D:/微信平台测试0413.doc");
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
    	  System.out.println("啊"+(char)is.read());
    	  //OutputStream和InputStream每次只可以读写一个字符。
      }
}
