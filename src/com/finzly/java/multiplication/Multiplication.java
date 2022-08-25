package com.finzly.java.multiplication;

import com.finzly.java.variable.Variable;

public class Multiplication {

	public int multiplication() {
		Variable var = Variable.getInstance();
		var.setA(3);
		var.setB(4);
		return (var.getA() * var.getB());
	}
}
