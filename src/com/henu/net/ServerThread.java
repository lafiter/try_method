package com.henu.net;
import java.io.*;
import java.net.*;
public class ServerThread extends Thread {

	/**
	 * @param args
	 */
	Socket so = null;
	PrintWriter pw;
	OutputStream os;
	public static void main(String[] args) {
		
	}
	public ServerThread(Socket so){
		this.so = so;
	}
	public void run(){
		InputStream is;
		try {
			is = so.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String info = br.readLine();
		while(info!=null){
			System.out.println("服务端："+info);
			info = br.readLine();
		}
		so.shutdownInput();
	    os = so.getOutputStream();
		pw = new PrintWriter(os);
		InetAddress address = so.getInetAddress();
		pw.write("欢迎你:"+address );
		pw.flush();
		isr.close();
		br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//关闭资源
			pw.close();
			 
			
		}
	}

}
