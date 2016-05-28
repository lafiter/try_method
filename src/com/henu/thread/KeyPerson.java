package com.henu.thread;

public class KeyPerson extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}
	public void run(){
		System.out.println(Thread.currentThread().getName()+"开始了战斗！");
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"左右屠杀，攻击军队..");
		}
		System.out.println(Thread.currentThread().getName()+"结束了战斗");
	}
}
