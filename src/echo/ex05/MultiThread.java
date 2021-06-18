package echo.ex05;

public class MultiThread {

	public static void main(String[] args) {

		//Runnable을 구현한 클래스만 들어올 수 있다
		//Runnable인터페이스를 통한 멀티 스레드는 
		//해당 클래스가 이미 상속관계에 있을 때 사용 할 수 있다
		Thread thread1 = new Thread(new DigitImpl());
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
