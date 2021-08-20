package fixtures;

public class Room {

	public Room[] exits;
	public String shortDescription;
	public String longDescription; 
	public String name;
	public int room;
	public Room[] items;

	public Room(String name, String shortDescription, String longDescription) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
		this.setExits(new Room[5]); // size is your choice
	}
		
	public void setExits(Room[] rooms) {
		// TODO Auto-generated method stub
		
	}

	public Room(String string) {
		// TODO Auto-generated constructor stub
	}

	public Room[] getExits() {
		return null;
		
	}
		
	public Room getExit(String direction) {
		switch(direction) {
		case "north":
		room = 0;
		break;
		case "east":
		room = 1;
		break;
		case "south":
		room = 2;
		break;
		case "west":
		room = 3;
		break;
		
		
		}
		return exits [room];
		
	}

	public Room[] setExits(Room a, Room b, Room c, Room d) {
		Room[] exitArray = {a,b,c,d};
		return exitArray;
	}
}
