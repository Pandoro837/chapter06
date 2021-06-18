package echo.ex03;

public class MultiThread {

	public static void main(String[] args) {
		
		//기존의 메인은 시간순으로 실행 됐으나, 스레드를 사용하면
		//각자 독립적으로 실행할 수 있다
		Thread thread1 = new DigitThread();
		Thread thread2 = new LowerThread();
		Thread thread3 = new UpperThread();

		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
