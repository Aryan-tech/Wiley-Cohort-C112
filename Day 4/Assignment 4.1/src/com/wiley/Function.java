package com.wiley;

public class Function extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getId() +"  " + Thread.currentThread().getName()+"  "+Thread.currentThread().isAlive()+"  "+Thread.currentThread().getPriority()+"  "+Thread.currentThread().getState());
			System.out.println();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
