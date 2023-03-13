package com.extraperry.game.Scripts.Game;

import java.util.HashMap;

import com.extraperry.game.Model.Game.Room;

/**
 * Static class for generating any element of the game.
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public final class Generation {

    //Constructor
    public Generation() {
        
    }

    //Methods
    public static HashMap<String, Room> randomRooms(final int playAreaSize, final int numberOfRooms) {
        HashMap<String, Room> rooms = new HashMap<String, Room>();

        Room[][] playArea = new Room[playAreaSize][playAreaSize]; //Room[x][y]
        Room airlock = new Room("Airlock", "The airlock then entrance to any ship. It also serves to offload carried items back to your ship.");
        int center = playAreaSize / 2;
        
        playArea[center][center] = airlock;

        for (int i = 0; i < numberOfRooms; i++) {

        }

        return null;
    }
}
