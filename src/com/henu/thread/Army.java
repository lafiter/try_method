package com.henu.thread;

public class Army implements Runnable {

	//volatile��֤���߳̿�����ȷ�Ķ�ȡ�����߳�д���ֵ
	volatile boolean keepFire = true;
	@Override
	public void run() {
		while(keepFire){
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"�����Է�"+i+"�Ρ�");
			    Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"������ս����");
	}
}
