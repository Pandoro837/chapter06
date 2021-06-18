package echo.ex02;

public class DigitThread extends Thread {

	@Override
	public void run() {
		//독립적으로 일 할 메소드의 이름은 run으로 고정되어 있다
		//독립 실행할 코드는 반드시 run 메소드에 작성해야 한다
		// 0~9출력
		
		for(int i = 0; i <= 9 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		super.run();
	}
	
	
	
}
