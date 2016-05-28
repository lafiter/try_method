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
         System.out.println("********���������Ѿ��������ȴ�����********");
         ds.receive(dp);
         String info = new String(data, 0, dp.getLength());
         System.out.println("�������ˣ��ͻ�˵��"+info);
         InetAddress ia = dp.getAddress();
         int port = dp.getPort();
         System.out.println(port);
         byte[] data2 = "��ӭ��".getBytes();
         DatagramPacket packet2 = new DatagramPacket(data2, data2.length, ia,port);
         ds.send(packet2);
         ds.close();
	}
}
