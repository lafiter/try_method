package com.henu.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriterAndFileReader {
     
     public static void main(String args[]) throws IOException{
    	 File myfile = new File("D:/΢��ƽ̨����0413.doc");
    	 FileWriter fw = new FileWriter(myfile);
    	 fw.write("ellowws");
    	 fw.close();
    	 FileReader fr = new FileReader(myfile);
    	 for(int i=0;i<myfile.length();i++){
    		 System.out.println((char)fr.read());
    	 }
    	 //System.out.println((char)fr.read());
    	 fr.close();
    	 //FileWriter��������д�룬����FileReaderÿ��ֻ�ܶ�ȡһ���ַ���
     }
}
