package CreditLimit;

public class CreditLimit {
	private int accountNumber;
	private int beginningBalance;
	private int totalCharges;
	private int totalCredit;
	private int creditLimit;
	
	public CreditLimit() {
		
	}
	
	
	
	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public int getBeginningBalance() {
		return beginningBalance;
	}



	public void setBeginningBalance(int beginningBalance) {
		this.beginningBalance = beginningBalance;
	}



	public int getTotalCharges() {
		return totalCharges;
	}



	public void setTotalCharges(int totalCharges) {
		this.totalCharges = totalCharges;
	}

	public int getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(int totalCredit) {
		this.totalCredit = totalCredit;
	}


	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}

	public int newBalance() {
		int newBalance =  (getBeginningBalance() + getTotalCharges() - getTotalCredit());
	
		if(newBalance < creditLimit) {
				System.out.println("Credit Limit Exceeded");
				}
	return newBalance;
	
		}
		
	
}

