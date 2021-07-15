package main;

public class Conversions {
	
	public void convertFeetToMiles(double amount) {
		double conversion = amount/5280;
		System.out.println("\n" + amount + " feet is equal to " + conversion + " miles.");
		return;
	}
	
	public void convertYardsToMiles(double amount) {
		double conversion = amount/1760;
		System.out.println("\n" + amount + " yards is equal to " + conversion + " miles.");
		return;
	}
	
	public void convertKilometersToMiles(double amount) {
		double conversion = amount/1.6;
		System.out.println("\n" + amount + " kilometers is equal to " + conversion + " miles.");
		return;
	}
	
	public void convertQuartsToGallons(double amount) {
		double conversion = amount/4;
		System.out.println("\n" + amount + " quarts is equal to " + conversion + " Gallons.");
		return;
	}
	
	public void convertPintsToGallons(double amount) {
		double conversion = amount/8;
		System.out.println("\n" + amount + " pints is equal to " + conversion + " Gallons.");
		return;
	}
	
	public void convertCupsToGallons(double amount) {
		double conversion = amount/16;
		System.out.println("\n" + amount + " cups is equal to " + conversion + " Gallons.");
		return;
	}
	
	public void convertFluidOuncesToGallons(double amount) {
		double conversion = amount/128;
		System.out.println("\n" + amount + " fluid ounces is equal to " + conversion + " Gallons.");
		return;
	}
	
	public void convertLitersToGallons(double amount) {
		double conversion = amount/3.785;
		System.out.println("\n" + amount + " liters is equal to " + conversion + " Gallons.");
		return;
	}
}
