import java.util.*;

public class CharacterSheet {
    /* Add Character class 
        --> New character? Choose class (will need future setup to maintain abilities), name, race, and stats (maybe help with rolls || manual input)
        --> Ability to import character, through file import (CSV || .txt) --> can make edits maybe?
        --> Equipment Class & Inventory Class? --> Will have to be able to move back and forth 
    */

    public static void main(String args[]) {
        System.out.println("Welcome to the Character Sheet! Press Enter to start your journey!");
        Scanner scanner = new Scanner(System.in);
		  // Check for 'Enter'
			
		  // Create new character --> TODO: Add an import option (switch case w/ options)
		  System.out.print("Enter your character's name: ");
		  String playerName = scanner.nextLine();
		
		  System.out.print("Enter your character's race: ");
		  String playerRace = scanner.nextLine();     // TODO: Check this value against dict to see if it's valid?
		  
        System.out.print("Enter your character's class: ");
        String playerClass = scanner.nextLine();    // TODO: Check this value against dict to see if it's valid?

		// Creates object based on no manual input for stats  
		Character myCharacter = new Character(false, playerName, playerRace, playerClass);

        // TODO: Add all of these to Project Board
        // Main Focus --> Create New Character (maybe calculate stats based on rolls?)
		  // 		--> Start with basic info (name, race/subrace, class, basic stats(?))
        // Next Goal --> Save character data to .txt file
        // Next Goal --> Load character data from .txt file
        
        /* Future Features
				--> Multiclassing
            --> Track Stats (HP, Spell Slots, etc.)
            --> Make rolls for them
            --> Add/Subtract from Equipment || Inventory
            --> Show Status Conditions (Down, Dead, Poisoned, Encumbered, etc.)
            --> Apply effects to character that help/hinder rolls
        */

        /* WAY Down the Line --> Campaign Tool
            --> Helps user manage a character throughout a D&D campaign
            --> Potential tool for GM to manage encounters and dialouge (story creation, NPC/monster stats, rolls against party, etc.)
            --> Possible "campaign group" where party & GM connect to a server to store/manage everything that happens 
                --> GM can request rolls, party members can share items, etc.
            --> Character Art? --> Users can upload what their character looks like for funsies
         */
    }
}

class Character {
    // Getters & Setters
    // Creates empty equipment and inventory objects??
    // Reads in .txt file to import character

	 private String name;	// Character name
	 private String race;	// Character race
	 private String class;	// Character class
	 private int health;	 	// Character health --> initialized on dice roll || manual input
	 // Stats --> as a List? || a Map to link name to value
	 // Equipment Object??
	 // Inventory Object?? --> Does this include money??
	
	public void setName(String playerName) { this.name = playerName; }
	public String getName() { return this.name; }
	
	// Maybe have the user select from a list and set value based on that from a dict?
	public void setRace(String playerRace) { this.race = playerRace; }
	public String setRace() { return this.race; }
	
	public void setClass(String playerClass) { this.class = playerClass; }
	public String getClass() { return this.class; }
	
	// Subrace --> Similar to race (make check on Race value to generate list and then select from dict)
	
	// Depends on manual input || if the program
	public void setHealth(int playerHealth) { this.health = playerHealth; }
	public int getHealth() { return this.health; }
	
	public Character(boolean manualInput, String playerName, String playerRace, String playerClass, int playerHealth) {
		this.name = playerName;
		this.race = playerRace;
		this.class = playerClass;
		
		// Set stats to help with modifiers??
		 
		if (manualInput) { this.health = playerHealth; }
		else { this.health = Math.floor(Math.random() * 8); }     // Multiplier is dependent on class??
	}
}