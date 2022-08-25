package com.finzly.java.arithmetic;

import com.finzly.java.addition.Addition;
import com.finzly.java.average.Average;
import com.finzly.java.cube.Cube;
import com.finzly.java.cuberoot.CubeRoot;
import com.finzly.java.divison.Divison;
import com.finzly.java.modulo.Modulo;
import com.finzly.java.multiplication.Multiplication;
import com.finzly.java.square.Square;
import com.finzly.java.squareroot.SquareRoot;
import com.finzly.java.subtraction.Subtraction;

public class ArithmeticOperation {

	public static void main(String[] args) {

		System.out.println("Addition : " + new Addition().addition());
		System.out.println("Subtraction : " + new Subtraction().subtraction());
		System.out.println("Multiplication : " + new Multiplication().multiplication());
		System.out.println("Divison : " + new Divison().divison());
		System.out.println("Modulo : " + new Modulo().modulo());
		System.out.println("Cube : " + new Cube().cube());
		System.out.println("Square : " + new Square().square());
		System.out.println("Square Root : " + new SquareRoot().squareRoot());
		System.out.println("Cube Root : " + new CubeRoot().cubeRoot());
		System.out.println("Average : " + new Average().average());
	}
}
