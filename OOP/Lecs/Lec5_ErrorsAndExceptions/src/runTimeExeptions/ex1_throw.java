package runTimeExeptions;

public class ex1_throw {

	public static void main(String[] args)throws NumberFormatException {
		
		//NumberFormatException
		
		String num = "a";
		int val = 0;
		
		//throw out the exception

			val = Integer.parseInt(num);

		
		System.out.println(val);

	}

}
