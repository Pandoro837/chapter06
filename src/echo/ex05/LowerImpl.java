package echo.ex05;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for(char ch = 'a'; ch <= 'z'; ch++) {
			try {
				Thread.sleep(1000);
				System.out.println(ch);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
