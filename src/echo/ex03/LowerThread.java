package echo.ex03;

public class LowerThread extends Thread{

	@Override
	public void run() {
		super.run();
		for(char a = 'a'; a <= 'z'; a++) {
			try {
				Thread.sleep(1000);
				System.out.println(a);	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
