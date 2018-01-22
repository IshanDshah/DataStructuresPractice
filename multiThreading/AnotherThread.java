package multiThreading;

import static multiThreading.ThreadColor.*;

public class AnotherThread extends Thread {

	@Override
	public void run() {
		System.out.println(ANSI_BLUE + "HTos is schild thread");

	}

}
