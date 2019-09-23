package CreditLimit;
import java.util.Scanner;
public class CreditLimitTest {

	public static void main(String[] args) {
		CreditLimit walmart = new CreditLimit();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
			int accountNumber = input.nextInt();
				walmart.setAccountNumber(accountNumber);
				walmart.getAccountNumber();
		
		System.out.print("Enter Beginning Balance: ");
			int beginningBalance = input.nextInt();
				walmart.setBeginningBalance(beginningBalance);
				walmart.getBeginningBalance();
				
		System.out.print("Enter Total Charges: ");
			int totalCharges = input.nextInt();
				walmart.setTotalCharges(totalCharges);
				walmart.getTotalCharges();
				
				
		System.out.print("Enter Total Credit: ");	
		int totalCredit = input.nextInt();
			walmart.setTotalCredit(totalCredit);
			walmart.getTotalCredit();
			
		System.out.print("Enter Credit Limit: ");	
			int creditLimit = input.nextInt();
				walmart.setCreditLimit(creditLimit);
				walmart.getCreditLimit();
				
				System.out.printf("New Balance: %d", walmart.newBalance());
				
				input.close();	
	}

}
