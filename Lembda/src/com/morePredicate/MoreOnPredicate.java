package com.morePredicate;

import java.util.function.IntPredicate;

public class MoreOnPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate lessThan18 = i -> i < 18;
		IntPredicate moreThan10 = i -> i > 10;
//		System.out.println(lessThan18.or(moreThan10).test(15));

		demo(15, lessThan18, moreThan10);

	}

	public static void demo(int x, IntPredicate lessThen18, IntPredicate moreThan10) {
		if (lessThen18.and(moreThan10).test(x)) {
			System.out.println("The input is lessthen and more than 10.");
		} else {
			System.out.println("Invalid Entry");
		}
	}

}
