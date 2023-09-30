package runTimeExeptions;

public class Main {
	
	public static void main(String args[]) {
		
		//ArithmeticException
		
		System.out.println("Hello");
		
		int a = 10;
		int b = 5;
		int c = 5;
		int x = 0;
		
		//handling using try catch block
		try {
			x = a / (b-c); //division by zero
		}catch(ArithmeticException e) {
			System.out.println("cannot devided by 0 ");
			
		}
		int y = a / (b+c);
		
		System.out.println("x = " + x) ; 
		System.out.println("y = " + y);
		
		System.out.println("bye");
	}
	
}
