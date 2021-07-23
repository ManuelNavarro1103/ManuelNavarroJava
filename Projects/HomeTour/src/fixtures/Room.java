package fixtures;

import game.Player;

public class Room extends Fixture {
	
	
	public Room[] exits;
	public Interactables[] interacts;


	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
		this.interacts = new Interactables[4];
	}
	
	public void getExits(Player player) {
		if(player.getCurrentRoom().exits[0] != null) {
			System.out.println("north: "+ player.getCurrentRoom().exits[0].getShortDescription());
		}
		if(player.getCurrentRoom().exits[1] != null) {
			System.out.println("south: "+ player.getCurrentRoom().exits[1].getShortDescription());
		}
		if(player.getCurrentRoom().exits[2] != null) {
			System.out.println("west: "+ player.getCurrentRoom().exits[2].getShortDescription());
		}
		if(player.getCurrentRoom().exits[3] != null) {
			System.out.println("east: "+ player.getCurrentRoom().exits[3].getShortDescription());
		}
		return;
		
	}
	
	public void getInteracts(Player player) {
		if(player.getCurrentRoom().interacts[0] != null) {
			System.out.println("\nInteractables:");
			System.out.println(player.getCurrentRoom().interacts[0].getName()+": "+player.getCurrentRoom().interacts[0].getShortDescription());
		}
		if(player.getCurrentRoom().interacts[1] != null) {
			System.out.println(player.getCurrentRoom().interacts[1].getName()+": "+player.getCurrentRoom().interacts[1].getShortDescription());
		}
		if(player.getCurrentRoom().interacts[2] != null) {
			System.out.println(player.getCurrentRoom().interacts[2].getName()+": "+player.getCurrentRoom().interacts[2].getShortDescription());
		}
		if(player.getCurrentRoom().interacts[3] != null) {
			System.out.println(player.getCurrentRoom().interacts[3].getName()+": "+player.getCurrentRoom().interacts[3].getShortDescription());
		}
	}
//	public Room getExit(String direction) {
//		return null;
//		
//	}

}
