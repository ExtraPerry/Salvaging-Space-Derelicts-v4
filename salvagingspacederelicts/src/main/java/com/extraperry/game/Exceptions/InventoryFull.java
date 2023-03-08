package com.extraperry.game.Exceptions;

public class InventoryFull extends Exception {
    
    //Constructor
    public InventoryFull() {
        super("Not enough space in inventory");
    }
}
