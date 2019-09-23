package LargestNumber;

import java.util.Scanner;

public class LargestNumber{
	
	private int largestNumber;
	
	
	public void largestNumber() {
		 int number = 0;
		 int counter = 0;
		 int largest = 0;
		
		 for(counter = 1; counter <= 10; counter++){
			System.out.print("Enter Number: ");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			
			if(number >  largest) 
				largest = number;
		}
		 System.out.printf("The Largest Number is %d%n", largest);
	
		 
	}
}