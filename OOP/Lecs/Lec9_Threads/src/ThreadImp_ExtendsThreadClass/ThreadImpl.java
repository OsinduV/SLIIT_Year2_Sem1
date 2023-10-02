package ThreadImp_ExtendsThreadClass;

public class ThreadImpl extends Thread {
	
	public static void main(String[] args) {
		
		ThreadImpl T1 = new ThreadImpl();
		
		T1.start();
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	//job of new thread
	public void run() {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

/* 
  ---------- some Static methods in Thread class ----------
 * Thread.sleep(1000); (Parameters:duration in ms, Throws:InterruptedException) 
 * Thread.currentThread(); (Returns the Thread object for the current thread.Returns:the current thread)
  
  ---------- some normal methods in Thread class ----------
 * start(); 
 	Schedules this thread to begin execution. 
	A thread can be started at most once. In particular, a thread can not be restarted after it has terminated.
	Throws : IllegalThreadStateException - if the thread was already started
 
 * getName(); (Returns this thread's name(String))
 * getId(); (Returns the thread ID(positive long number))
 */
