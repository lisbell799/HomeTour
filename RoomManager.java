package game;
import fixtures.Room;

public class RoomManager {
	
	public Room startingRoom;
	public Room[] rooms =  new Room[5]; //set length equal to amount of total runes
	
	public void init() { //create rooms
	    Room livingRoom = new Room("The Living Room","a small living room",
			"The small living room. There is  couch and a TV" + "\n"
			+ "To the north is the bedroom." + "\n"
			+ "To the east is a laundry room, And to the south is the kitchen");
	    //set exit array of Foyer to set room 123 or w.e.
		this.rooms[0] = livingRoom;
		
		
		
		Room bedRoom = new Room("Bedroom", "a cozy bedroom with",
			"There is a small bed, a lamp in the corner which provides the only light, and a vanity with a mirror" + "\n"
			+ "You can see the living room which is south of the bedroom and to the east is the bathrom." 
			);
		this.rooms[1] = bedRoom;
		
		Room bathRoom = new Room("Bathroom", "a bathroom with a toilet, a sink with a dirty mirror above it, and a clawfoot tub",
			"From the bathroom, the bedroom is to the west, you can see the bed from the toilet."
			
			);
		this.rooms[2] = bathRoom;
		
		Room laundryRoom = new Room("laundry room", "a recent addition to the home is being used to store the washer and dryer", 
				"With a recent addition being added to the house, there is now an official laundry room. Complete with a brand new washer and dryer" + "\n" +
				 "The kitchen is to the south and the living room is to the west."
				);
		this.rooms[3] = laundryRoom;
		
		Room kitchen = new Room("kitchen", "a small kitchen", 
				"There is a modest kitchen with outdated appliances. There is a small table with a vase that had sunflowers in it on top. There are dirty dishes in the sink"
				+ "\n" + "The living room is to the north, and while the laundry room is technically to the north, there is no doorway connecting the two"
				);
		this.rooms[4] = kitchen;
		
		
		Room nullRoom = new Room("Null Room", " ", " ");
		
	    this.startingRoom = livingRoom;
	    
	    livingRoom.exits = livingRoom.setExits(bedRoom, laundryRoom,nullRoom, kitchen);
	    bedRoom.exits= bedRoom.setExits(nullRoom, livingRoom, nullRoom, bathRoom); 
	    bathRoom.exits= bathRoom.setExits(nullRoom, nullRoom, bedRoom, nullRoom);
	    kitchen.exits= kitchen.setExits(livingRoom, nullRoom, nullRoom, bathRoom);
	    laundryRoom.exits= laundryRoom.setExits(nullRoom, livingRoom, nullRoom, nullRoom);
	    
	    //items
	    Room TV = new Room("TV","A televison",
	    		"There is a relatively new televison set in the living room." + "\n"
	    + "Friends reruns are playing on the TV, but the volume is off and the subtitles are on." + "\n" 
	    				+"You turn the TV off for the night.");
	    Room Lamp = new Room("Lamp","An antique lamp.",
	    		"There is an antique lamp in the corner." + "\n"
	    +"This lamp is the only source of light in the bedroom." + "\n"
	    				+"You turn the lamp on since it is night and the room floods with warm light.");
	    Room Tub = new Room("Tub","A big clawfoot tub.",
	    		"A big clawfoot tub sits in the bathroom. There is a detachable showerhead on the faucet." + "\n"
	    + "You turn the hot water and watch the tub fill up so you can take a relaxing bath before bed.");
	    
	    livingRoom.items = livingRoom.setExits(TV, nullRoom, nullRoom, nullRoom);
	    bedRoom.items = bedRoom.setExits(Lamp, nullRoom, nullRoom, nullRoom);
	    bathRoom.items = bathRoom.setExits(Tub, nullRoom, nullRoom, nullRoom);
	}
}
