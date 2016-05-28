package com.henu.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
         InetAddress ia = InetAddress.getByName("localhost");
         int port=8650;
         byte[] data = "用户名：啊哈，密码：123456".getBytes();
         DatagramPacket dp = new DatagramPacket(data, data.length,ia,port);
         DatagramSocket ds = new DatagramSocket();
         ds.send(dp);
         
         byte[] data2 = new byte[1024];
         DatagramPacket dp2 = new DatagramPacket(data2, data2.length);
         ds.receive(dp2);
         String info = new String(data2, 0, dp2.getLength());
         System.out.println("客户端：服务器说："+info);
         ds.close();
	}

}
