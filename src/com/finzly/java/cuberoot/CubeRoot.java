package com.finzly.java.cuberoot;

import com.finzly.java.variable.Variable;

public class CubeRoot {

	public int cubeRoot() {
		Variable var = Variable.getInstance();
		var.setA(27);
		return ((int) Math.sqrt(var.getA()));
	}
}
