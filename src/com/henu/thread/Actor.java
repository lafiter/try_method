package com.henu.thread;

public class Actor extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Thread actor = new Actor();
        actor.setName("赵洋勋");
        actor.start();
        Thread actress = new Thread(new Actress(),"静静");
        actress.start();
	}
	public void run(){
		System.out.println(getName()+"是一个演员！");
		int count=0;
		Boolean flag = true;
		while(flag){
			System.out.println(getName()+"登台演出："+(++count));
			if(count == 100){
				System.out.println(getName()+"的演出结束了！！！");
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
		//System.out.println(getName()+"的演出结束了！！！");
	}

}

class Actress implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"是一个演员！");
		int count=0;
		Boolean flag = true;
		while(flag){
			System.out.println(Thread.currentThread().getName()+"登台演出："+(++count));
			if(count == 100){
				System.out.println(Thread.currentThread().getName()+"的演出结束了！！！");
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
