package com.henu.thread;

public class Army implements Runnable {

	//volatile保证了线程可以正确的读取其他线程写入的值
	volatile boolean keepFire = true;
	@Override
	public void run() {
		while(keepFire){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"攻击对方"+i+"次。");
			    Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"结束了战斗！");
	}
}
