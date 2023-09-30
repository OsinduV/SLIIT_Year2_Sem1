package checkedExeptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test1 {

	public static void main(String[] args)throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		
		System.out.print("Enter Your Name : ");
		String name = reader.readLine();//readLine() Throws: IOException - If an I/O error occurs
		
		System.out.println();
		System.out.println("Hello, " + name);

	}

}
