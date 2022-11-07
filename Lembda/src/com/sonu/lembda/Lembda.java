package com.sonu.lembda;

interface Lembda1 {
	public void demo();
}

public class Lembda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lembda1 lembda = new Lembda1() {

			@Override
			public void demo() {
				// TODO Auto-generated method stub
				System.out.println("Statement 1");
			}
		};
		lembda.demo();

		Lembda1 lembda2 = () -> {
			System.out.println("Statement 2");
		};
		lembda2.demo();
	}

}
