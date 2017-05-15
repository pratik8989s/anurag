package tp;

public class Main extends Thread {

	public static void main(String[] args) throws InterruptedException {

		Main t1= new Main();
		Main t2= new Main();
		
		t1.setName("tom");
		t2.setName("jerry");
		t1.start();
		t2.start();
		
		
		
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName());
			//System.out.println(Thread.getAllStackTraces());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			//System.out.println(i+1);
		}
	
	
	}

}
