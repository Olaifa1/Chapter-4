package SaleCommission;

public class SalesCommission {
	
	private int nosOfItem1;
	private int nosOfItem2;
	private int nosOfItem3;
	private int nosOfItem4;
	
	
	public SalesCommission() {
		
	}

	public int getNosOfItem1() {
		return nosOfItem1;
	}



	public void setNosOfItem1(int nosOfItem1) {
		this.nosOfItem1 = nosOfItem1;
	}



	public int getNosOfItem2() {
		return nosOfItem2;
	}



	public void setNosOfItem2(int nosOfItem2) {
		this.nosOfItem2 = nosOfItem2;
	}



	public int getNosOfItem3() {
		return nosOfItem3;
	}



	public void setNosOfItem3(int nosOfItem3) {
		this.nosOfItem3 = nosOfItem3;
	}



	public int getNosOfItem4() {
		return nosOfItem4;
	}



	public void setNosOfItem4(int nosOfItem4) {
		this.nosOfItem4 = nosOfItem4;
	}



	public double grossWage1() {
		double grossWage1 = (0.09 *  getNosOfItem1() * 239.99);
		return grossWage1;
		}
	

	public double grossWage2() {
		double grossWage2 = (0.09 *  getNosOfItem2() * 129.75);
		return grossWage2;
	}
	
	public double grossWage3() {
		double grossWage3 = (0.09 *  getNosOfItem3() * 99.95);
		return grossWage3;
	}
	
	public double grossWage4() {
		double grossWage4 = (0.09 *  getNosOfItem4() * 350.89);
		return grossWage4;
	}
	public double cummulativeGrossWage() {
	 double cummulativeGrossWage = 200 + grossWage1() + grossWage2()+ grossWage3() + grossWage4(); 
	return cummulativeGrossWage;
	}
	
}
