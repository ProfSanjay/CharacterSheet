import java.util.*;

public class CharacterSheet {
    /* Add Character class 
        --> New character? Choose class (will need future setup to maintain abilities), name, race, and stats (maybe help with rolls || manual input)
        --> Ability to import character, through file import (CSV || .txt) --> can make edits maybe?
        --> Equipment Class & Inventory Class? --> Will have to be able to move back and forth 
    */

    public static void main(String args[]) {
        System.out.println("Welcome to the Character Sheet! Press Enter to start your journey!");
        // User Input 
        
        // TODO: Add all of these to Project Board
        // Main Focus --> Create New Character (maybe calculate stats based on roles?) 
        // Next Goal --> Save character data to .txt file
        // Next Goal --> Load character data from .txt file
        
        /* Future Features
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
}