package com.henu.thread;

public class KeyPerson extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"��ʼ��ս����");
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"������ɱ����������..");
		}
		System.out.println(Thread.currentThread().getName()+"������ս��");
	}
}
