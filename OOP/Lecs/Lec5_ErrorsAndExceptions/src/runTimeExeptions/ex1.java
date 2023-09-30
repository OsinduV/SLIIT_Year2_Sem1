package runTimeExeptions;

public class ex1 {

	public static void main(String[] args) {
		
		//NumberFormatException
		
		String num = "aa";
		
		int val = 0;
		//val = Integer.parseInt(num);
		
		//handling Using try catch block
		try {
			val = Integer.parseInt(num);
			
		}catch(NumberFormatException e) {
			System.out.println("cannot convert letters to integers");
			
		}finally {
			System.out.println("End of the operation");
		}
		
		System.out.println(val);

	}

}
