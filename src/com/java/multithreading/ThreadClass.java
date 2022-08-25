package com.java.multithreading;

public class ThreadClass extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		ThreadClass obj = new ThreadClass();
		new Thread(obj).start();
	}
}
