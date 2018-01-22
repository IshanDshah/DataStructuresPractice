package multiThreading;

import static multiThreading.ThreadColor.ANSI_PURPLE;
import static multiThreading.ThreadColor.ANSI_GREEN;

public class Test {
	public static void main(String[] args) {

		System.out.println(ANSI_PURPLE + "Hello from the main thread");

		Thread anotherThread = new AnotherThread();
		anotherThread.start();
	// Create an anonymous class
		new Thread() {

			public void run() {

				System.out.println(ANSI_GREEN + "Hello from the other side");
			}

		}.start();

		Thread myobj = new Thread(new MyRunnable());
		myobj.start();
		System.out.println("kem cho?");
	}

}
