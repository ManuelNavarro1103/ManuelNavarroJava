package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Conversions conversion = new Conversions();

		int menuSelection = 0;
		int conversionSelection = 0;
		double conversionAmt = 0;
		System.out.println("**************************************************");
		System.out.println("Welcome to the Mile/Gallon Conversion Application");
		System.out.println("**************************************************");
		
		while (menuSelection != 3) {
			System.out.println("\n****************************");
			System.out.println("What would you like to do?");
			System.out.println("****************************");
			System.out.println("\n-- Enter 1 to Convert to Miles");
			System.out.println("-- Enter 2 to Convert to Gallons");
			System.out.println("-- Enter 3 to Exit");
			
			Scanner menuSelect = new Scanner(System.in);
			menuSelection = menuSelect.nextInt();
			
			//input validation
			while (menuSelection <1 || menuSelection > 3) {
				System.out.println("Value entered was not correct please try again.");
				Scanner menuSelect1 = new Scanner(System.in);
				menuSelection = menuSelect.nextInt();
			}
			
			
			if (menuSelection == 1) {
				System.out.println("\n***************************");
				System.out.println("Please select a conversion");
				System.out.println("***************************");
				System.out.println("\n-- Enter 1 for Feet to Miles");
				System.out.println("-- Enter 2 for Yards to Miles");
				System.out.println("-- Enter 3 for Kilometers to Miles");
				
				Scanner milesSelect = new Scanner(System.in);
				conversionSelection = milesSelect.nextInt();
				
				//input validation
				while (conversionSelection < 0 || conversionSelection > 3) {
					System.out.println("Value entered was not correct please try again.");
					Scanner milesSelect1 = new Scanner(System.in);
					conversionSelection = milesSelect1.nextInt();
				}
				
				switch (conversionSelection) {
				case 1:
					System.out.println("How many Feet would you like to convert to miles?");
					Scanner conversionAmtSelect = new Scanner(System.in);
					conversionAmt = conversionAmtSelect.nextDouble();
					conversion.convertFeetToMiles(conversionAmt);
					break;
				case 2:
					System.out.println("How many Yards would you like to convert to miles?");
					Scanner conversionAmtSelect1 = new Scanner(System.in);
					conversionAmt = conversionAmtSelect1.nextDouble();
					conversion.convertYardsToMiles(conversionAmt);
					break;
				case 3:
					System.out.println("How many Kilometers would you like to convert to miles?");
					Scanner conversionAmtSelect2 = new Scanner(System.in);
					conversionAmt = conversionAmtSelect2.nextDouble();
					conversion.convertKilometersToMiles(conversionAmt);
				}
			}
			else if (menuSelection == 2) {
				System.out.println("\n***************************");
				System.out.println("Please select a conversion");
				System.out.println("***************************");
				System.out.println("\n-- Enter 1 for Quarts to Gallons");
				System.out.println("-- Enter 2 for Pints to Gallons");
				System.out.println("-- Enter 3 for Cups to Gallons");
				System.out.println("-- Enter 4 for Fluid Ounces to Gallons");
				System.out.println("-- Enter 5 for Liters to Gallons");
				
				Scanner gallonsSelect = new Scanner(System.in);
				conversionSelection = gallonsSelect.nextInt();
				
				//input validation
				while (conversionSelection < 0 || conversionSelection > 5) {
					System.out.println("Value entered was not correct please try again.");
					Scanner gallonsSelect1 = new Scanner(System.in);
					conversionSelection = gallonsSelect1.nextInt();
				}
				
				switch (conversionSelection) {
				case 1:
					System.out.println("How many Quarts would you like to convert to Gallons?");
					Scanner conversionAmtSelect = new Scanner(System.in);
					conversionAmt = conversionAmtSelect.nextDouble();
					conversion.convertQuartsToGallons(conversionAmt);
					break;
				case 2:
					System.out.println("How many Pints would you like to convert to Gallons?");
					Scanner conversionAmtSelect1 = new Scanner(System.in);
					conversionAmt = conversionAmtSelect1.nextDouble();
					conversion.convertPintsToGallons(conversionAmt);
					break;
				case 3:
					System.out.println("How many Cups would you like to convert to Gallons?");
					Scanner conversionAmtSelect2 = new Scanner(System.in);
					conversionAmt = conversionAmtSelect2.nextDouble();
					conversion.convertCupsToGallons(conversionAmt);
					break;
				case 4:
					System.out.println("How many Fluid Ounces would you like to convert to Gallons?");
					Scanner conversionAmtSelect3 = new Scanner(System.in);
					conversionAmt = conversionAmtSelect3.nextDouble();
					conversion.convertFluidOuncesToGallons(conversionAmt);
					break;
				case 5:
					System.out.println("How many Liters would you like to convert to Gallons?");
					Scanner conversionAmtSelect4 = new Scanner(System.in);
					conversionAmt = conversionAmtSelect4.nextDouble();
					conversion.convertLitersToGallons(conversionAmt);
				}
			}
			
		}
		
		System.out.println("\n************************************");
		System.out.println("Thank you for using my application!");
		System.out.println("************************************");

	}

}
