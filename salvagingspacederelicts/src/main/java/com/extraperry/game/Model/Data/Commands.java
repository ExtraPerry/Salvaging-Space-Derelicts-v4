package com.extraperry.game.Model.Data;

import java.util.HashMap;

/**
 * Class used to represent the assets for the items inside of the game
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class Commands {
    
    //Attributes
    public static HashMap<String, String> commandsList = new HashMap<String, String>();

    //Constructor
    /**
     * Creates a new commands list
     */
    public Commands() {
        
    }

    //Methods
    /**
     * Generates the list of commands and their descriptions
     * This method should only be called once when the game starts
     */
    public static void generateCommandsList() {
        //Game commands
        addCommand("help", "Shows the list of commands or the description of a command.");
        addCommand("look", "Shows the description & contents of the current room.");
        addCommand("go", "Moves the player to another room based on the direction.");
        addCommand("take", "Takes an item from the room and puts it in the player's inventory.");
        addCommand("drop", "Drops an item from the player's inventory and puts it in the room.");
        addCommand("inventory", "Shows the contents of the player's or room's inventory.");
        addCommand("use", "Uses an item from the player's inventory.");

        //Easter Egg commands
        addCommand("merp", "The funny sergal command.");
    }

    /**
     * Adds a command to the list
     * @param command
     * @param description
     */
    private static void addCommand(final String command, final String description) {
        commandsList.put(command, description);
    }

    //Getters
    /**
     * Returns hashmap of all commands and their description
     * @param command
     * @return command list
     */
    public static HashMap<String, String> getHashMap() {
        return commandsList;
    }

}