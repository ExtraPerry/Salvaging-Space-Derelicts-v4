package com.extraperry.game.Model.Exception;

/**
 * Exception for when an item is not found in the inventory
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class ItemNotInInventory extends Exception{
    
    //Constructor
    public ItemNotInInventory() {
        super("Item not found in inventory");
    }
}
