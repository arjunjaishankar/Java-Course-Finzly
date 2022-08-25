package com.java.oops.delegation;

public class Delegation {

	public static void main(String[] args) {

		Work delegation = new Work();
		delegation.work();
	}
}

class Work {

	RealWork realWork = new RealWork();

	public void work() {
		realWork.work();
	}
}

class RealWork {
	public void work() {
		System.out.println("Work completed here..");
	}
}
