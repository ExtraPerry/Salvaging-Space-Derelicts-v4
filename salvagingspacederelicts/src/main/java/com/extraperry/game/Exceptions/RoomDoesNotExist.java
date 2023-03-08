package com.extraperry.game.Exceptions;

public class RoomDoesNotExist extends Exception {
    
    //Constructor
    public RoomDoesNotExist() {
        super("Specified Room does not exist");
    }
}