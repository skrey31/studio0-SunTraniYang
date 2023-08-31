package studio0;

import java.text.DecimalFormat;

public class MileageReport {
	
	public static void main(String[] args) {
		int car1miles = 250;
		int car2miles = 100;
		int car3miles = 900;
		
		int totalMiles = car1miles + car2miles + car3miles;
		double milesPerGallon = 24.5;
		//double totalGallons = totalMiles * milesPerGallon; 
		//Updated code below
		double totalGallons = totalMiles / milesPerGallon;
		double pricePerGallon = 3.05;
		double totalPrice = totalGallons * pricePerGallon;
		
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		
		System.out.println("Total price spent on gas was $" + df.format(totalPrice));
	}
}
