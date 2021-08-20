package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Beginning of Application");
        Scanner sc = new Scanner(System.in);
        RoomManager rm = new RoomManager();
        rm.init();

        Player p = new Player();
        p.currentRoom = rm.startingRoom;
        
        while(p.game)
        {
        	printRoom(p);
        	String[] command = collectInput(sc.nextLine());
        	
            parse(command,p);
            

        }
        
      
   
        //System.out.println(p.currentRoom.name);
        printRoom(p);
        
        String[] command = collectInput(sc.nextLine());
        parse(command,p);
        printRoom(p);

        System.out.println("End of application");
        sc.close();
	}
	private static void printRoom(Player p) {
		 System.out.println(p.currentRoom.name + "\n" + p.currentRoom.longDescription);
	}

	private static String[] collectInput(String input) {
		String[] inputarray = input.split(" ");
		return inputarray; 
	}
	private static void parse(String[] inputarray, Player p) {
		String action = inputarray[0];
		//String direction = inputarray[1];
		String item = inputarray[1];
		switch(action) {
		case "move":
			p.currentRoom = p.currentRoom.getExit(item);
			
			break;
		case "use":
			System.out.println("\n" + "*" + item + "*");
			System.out.println(p.currentRoom.items[0].longDescription);
		}
			
		}
	}




