package com.finzly.java.divison;

import com.finzly.java.variable.Variable;

public class Divison {

	public int divison() {
		Variable var = Variable.getInstance();
		var.setA(10);
		var.setB(2);
		return (var.getA() / var.getB());
	}
}
