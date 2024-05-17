package j2day9;

// 1. 쓰레드를 상속 받은 클래스를 만들어 사용하는 방법
class MyThread extends Thread {
	// Thread 클래스의 반드시 run() 오버라이딩한다.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("MyThread A - " + i);
		}
	}
	
	
}

// 2. Runnable 인터페이스를 구현해서 쓰레드를 사용하는 방법
// 상속받을게 있을 때는 2번을 사용한다.
class RunnableThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("RunnableThread - " + i);
		}		
	}
	
}

public class ThreadExam {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		
		// 두번째 방법에서는 쓰레드를 클래스에 Runnable 클래스를 매개변수를 넣어야 한다.
		RunnableThread runable = new RunnableThread();
		Thread t2 = new Thread(runable);
		
		// t1.run();  이렇게는 안된다.
		System.out.println("메인 쓰레드 시작");
		t1.start();
		t2.start();
		System.out.println("메인 쓰레드 종료");
	}
}
