package com.henu.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriterAndFileReader {
     
     public static void main(String args[]) throws IOException{
    	 File myfile = new File("D:/微信平台测试0413.doc");
    	 FileWriter fw = new FileWriter(myfile);
    	 fw.write("ellowws");
    	 fw.close();
    	 FileReader fr = new FileReader(myfile);
    	 for(int i=0;i<myfile.length();i++){
    		 System.out.println((char)fr.read());
    	 }
    	 //System.out.println((char)fr.read());
    	 fr.close();
    	 //FileWriter可以批量写入，但是FileReader每次只能读取一个字符。
     }
}
