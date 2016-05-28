package com.henu.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Net2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		try {
//			ServerSocket ss = new ServerSocket(8650);
//			//调用accept方法
//			System.out.println("****服务器即将启动，等待链接****");
//			Socket so = ss.accept();
//			//通过输入输入量获取信息
//			InputStream is = so.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			BufferedReader br = new BufferedReader(isr);
//			String info = br.readLine();
//			while(info!=null){
//				System.out.println("服务端："+info);
//				info = br.readLine();
//			}
//			so.shutdownInput();
//			OutputStream os = so.getOutputStream();
//			PrintWriter pw = new PrintWriter(os);
//			pw.write("欢迎");
//			pw.flush();
//			pw.close();
//			os.close();
//			is.close();
//			isr.close();
//			br.close();
//			ss.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		try {
			int ct =0;
			ServerSocket ss = new ServerSocket(8650);
			Socket socket = null;
			System.out.println("****服务器即将启动，等待链接****");
			while(true){
				socket = ss.accept();
				//创建线程
				ServerThread st = new ServerThread(socket);
				st.start();
				ct++;
				System.out.println("数量："+ct);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
