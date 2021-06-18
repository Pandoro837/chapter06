package echo.ex03;

public class DigitThread extends Thread{

	@Override
	public void run() {
		super.run();
		for(int i = 0; i <= 9; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
