package com.extraperry.game.Model.Exception;

/**
 * Exception for when the player is dead & thus cannot perform an actions
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class PlayerIsDead extends Exception{
    
    //Constructor
    public PlayerIsDead() {
        super("Player is dead");
    }
}
