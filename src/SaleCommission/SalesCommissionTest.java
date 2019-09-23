package SaleCommission;

import java.util.Scanner;
public class SalesCommissionTest {

	public static void main(String[] args) {
		SalesCommission salesperson = new SalesCommission();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Numbers Of Item 1 sold: ");
		int nosOfItem1 = input.nextInt();
		salesperson.setNosOfItem1(nosOfItem1);
		salesperson.getNosOfItem1();
		salesperson.grossWage1();
		
		
		System.out.print("Enter the Numbers Of Item 2 sold: ");
		int nosOfItem2 = input.nextInt();
		salesperson.setNosOfItem2(nosOfItem2);
		salesperson.getNosOfItem2();
		salesperson.grossWage2();
		
		System.out.print("Enter the Numbers Of Item 3 sold: ");
		int nosOfItem3 = input.nextInt();
		salesperson.setNosOfItem3(nosOfItem3);
		salesperson.getNosOfItem3();
		salesperson.grossWage3();
		
		System.out.print("Enter the Numbers Of Item 4 sold: ");
		int nosOfItem4 = input.nextInt();
		salesperson.setNosOfItem4(nosOfItem4);
		salesperson.getNosOfItem4();
		salesperson.grossWage4();
		
		
		System.out.printf("The Total Wage is $%.4f", salesperson.cummulativeGrossWage());
		
input.close();
	}
	
}
