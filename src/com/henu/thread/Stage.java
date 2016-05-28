package com.henu.thread;

public class Stage extends Thread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
        Army ar = new Army();
        Army ar2 = new Army();
        
        Thread arm = new Thread(ar,"�峯����");
        Thread arm2 = new Thread(ar2,"ũ�������");
        arm.start();
        arm2.start();
        
        try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
         
        System.out.println("��·���˸���ҧ�𣡣���");
        Thread cheng = new KeyPerson();
        cheng.setName("��ҧ��");
        System.out.println("freedom��");
        
        ar.keepFire=false;
        ar2.keepFire=false;
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        cheng.start();
        try {
			cheng.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        System.out.println("success!end");
	}

	public static void main(String[] args) {
            new Stage().start();
	}

}
