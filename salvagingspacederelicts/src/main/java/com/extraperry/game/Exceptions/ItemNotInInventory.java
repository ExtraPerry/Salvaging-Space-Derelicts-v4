package com.extraperry.game.Exceptions;

public class ItemNotInInventory extends Exception{
    
    //Constructor
    public ItemNotInInventory() {
        super("Item not found in inventory");
    }
}
