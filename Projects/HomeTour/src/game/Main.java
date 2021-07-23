package game;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();
		Player player = new Player(rm.startingRoom);
		System.out.println("*********************************");
		System.out.println("Welcome to my Home Tour Project!");
		System.out.println("*********************************");
		System.out.println("\n-- Enter 1 to Start");
		System.out.println("-- Enter 2 to Quit");
		Scanner enter = new Scanner(System.in);
		int enterInt = enter.nextInt();
		
		while (enterInt < 1 || enterInt > 3) {
			System.out.println("Incorrect value entered. Please try again.");
			enter = new Scanner(System.in);
			enterInt = enter.nextInt();
		}
		
		if (enterInt == 1) {
			System.out.println("If at anytime you need help with commands type 'help'.");
			boolean keepPlaying = true;
			while (keepPlaying == true) {
				printRoom(player);
				String[] command = collectInput();
				String playString = parse(command, player);
				if (playString.contains("quit")) {
					keepPlaying = false;
				}
			}
			
		}
		else{}
		enter.close();
	}
	
	private static void printRoom(Player player) {
		System.out.println("\n*************");
		System.out.println("Current Room");
		System.out.println("*************");
		System.out.println("\n"+player.getCurrentRoom().getName());
		System.out.println("\n"+player.getCurrentRoom().getLongDescription());
		System.out.println("\nExits:");
		player.getCurrentRoom().getExits(player);
		player.getCurrentRoom().getInteracts(player);
	}
	
	private static String[] collectInput() {
		Scanner input = new Scanner(System.in);
		String command[] = input.nextLine().toLowerCase().split(" ");
		return command;
	}
	
	private static String parse(String[] command, Player player) {
		String[] input = command;
		//boolean correctInput = false;
		
		switch(input[0]) {
		case "go":
			if (input.length > 1) {
				switch(input[1]) {
				case "north":
					if (player.getCurrentRoom().exits[0] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[0]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				case "south":
					if (player.getCurrentRoom().exits[1] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[1]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				case "west":
					if (player.getCurrentRoom().exits[2] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[2]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				case "east":
					if (player.getCurrentRoom().exits[3] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[3]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				default:
					System.out.println("Invalid direction entered. Please try again.");
					break;
				}
			}
			else {
				System.out.println("No direction was given.");
			}
			break;
		case "move":
			if (input.length > 1) {
				switch(input[1]) {
				case "north":
					if (player.getCurrentRoom().exits[0] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[0]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				case "south":
					if (player.getCurrentRoom().exits[1] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[1]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				case "west":
					if (player.getCurrentRoom().exits[2] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[2]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				case "east":
					if (player.getCurrentRoom().exits[3] != null) {
						player.setCurrentRoom(player.getCurrentRoom().exits[3]);
						//correctInput = true;
					}
					else {
						System.out.println("There is nowhere to go.");
					}
					break;
				default:
					System.out.println("Invalid direction entered. Please try again.");
					break;
				}
			}
			else {
				System.out.println("No direction was given.");
			}
			break;
		case "interact":
			if (input.length > 1) {
				switch(input[1]) {
				case "portrait1":
					if (player.getCurrentRoom().interacts[0].getName() == "portrait1") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "portrait2":
					if (player.getCurrentRoom().interacts[1].getName() == "portrait2") {
						System.out.println(player.getCurrentRoom().interacts[1].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "portrait3":
					if (player.getCurrentRoom().interacts[2].getName() == "portrait3") {
						System.out.println(player.getCurrentRoom().interacts[2].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "remote":
					if (player.getCurrentRoom().interacts[0].getName() == "Remote") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "bed":
					if (player.getCurrentRoom().interacts[0].getName() == "Bed") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "oven":
					if (player.getCurrentRoom().interacts[0].getName() == "Oven") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "mirror":
					if (player.getCurrentRoom().interacts[0].getName() == "Mirror") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "box":
					if (player.getCurrentRoom().interacts[0].getName() == "Box") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "bike":
					if (player.getCurrentRoom().interacts[1].getName() == "Bike") {
						System.out.println(player.getCurrentRoom().interacts[1].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				case "table":
					if (player.getCurrentRoom().interacts[0].getName() == "Table") {
						System.out.println(player.getCurrentRoom().interacts[0].getLongDescription());
					}
					else {
						System.out.println("Interact does not exist.");
					}
					break;
				default:
					System.out.println("Invalid interactable entered. Please try again.");
					break;
				}
			}
			else {
				System.out.println("No interactable was given.");
			}
			break;
		case "help":
			System.out.println("Type 'go' or 'move' to move the player then the direction 'north, south, west, east'.");
			System.out.println("Type 'interact' then the name of any interactables if any.");
			System.out.println("Type 'quit' to quit the program.");
			break;
		case "quit":
			System.out.println("Thank you for playing!");
			break;
		default:
			System.out.println("Invalid command entered. Please try again.");
			break;
		}
		return input[0];
		
	}

}
