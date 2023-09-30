import java.util.Scanner;

public class ex3{
	
	public static void main(String[] args){
		
		double length, width, height, volume = 0;
		Scanner myInputs = new Scanner(System.in); //create object of the Scanner class
		
		System.out.print("Length : ");
		length = myInputs.nextDouble();
		System.out.print("Width : ");
		width = myInputs.nextDouble();
		System.out.print("Height : ");
		height = myInputs.nextDouble();		
		
		volume = length * width * height;
		
		System.out.println();
		
		System.out.println("Volume = " + volume);
		
	}
	
}