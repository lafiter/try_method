package com.henu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class Net1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//        URL url1 = new URL("http://www.baidu.com");
//        URL url = new URL(url1,"/index.html?username=tom#text");//#��ʾê��
//        System.out.println(url.getProtocol());
//        System.out.println(url.getHost());
//        System.out.println(url.getPort());
//        System.out.println(url.getPath());
//        System.out.println(url.getFile());
//        System.out.println(url.getRef());
//        System.out.println(url.getAuthority());
//        InputStream is = url.openStream();
//        InputStreamReader isr = new InputStreamReader(is,"UTF-8");
//        //����
//        BufferedReader br = new BufferedReader(isr);
//        String str = br.readLine();
//        while(str!=null){
//        	System.out.println("aha"+str);
//        	str = br.readLine();
//        }
//        br.close();
//        is.close();
//        isr.close();
		try {
			Socket sc = new Socket("192.168.1.114",8650);
			OutputStream os = sc.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			pw.write("�û�����admin;���룺gan");
			System.out.println("����");
			pw.flush();
			sc.shutdownOutput();
			InputStream is = sc.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String str = br.readLine();
	        while(str!=null){
	        	System.out.println("���ǿͻ��ˣ�������˵��"+str);
	        	str = br.readLine();
	        }
	        is.close();
	        br.close();
			os.close();
			pw.close();
			sc.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	//TCP�������ӵģ��ɿ��ģ�����ġ����ֽ����ķ�ʽ��������
	//����TCPЭ��ʵ������ͨ�ŵ���
	//�ͻ��˵�Socket��
	//����˵�ServerSocke��
//	public void test(){
//		
//	}
	
	
}
