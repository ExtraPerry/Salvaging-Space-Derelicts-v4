package com.extraperry.game.Model.Game;

import java.util.HashMap;

/**
 * The room class represents a room in the game
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class Room {
    
    //Attributes
    private String name;
    private String description;
    private HashMap<String, Room> exits;
    private Inventory inventory;

    //Constructor
    /**
     * Creates a room with a name and a description
     * The room has no exits and an empty inventory
     * The exits should be added later
     * @param name
     * @param description
     */
    public Room(final String name, final String description) {
        this.setName(name);
        this.setDescription(description);
        this.exits = new HashMap<String, Room>();
        this.inventory = new Inventory(10000);
    }

    //Methods
    /**
     * Adds an exit to the room in the given direction if it alread exists it will be overwritten
     * @param direction
     * @param room
     */
    public void addExit(final String direction, final Room room) {
        this.exits.put(direction, room);
    }
    /**
     * Returns the room in the given direction if it exists or null if it doesn't
     * @param direction
     * @return
     */
    public Room getExit(String direction) {
        return this.exits.get(direction);
    }

    //Getters
    /**
     * Returns the name of the room
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the description of the room
     * @return
     */
    public String getDescription() {
        return description;
    }
    /**
     * Returns the exits of the room
     * @return
     */
    public HashMap<String, Room> getExits() {
        return exits;
    }
    /**
     * Returns the inventory of the room
     * @return
     */
    public Inventory getInventory() {
        return inventory;
    }

    //Setters
    /**
     * Sets the name of the room
     * @param name
     */
    private void setName(final String name) {
        this.name = name;
    }
    /**
     * Sets the description of the room
     * @param description
     */
    private void setDescription(final String description) {
        this.description = description;
    }

}
