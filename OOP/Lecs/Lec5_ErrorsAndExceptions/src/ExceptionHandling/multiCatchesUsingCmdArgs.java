class multiCatchesUsingCmdArgs{
	
	public static void main(String[] args){
		
		try{
			int a = args.length;
			System.out.println("a : " + a);
			int b = 42 / a;
			int c[] = {1};
			c[3] = 99;

		}
		catch(ArithmeticException e){
			System.out.println("Divided by 0 : " + e);

		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index Out Of Bounds : " + e);

		}

		System.out.println("After try/catch block.");

	}

}
