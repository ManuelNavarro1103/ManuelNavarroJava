package game;

import fixtures.Interactables;
import fixtures.Room;

public class RoomManager {
	
	Room[] rooms = new Room[10];
	//Map<String, Room> exits = new HashMap<String, Room>();
	public Room startingRoom;

	public void init() {
		Room entryHallway = new Room(
				"Entry Hallway",
				"short wide hallway",
				"The short wide entryway of a modernized house. A long narrow hallway is open to the west,"+"\n"+"where a number of family portraits reside on the wall. To the east a large living room can"+"\n"+"be seen, where a large tv is on playing re-runs of 'The Office'");
		rooms[0] = entryHallway;
		this.startingRoom = entryHallway;
		
		Room mainHallway = new Room(
				"Main Hallway",
				"long narrow hallway",
				"The long narrow hallway leading to multiple bedrooms and a bathroom with multiple family portraits "+"\n"+"along the wall. A small guest bathroom is open to the north, with your basic essentials of an "+"\n"+"everyday bathroom. To the east is a small bedroom, where it looks like it hasn't been lived in for awhile."+"\n"+"To the west is the master bedroom, where a giant, cozy looking bed entices you. To the south"+"\n"+"is the entry hallway, where you entered the house from.");
		this.rooms[1] = mainHallway;
		
		Room livingRoom = new Room(
				"Living Room",
				"large comfy living room",
				"The large comfy living room was filled with multiple couches and the comfiest looking recliner"+"\n"+"all facing the tv. The dining room/kitchen is open to the west, where the smell of something baking"+"\n"+"in the oven filled your nose from there. To the south is the entry hallway, where you entered"+"\n"+"the house from.");
		this.rooms[2] = livingRoom;
		
		Room bedroom = new Room(
				"Bedroom",
				"a small abandoned bedroom",
				"The small bedroom was filled with boxes of storage and looked as if nobody lived in there."+"\n"+"To the south leads back into the main hallway, leading to various other rooms.");
		this.rooms[3] = bedroom;
		
		Room mainBedroom = new Room(
				"Master Bedroom",
				"a large cozy master bedroom",
				"The large master bedroom had one of the most enticing beds you'd ever seen lit up by a low dim light "+"\n"+"emitting from a candle in the corner of the room. To the west is the master bathroom, where a"+"\n"+"large mirror can be seen. To the south leads back into the main hallway, leading to various other rooms. ");
		this.rooms[4] = mainBedroom;
		
		Room bathroom = new Room(
				"Bathroom",
				"a small confined bathroom",
				"The small bathroom looked like an other bathroom you've seen before with your typical everyday bathroom essentials."+"\n"+"To the south leads back into the main hallway, leading to various other rooms.");
		this.rooms[5] = bathroom;
		
		Room diningRoom = new Room(
				"Dining Room/Kitchen",
				"a combined dining room/kitchen",
				"The dining room/kitchen was filled with the aroma of a cake being baked and there were party decorations set up all around "+"\n"+"the dining area. To the north is the garage, where it looked as if it hadn't been cleaned in years. To the west is"+"\n"+"the backyard, where a nice patio with lights hanging all around it could be seen. The living room is open to the"+"\n"+"south, where the tv is still on with re-runs of The Office.");
		this.rooms[6] = diningRoom;
		
		Room mainBathroom = new Room(
				"Master Bathroom",
				"a long wide bathroom",
				"The master bathroom looked like any other bathroom besides the fact it had a large mirror going across the whole"+"\n"+"bathroom. To the south is the living room, where the bed is still calling you to come lay down.");
		this.rooms[7] = mainBathroom;
		
		Room garage = new Room(
				"Garage",
				"a large cluttered garage",
				"The garage was filled with boxes and bins everywhere. It also had tools, paint cans, kids toys, and a bunch of random"+"\n"+"things all cluttered together. To the south was the dining room/kitchen, where the party had yet to begin.");
		this.rooms[8] = garage;
		
		Room backyard = new Room(
				"Backyard",
				"a medium sized backyard",
				"The backyard was nice with grass that looked very well taken care of. There was a nice patio with lights hung all around"+"\n"+"with a nice handmade table perfect for gatherings. To the south was the dining room/kitchen, where the party had yet to begin. ");
		this.rooms[9] = backyard;
		
		Interactables portrait = new Interactables(
				"portrait1",
				"a baby boy picture",
				"You inspect the picture and see a little baby boy in overalls.");
		
		Interactables portrait1 = new Interactables(
				"portrait2",
				"a baby girl picture",
				"You inspect the picture and see a little baby girl in overalls.");
		
		Interactables portrait2 = new Interactables(
				"portrait3",
				"a group family picture",
				"You inspect the picture and see a mother and two twin babies in overalls smiling for the camera.");
		
		Interactables remote = new Interactables(
				"Remote",
				"a tv remote",
				"You try to turn the tv off but the remote batteries are dead.");
		
		Interactables masterBed = new Interactables(
				"Bed",
				"a large comfy bed",
				"You lay down only for a minute for it is so cozy you don't want to fall asleep.");
		
		Interactables oven = new Interactables(
				"Oven",
				"a working oven",
				"You inspect the oven and see a cake almost ready to be taken out. You can't wait.");
		
		Interactables mirror = new Interactables(
				"Mirror",
				"a large long window",
				"You look at your reflection in the mirror. You like what you see lol.");
		
		Interactables box = new Interactables(
				"Box",
				"A large box",
				"You try to lift the box but it is too heavy for you to lift.");
		
		Interactables bike = new Interactables(
				"Bike",
				"a small bike",
				"You inspect the bike and it looks like it hasn't been used in years.");
		
		Interactables table = new Interactables(
				"Table",
				"a handmade",
				"You inspect the handmade table and the craftsmanship is outstanding! You are impressed.");
		
		entryHallway.exits[2] = mainHallway;
		entryHallway.exits[3] = livingRoom;
		mainHallway.exits[0] = bathroom;
		mainHallway.exits[1] = entryHallway;
		mainHallway.exits[2] = mainBedroom;
		mainHallway.exits[3] = bedroom;
		mainHallway.interacts[0] = portrait;
		mainHallway.interacts[1] = portrait1;
		mainHallway.interacts[2] = portrait2;
		livingRoom.exits[1] = entryHallway;
		livingRoom.exits[2] = diningRoom;
		livingRoom.interacts[0] = remote;
		bedroom.exits[1] = mainHallway;
		mainBedroom.exits[1] = mainHallway;
		mainBedroom.exits[2] = mainBathroom;
		mainBedroom.interacts[0] = masterBed;
		bathroom.exits[1] = mainHallway;
		diningRoom.exits[0] = garage;
		diningRoom.exits[1] = livingRoom;
		diningRoom.exits[2] = backyard;
		diningRoom.interacts[0] = oven;
		mainBathroom.exits[1] = mainBedroom;
		mainBathroom.interacts[0] = mirror;
		garage.exits[1] = diningRoom;
		garage.interacts[0] = box;
		garage.interacts[1] = bike;
		backyard.exits[1] = diningRoom;
		backyard.interacts[0] = table;
	}
}
