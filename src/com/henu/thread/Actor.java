package com.henu.thread;

public class Actor extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("����ѫ");
        actor.start();
        Thread actress = new Thread(new Actress(),"����");
        actress.start();
	}
	public void run(){
		System.out.println(getName()+"��һ����Ա��");
		int count=0;
		Boolean flag = true;
		while(flag){
			System.out.println(getName()+"��̨�ݳ���"+(++count));
			if(count == 100){
				System.out.println(getName()+"���ݳ������ˣ�����");
				flag=false;
			}
			if(count%10==0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		//System.out.println(getName()+"���ݳ������ˣ�����");
	}

}

class Actress implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"��һ����Ա��");
		int count=0;
		Boolean flag = true;
		while(flag){
			System.out.println(Thread.currentThread().getName()+"��̨�ݳ���"+(++count));
			if(count == 100){
				System.out.println(Thread.currentThread().getName()+"���ݳ������ˣ�����");
				flag=false;
			}
			if(count%10==0){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
