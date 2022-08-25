package com.finzly.java.variable;

public final class Variable {

	private int a;
	private int b;

	private static Variable variable;

	private Variable() {

	}

	public static Variable getInstance() {
		if (variable == null)
			variable = new Variable();
		return variable;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
