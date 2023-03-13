package com.extraperry.game.Model.Exception;

/**
 * Exception for when a room does not exist & thus cannot be accessed
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class RoomDoesNotExist extends Exception {
    
    //Constructor
    public RoomDoesNotExist() {
        super("Specified Room does not exist");
    }
}