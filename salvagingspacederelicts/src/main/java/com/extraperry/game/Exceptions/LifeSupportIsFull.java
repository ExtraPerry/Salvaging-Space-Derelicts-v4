package com.extraperry.game.Exceptions;

public class LifeSupportIsFull extends Exception{
    
    //Constructor
    public LifeSupportIsFull() {
        super("Life support is already full");
    }
}
