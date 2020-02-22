package MultiThreading;

public class Thread1 implements Runnable {
	public void run() {
		for(int i=0;i<5;i++) {
		try {
			System.out.println(java.time.LocalDateTime.now()); 
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}
	}
	public static void main(String[] args) {
		Thread1 x=new Thread1();
		Thread t=new Thread(x);
		t.start();
	}

}
