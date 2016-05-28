package com.henu.file;
import java.io.*;
public class OutputStreamWriterAndInputStreamReaderDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("my.txt");
		OutputStream os = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		osw.write("HELLO");
		osw.close();
		os.close();
		 
		InputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is);
        System.out.println((char)isr.read());
        isr.close();
        is.close();
        //OutputStreamWriter可以批量写入，但是InputStreamReader每次只能读取一个字符。效果同FileWriter和FileReader。
	}

}
