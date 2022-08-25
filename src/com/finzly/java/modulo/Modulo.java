package com.finzly.java.modulo;

import com.finzly.java.variable.Variable;

public class Modulo {

	public int modulo() {
		Variable var = Variable.getInstance();
		var.setA(10);
		var.setB(2);
		return (var.getA() % var.getB());
	}
}
