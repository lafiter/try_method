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
        //OutputStreamWriter��������д�룬����InputStreamReaderÿ��ֻ�ܶ�ȡһ���ַ���Ч��ͬFileWriter��FileReader��
	}

}
