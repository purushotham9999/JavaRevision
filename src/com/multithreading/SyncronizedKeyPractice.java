package com.multithreading;

class Counter {

	int counter;

	public synchronized void increment() {
		counter++;
	}
}

public class SyncronizedKeyPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter c = new Counter();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.increment();
			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println(c.counter);
	}

}
