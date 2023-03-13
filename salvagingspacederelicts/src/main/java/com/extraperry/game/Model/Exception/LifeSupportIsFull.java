package com.extraperry.game.Model.Exception;

/**
 * Exception for when the life support is already full & thus cannot increase life support amount
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class LifeSupportIsFull extends Exception{
    
    //Constructor
    public LifeSupportIsFull() {
        super("Life support is already full");
    }
}
