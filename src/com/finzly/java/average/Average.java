package com.finzly.java.average;

import com.finzly.java.variable.Variable;

public class Average {

	public int average() {
		Variable var = Variable.getInstance();
		var.setA(5);
		var.setB(5);
		return (var.getA() + var.getB()) / 2;
	}
}
