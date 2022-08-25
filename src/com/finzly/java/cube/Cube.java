package com.finzly.java.cube;

import com.finzly.java.variable.Variable;

public class Cube {

	public int cube() {
		Variable var = Variable.getInstance();
		var.setA(3);
		return (var.getA() * var.getA() * var.getA());
	}
}
