package ThreadSynchronization;

class Sample{
	
	synchronized void display() {
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
		}
		
	}
	
}

public class ThreadImpl implements Runnable{
	
	Sample sample;
	
	public ThreadImpl(Sample sample) {
		this.sample = sample;
		
	}
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		
		Thread t1 = new Thread(new ThreadImpl(sample));
		
		t1.start();
		
		sample.display();
	
		
		
	}
	
	public void run() {
		
		sample.display();
		
		
	}
	
}
