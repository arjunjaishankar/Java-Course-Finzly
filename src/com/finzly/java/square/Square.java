package com.finzly.java.square;

import com.finzly.java.variable.Variable;

public class Square {

	public int square() {
		Variable var = Variable.getInstance();
		var.setA(3);
		return (var.getA() * var.getA());
	}
}
