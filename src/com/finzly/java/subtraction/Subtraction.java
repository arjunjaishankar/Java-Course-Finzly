package com.finzly.java.subtraction;

import com.finzly.java.variable.Variable;

public class Subtraction {

	public int subtraction() {
		Variable var = Variable.getInstance();
		var.setA(4);
		var.setB(3);
		return (var.getA() - var.getB());
	}
}
