package com.semanticsquare.concurrency;

import java.util.concurrent.TimeUnit;

public class MyFirstThread {
	
	public static void main(String[] args) {		
		Task task = new Task();
		Thread thread = new Thread(task); //NEW
		thread.start();
		
		try {
			//thread.sleep(3000);
			TimeUnit.SECONDS.sleep(3);
			thread.interrupt();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside main ...");
	}
}
 
class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run ...");
		try {
			//thread.sleep(3000);
			TimeUnit.SECONDS.sleep(9);
		} catch (InterruptedException e) {
			System.out.println("interrupted!!");
		}
		go();
	}

	private void go() {
		// TODO Auto-generated method stub
		System.out.println("Inside go ...");
		more();
	}
	
	private void more() {
		// TODO Auto-generated method stub
		System.out.println("Inside more ...");
	}
	
}