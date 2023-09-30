import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.io.*;

public class ex4{
	
	public static void main(String[] args)throws IOException{
		
		double length, width, height, volume = 0;
		
		//using BufferedReader class
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		//OR-> BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Length : ");
		length = Integer.parseInt(reader.readLine());
		
		System.out.print("Width : ");
		width = Integer.parseInt(reader.readLine());
		
		System.out.print("Height : ");
		height = Integer.parseInt(reader.readLine());		
		
		volume = length * width * height;
		
		System.out.println();
		
		System.out.println("Volume = " + volume);
		
	}
	
}