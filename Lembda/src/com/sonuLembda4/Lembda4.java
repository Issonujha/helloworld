package com.sonuLembda4;

interface Lembda {
	abstract public void demo(int x, float d);

}

public class Lembda4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = 10;
		Lembda lembda = (int x, float y) -> System.out.println("Value of x: " + x + " and value of y is : " + y);
		lembda.demo(5, 5.401f);

	}
}
