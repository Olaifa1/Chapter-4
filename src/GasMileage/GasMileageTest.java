package GasMileage;

import java.util.Scanner;


public class GasMileageTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GasMileage taxify = new GasMileage();
		
			
		
		double cummulativeMilesPerGallons = 0.0;
		
		while(taxify.getMiles() != -1 && taxify.getGallons() != -1) {
			System.out.print("Enter Miles Driven or -1 to terminate: ");
			int miles = input.nextInt();
			taxify.setMiles(miles);
		
		
		if(taxify.getMiles() != -1 && taxify.getGallons() != -1) {
			System.out.print("Enter Gallons Used or -1 to terminate: ");
		int gallons = input.nextInt();
		taxify.setGallons(gallons);
		
		double mG = taxify.mileagePerGallons();
		System.out.printf("The miles per Gallons is %f%n", mG);
		cummulativeMilesPerGallons = cummulativeMilesPerGallons + mG;
		}
	}
	
	System.out.printf("The Cummulative Miles per Gallons is %f%n", cummulativeMilesPerGallons);
	
	input.close();
	}

}
