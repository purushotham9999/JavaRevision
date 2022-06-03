package com.multithreading;

interface Fun {
	static void fun() {
		try {
			System.out.println("Char printing started");
			for (int i = 65; i < 70; i++) {
				System.out.println((char) i);
				Thread.sleep(3000);
			}

			System.out.println("Char printing completed");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("problem occured");
		}
	}
}

public class MulthiThreadingPracticeLaunch {

	public static void main(String[] args) throws InterruptedException {

//		NonMultiThreadingApproach
//		NonMultiThreadingApproach nonMultiThreadingApproach = new NonMultiThreadingApproach();
//		nonMultiThreadingApproach.banking();
//		nonMultiThreadingApproach.numPrinting();
//		nonMultiThreadingApproach.charPrinting();

//		MultiThreadingApproach
//		Demo1 d1 = new MultiThreadingApproach().new Demo1();
//		Demo2 d2 = new MultiThreadingApproach().new Demo2();
//		Demo3 d3 = new MultiThreadingApproach().new Demo3();
//
//		// (concurrent execution happens 3 threads are created)
//		d1.start();
//		d2.start();
//		d3.start();

		// not right way to call run method directly( sequential execution happens) (no
		// threads are created except main thread)
//		d1.run();
//		d2.run();
//		d3.run();

//		ByRunnable Approach
//		com.multithreading.ByRunnable.Demo1 d11 = new ByRunnable().new Demo1();
//		com.multithreading.ByRunnable.Demo2 d22 = new ByRunnable().new Demo2();
//		com.multithreading.ByRunnable.Demo3 d33 = new ByRunnable().new Demo3();

//		Thread t1 = new Thread(d11);
//		Thread t2 = new Thread(d22);
//		Thread t3 = new Thread(d33);
//
//		t1.start();
//		t2.start();
//		t3.start();

//		Runnable d = () -> {
//			try {
//				System.out.println("Char printing started");
//				for (int i = 65; i < 70; i++) {
//					System.out.println((char) i);
//					Thread.sleep(3000);
//				}
//
//				System.out.println("Char printing completed");
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("problem occured");
//			}
//		};

//		Thread d1 = new Thread(() -> {
//			try {
//				System.out.println("Char printing started");
//				for (int i = 65; i < 70; i++) {
//					System.out.println((char) i);
//					Thread.sleep(3000);
//				}
//
//				System.out.println("Char printing completed");
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("problem occurred");
//			}
//		});

//		Thread d1 = new Thread(Fun::fun);
		Thread d1 = new Thread(Fun::fun, "char thread");
		System.err.println(d1.getName());
		d1.start();
	}
}
