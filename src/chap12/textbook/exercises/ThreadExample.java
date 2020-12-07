package chap12.textbook.exercises;

public class ThreadExample {// 멀티 스레드: extends Thread | implements Runnable
	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
	}

}
