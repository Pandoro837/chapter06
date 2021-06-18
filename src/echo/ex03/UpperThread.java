package echo.ex03;

public class UpperThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(char A = 'A'; A <= 'Z'; A++) {
			try {
				Thread.sleep(1000);
				System.out.println(A);	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
