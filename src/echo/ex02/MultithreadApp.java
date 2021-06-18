package echo.ex02;

public class MultithreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread();
		thread.start();	//start()는, 해당 쓰레드 내부의 run()을 실행하도록 시킨다
						//start()는 해당 메소드를 실행 시키고, 바로 다음으로 넘어간다
		for(char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

		
	}

}
