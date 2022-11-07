package com.sonu.lembda2;

interface Lembda1 {
	public void demo();

	public void demo2(int x);
}

public class Lembda2 {

	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> System.out.println("I am in thread 1"));
		thread1.start();

		new Thread(() -> {
			System.out.println("I am in new multiline lembda thread");
			System.out.println("Thank you for comming.");
		}).start();

	}

}
