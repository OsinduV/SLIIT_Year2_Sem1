package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		
		MathOp math = new MathOp();
		System.out.println(math.add(2, 0));
		try {
			System.out.println(math.divide(2, 0));
			
		}catch(ArithmeticException e) {
			System.out.println("cannot divide by 0");
			
		}
		
	}
		
}
