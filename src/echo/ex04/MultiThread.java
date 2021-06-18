package echo.ex04;

public class MultiThread {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(new DigitRunnableImpl());
		thread.start();
		
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}
		
	}

}
