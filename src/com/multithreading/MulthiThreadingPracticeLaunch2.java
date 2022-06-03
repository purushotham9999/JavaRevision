package com.multithreading;

public class MulthiThreadingPracticeLaunch2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// join() && is alive()

//		ByRunnable Approach
		System.out.println("Main thread started its execution and allocated resources");
		System.out.println();
		com.multithreading.ByRunnable.Demo1 d11 = new ByRunnable().new Demo1();
		com.multithreading.ByRunnable.Demo2 d22 = new ByRunnable().new Demo2();
		com.multithreading.ByRunnable.Demo3 d33 = new ByRunnable().new Demo3();

		Thread t1 = new Thread(d11);
		Thread t2 = new Thread(d22);
		Thread t3 = new Thread(d33);

		System.out.println("is T1 alive " + t1.isAlive());
		System.out.println("is T2 alive " + t2.isAlive());
		System.out.println("is T3 alive " + t3.isAlive());
		System.out.println();
		t1.start();
		t2.start();
		t3.start();

		System.out.println("is T1 alive " + t1.isAlive());
		System.out.println("is T2 alive " + t2.isAlive());
		System.out.println("is T3 alive " + t3.isAlive());
		System.out.println();

		t1.join();
		t2.join();
		t3.join();

		System.out.println("is T1 alive " + t1.isAlive());
		System.out.println("is T2 alive " + t2.isAlive());
		System.out.println("is T3 alive " + t3.isAlive());
		System.out.println();

		System.out.println("Main thread completed its execution and de-allocated resources");

	}

}
