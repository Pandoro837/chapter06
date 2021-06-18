package echo.ex05;

public class DigitImpl implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<= 9; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
