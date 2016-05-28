package com.henu.file;
import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class BufferedWriterAndBufferedReader {
	public static void main(String[] args) throws IOException {
		 File f = new File("my");
         OutputStream os = new FileOutputStream(f);
         OutputStreamWriter osw = new OutputStreamWriter(os);
         BufferedWriter bw = new BufferedWriter(osw);
         bw.write("Hello");
         bw.close();
         osw.close();
         os.close();
         
         InputStream is = new FileInputStream(f);
         InputStreamReader isr = new InputStreamReader(is);
         BufferedReader br = new BufferedReader(isr);
         System.out.println(br.readLine());
         isr.close();
         is.close();
         //BufferedWriter和BufferedReader可以批量读写。
         int[] it = {0,1,2,3,4,5};
         List<int[]> ls = Arrays.asList(it);
         System.out.println(ls.size());
         //迭代器遍历
         Iterator<int[]> its = ls.iterator();
         while(its.hasNext()){
        	 System.out.println(its.next());
         }
         FileUtils.listDirectory(new File("E:/"));
	}
}
