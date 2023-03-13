package com.extraperry.game.Model.Exception;

/**
 * Exception for when the inventory is full & thus an item cannot be added to it
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class InventoryFull extends Exception {
    
    //Constructor
    public InventoryFull() {
        super("Not enough space in inventory");
    }
}
