package com.finzly.java.addition;

import com.finzly.java.variable.Variable;

public class Addition {

	public int addition() {
		Variable var = Variable.getInstance();
		var.setA(3);
		var.setB(4);
		return (var.getA() + var.getB());
	}

}
