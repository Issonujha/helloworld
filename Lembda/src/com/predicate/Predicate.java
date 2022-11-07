package com.predicate;

import java.util.function.IntPredicate;

public class Predicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IntPredicate lessThan18 = new IntPredicate() {
//
//			@Override
//			public boolean test(int value) {
//				if (value < 18) {
//					return true;
//				}
//				return false;
//			}
//		};
//
//		System.out.println(lessThan18.test(17));

		IntPredicate lessThan18 = i -> i < 18;
		IntPredicate moreThan10 = i -> i > 10;
		System.out.println(lessThan18.or(moreThan10).test(15));
	}

}
