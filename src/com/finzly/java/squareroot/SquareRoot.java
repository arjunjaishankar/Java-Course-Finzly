package com.finzly.java.squareroot;

import com.finzly.java.variable.Variable;

public class SquareRoot {

	public int squareRoot() {
		Variable var = Variable.getInstance();
		var.setA(16);
		return (int) Math.sqrt(var.getA());
	}
}
