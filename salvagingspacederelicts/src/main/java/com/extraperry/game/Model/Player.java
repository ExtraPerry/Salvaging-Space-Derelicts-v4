package com.extraperry.game.Model;

import java.util.Stack;

import com.extraperry.game.Exceptions.LifeSupportIsFull;
import com.extraperry.game.Exceptions.PlayerIsDead;
import com.extraperry.game.Exceptions.RoomDoesNotExist;

public class Player {
    
    //Attributes
    private String name;
    private Room currentRoom;
    private Stack<Room> previousRooms;
    private Inventory inventory;
    private int lifeSupport;
    private boolean isAlive;

    //Constructor
    /**
     * Creates a player with a name, a current room
     * By default the player has 100 life support, is alive and has an empty inventory
     * The history of previous rooms is empty
     * @param name
     * @param currentRoom
     */
    public Player(final String name, final Room currentRoom) {
        this.setName(name);
        this.setCurrentRoom(currentRoom);
        this.previousRooms = new Stack<Room>();
        this.inventory = new Inventory(10000);
        this.setLifeSupport(100);
        this.setAlive(true);
    }

    //Getters
    /**
     * Returns the name of the player
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * Returns the current room of the player
     * @return
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }
    /**
     * Returns the inventory of the player
     * @return
     */
    public Inventory getInventory() {
        return inventory;
    }
    /**
     * Returns the life support of the player
     * @return
     */
    public int getLifeSupport() {
        return lifeSupport;
    }
    /**
     * Returns if the player is alive
     * @return
     */
    public boolean isAlive() {
        return isAlive;
    }

    //Setters
    /**
     * Sets the name of the player
     * @param name
     */
    private void setName(final String name) {
        this.name = name;
    }
    /**
     * Sets the current room of the player
     * @param currentRoom
     */
    private void setCurrentRoom(final Room currentRoom) {
        this.currentRoom = currentRoom;
    }
    /**
     * Sets the life support of the player
     * @param lifeSupport
     */
    private void setLifeSupport(final int lifeSupport) {
        this.lifeSupport = lifeSupport;
    }
    /**
     * Sets if the player is alive
     * @param isAlive
     */
    private void setAlive(final boolean isAlive) {
        this.isAlive = isAlive;
    }

    //Methods
    /**
     * Decreases the life support of the player
     * @param amount
     * @throws PlayerIsDead
     */
    public void decreaseLifeSupport(final int amount) throws PlayerIsDead {

        if(this.getLifeSupport() - amount <= 0 || this.getLifeSupport() == 0){
            this.setLifeSupport(0);
            this.setAlive(false);
            throw new PlayerIsDead();
        }else{
            this.setLifeSupport(this.getLifeSupport() - amount);
        }
    }
    /**
     * Increases the life support of the player if it is not full
     * @param amount
     * @throws LifeSupportIsFull
     */
    public void increaseLifeSupport(final int amount) throws LifeSupportIsFull {
        if(this.getLifeSupport() == 100){
            throw new LifeSupportIsFull();
        }
        if(this.getLifeSupport() + amount > 100){
            this.setLifeSupport(100);
        }else{
            this.setLifeSupport(this.getLifeSupport() + amount);
        }
    }
    /**
     * Moves the player to the previous room
     * @throws RoomDoesNotExist
     */
    public void moveBack() throws RoomDoesNotExist {
        if (!this.previousRooms.isEmpty()) {
            this.setCurrentRoom(this.previousRooms.pop());
        }else{
            throw new RoomDoesNotExist();
        }
    }
    /**
     * Moves the player to a new room if the room exists
     * @param direction
     * @throws RoomDoesNotExist
     */
    public void move(final String direction) throws RoomDoesNotExist {
        if (this.currentRoom.getExits().containsKey(direction)) {
            this.previousRooms.push(this.currentRoom);
            this.setCurrentRoom(this.currentRoom.getExits().get(direction));
        }else{
            throw new RoomDoesNotExist();
        }
    }
}
