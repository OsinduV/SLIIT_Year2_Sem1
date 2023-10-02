package ImplementsRunnableInterface;

public class ThreadImpl implements Runnable{
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadImpl());
		
		t1.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
		
			
		}
		
		
	}
	
	public void run() {
		
		System.out.println("Hello, this is new process");
		
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
			
		}
	}
	
}
