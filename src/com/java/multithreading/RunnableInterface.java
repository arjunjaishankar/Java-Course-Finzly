
package com.java.multithreading;

public class RunnableInterface implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		RunnableInterface ri = new RunnableInterface();
		new Thread(ri).start();
	}
}
