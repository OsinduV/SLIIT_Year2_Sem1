import java.io.*;

public class Demo{
	
	public static void main(String[] args)throws IOException{
		
		boolean chk;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		EvenOddNumber ob = new EvenOddNumber();
		
		System.out.print("Enter an Integer to chk whether Even or Odd : ");
		int i = Integer.parseInt(reader.readLine());
		
		//chk = ob.findEvenOrOdd(i);
		String result = ob.findEvenOrOdd(i)? "It is an Even Number" : "It is an Odd Number";
 		
		System.out.println(result);
		
		/*
		if(chk == true){
			System.out.println("It is an Even Number");
		}else{
			System.out.println("It is an Odd Number");
		}
		*/
	}
	
}

/*
 ---- ternary operator ---
result = testCondition ? trueValue : falseValue
 “If testCondition is true, assign the value of trueValue to result; otherwise, assign the value of falseValue to result.”
*/