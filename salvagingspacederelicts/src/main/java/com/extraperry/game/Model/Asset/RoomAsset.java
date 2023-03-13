package com.extraperry.game.Model.Asset;

import java.util.HashSet;
import java.util.Set;

import com.extraperry.game.Model.Game.Item;
import com.extraperry.game.Model.Game.Room;

/**
 * Class used to represent the assets for the rooms inside of the game
 * as well as the items found inside each room
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class RoomAsset {

    //Attributes
    private Room room;
    private Set<Item> itemPool;
    private Set<Room> exitPool;
    private int exitCount;

    //Constructor
    /**
     * 
     * @param room
     * @param exitCount
     */
    public RoomAsset(final Room room, final int exitCount) {
        this.setRoom(room);
        this.itemPool = new HashSet<Item>();
        this.exitPool = new HashSet<Room>();

        if (exitCount > 0) {
            if (exitCount < 4) {
                this.setExitCount(exitCount);
            } else {
                this.setExitCount(4);   //limit the maximum number of exits to 4
            }
        } else {
            this.setExitCount(1);  //limit the minimum number of exits to 1
        }
    }

    //Methods
    /**
     * Adds an item to the item pool, in other words what items can be found in this room
     * @param item
     */
    public void addItem(final Item item) {
        this.itemPool.add(item);
    }
    /**
     * Adds an exit to the exit pool, in other words what rooms can connect to this room
     * @param room
     */
    public void addExit(final Room room) {
        this.exitPool.add(room);
    }

    //Getters
    /**
     * Returns the room
     * @return
     */
    public Room getRoom() {
        return room;
    }
    /**
     * Returns the item pool the room can have, in other words what items can be found in this room
     * @return
     */
    public Set<Item> getItemPool() {
        return itemPool;
    }
    /**
     * Returns the exit pool the room can have, in other words what rooms can connect to this room
     * @return
     */
    public Set<Room> getExitPool() {
        return exitPool;
    }
    /**
     * Returns the exit count the room has, in other words how many rooms should connect to this room
     * @return
     */
    public int getExitCount() {
        return exitCount;
    }

    //Setters
    /**
     * Sets the room
     * @param room
     */
    public void setRoom(final Room room) {
        this.room = room;
    }
    /**
     * Sets the exit count the room has, in other words how many rooms should connect to this room
     * @param exitCount
     */
    public void setExitCount(final int exitCount) {
        this.exitCount = exitCount;
    }

}
