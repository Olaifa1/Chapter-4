package SalaryCalculator;

import java.util.Scanner;

public class SalaryCalculator {
		public double cummulativeGrossPay() {
		int counter = 0;
		double hourlyRate = 0.0;
		double hoursSpentWorking = 0.0;
		double grossPay = 0.0;
		double grossPay1 =0.0;
		double grossPay2 = 0.0;
		double cummulativeGrossPay = 0.0;
		int employee = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of Employees: ");
		counter = input.nextInt();
		while(counter > 0) {
			System.out.print("Enter Hourly Rate(Dollars per hour): ");
			hourlyRate = input.nextDouble();
			System.out.print("Enter Hours Spent Working: ");
			hoursSpentWorking = input.nextDouble();
			if(hoursSpentWorking < 40) {
				grossPay = 0.0;
				System.out.println("Employee's Gross pay is undefined.");
			}
			if(hoursSpentWorking == 40) {
				grossPay1 = (hourlyRate * hoursSpentWorking);
				System.out.printf("Employee's Gross pay : %f Dollars%n", grossPay1);
			}
			if(hoursSpentWorking > 40) {
				grossPay2 =  (1.5 * hourlyRate * hoursSpentWorking);
				System.out.printf("Employee's Gross pay : %f Dollars%n", grossPay2);
			}
				
//			counter decreasing.  
			counter--;
//			employee increasing.
			employee++;
			
			cummulativeGrossPay = cummulativeGrossPay + grossPay + grossPay1 + grossPay2;
				
		}
		return cummulativeGrossPay;
		
	}
}
