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
			String tempMenuSelect = menuSelect.nextLine();
			menuSelection = Integer.parseInt(tempMenuSelect);
			
			//input validation
			while (menuSelection <1 || menuSelection > 3) {
				System.out.println("Value entered was not correct please try again.");
				Scanner menuSelect1 = new Scanner(System.in);
				String tempMenuSelect1 = menuSelect1.nextLine();
				menuSelection = Integer.parseInt(tempMenuSelect1);
			}
			
			
			if (menuSelection == 1) {
				System.out.println("\n***************************");
				System.out.println("Please select a conversion");
				System.out.println("***************************");
				System.out.println("\n-- Enter 1 for Feet to Miles");
				System.out.println("-- Enter 2 for Yards to Miles");
				System.out.println("-- Enter 3 for Kilometers to Miles");
				
				Scanner milesSelect = new Scanner(System.in);
				String tempMilesSelect = milesSelect.nextLine();
				conversionSelection = Integer.parseInt(tempMilesSelect);
				
				//input validation
				while (conversionSelection < 0 || conversionSelection > 3) {
					System.out.println("Value entered was not correct please try again.");
					Scanner milesSelect1 = new Scanner(System.in);
					String tempMilesSelect1 = milesSelect1.nextLine();
					conversionSelection = Integer.parseInt(tempMilesSelect1);
				}
				
				switch (conversionSelection) {
				case 1:
					System.out.println("How many Feet would you like to convert to miles?");
					Scanner conversionAmtSelect = new Scanner(System.in);
					String tempConversionAmt = conversionAmtSelect.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt);
					conversion.convertFeetToMiles(conversionAmt);
					break;
				case 2:
					System.out.println("How many Yards would you like to convert to miles?");
					Scanner conversionAmtSelect1 = new Scanner(System.in);
					String tempConversionAmt1 = conversionAmtSelect1.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt1);
					conversion.convertYardsToMiles(conversionAmt);
					break;
				case 3:
					System.out.println("How many Kilometers would you like to convert to miles?");
					Scanner conversionAmtSelect11 = new Scanner(System.in);
					String tempConversionAmt11 = conversionAmtSelect11.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt11);
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
				String tempGallonsSelect = gallonsSelect.nextLine();
				conversionSelection = Integer.parseInt(tempGallonsSelect);
				
				//input validation
				while (conversionSelection < 0 || conversionSelection > 5) {
					System.out.println("Value entered was not correct please try again.");
					Scanner gallonsSelect1 = new Scanner(System.in);
					String tempGallonsSelect1 = gallonsSelect1.nextLine();
					conversionSelection = Integer.parseInt(tempGallonsSelect1);
				}
				
				switch (conversionSelection) {
				case 1:
					System.out.println("How many Quarts would you like to convert to Gallons?");
					Scanner conversionAmtSelect = new Scanner(System.in);
					String tempConversionAmt = conversionAmtSelect.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt);
					conversion.convertQuartsToGallons(conversionAmt);
					break;
				case 2:
					System.out.println("How many Pints would you like to convert to Gallons?");
					Scanner conversionAmtSelect1 = new Scanner(System.in);
					String tempConversionAmt1 = conversionAmtSelect1.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt1);
					conversion.convertPintsToGallons(conversionAmt);
					break;
				case 3:
					System.out.println("How many Cups would you like to convert to Gallons?");
					Scanner conversionAmtSelect11 = new Scanner(System.in);
					String tempConversionAmt11 = conversionAmtSelect11.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt11);
					conversion.convertCupsToGallons(conversionAmt);
					break;
				case 4:
					System.out.println("How many Fluid Ounces would you like to convert to Gallons?");
					Scanner conversionAmtSelect111 = new Scanner(System.in);
					String tempConversionAmt111 = conversionAmtSelect111.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt111);
					conversion.convertFluidOuncesToGallons(conversionAmt);
					break;
				case 5:
					System.out.println("How many Liters would you like to convert to Gallons?");
					Scanner conversionAmtSelect1111 = new Scanner(System.in);
					String tempConversionAmt1111 = conversionAmtSelect1111.nextLine();
					conversionAmt = Double.parseDouble(tempConversionAmt1111);
					conversion.convertLitersToGallons(conversionAmt);
				}
			}
			
		}
		
		System.out.println("\n************************************");
		System.out.println("Thank you for using my application!");
		System.out.println("************************************");

	}

}
