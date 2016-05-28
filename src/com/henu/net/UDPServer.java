package com.henu.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
         DatagramSocket ds = new DatagramSocket(8650); 
         byte[] data = new byte[1024];
         DatagramPacket dp = new DatagramPacket(data, data.length);
         System.out.println("********服务器端已经启动，等待链接********");
         ds.receive(dp);
         String info = new String(data, 0, dp.getLength());
         System.out.println("服务器端：客户说："+info);
         InetAddress ia = dp.getAddress();
         int port = dp.getPort();
         System.out.println(port);
         byte[] data2 = "欢迎你".getBytes();
         DatagramPacket packet2 = new DatagramPacket(data2, data2.length, ia,port);
         ds.send(packet2);
         ds.close();
	}
}
