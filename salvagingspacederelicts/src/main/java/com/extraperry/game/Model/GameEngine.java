package com.extraperry.game.Model;

import java.util.HashMap;

public class GameEngine {
    
    //Attributes
    private UserInterface ui;
    private Player player;
    private HashMap<String, Room> rooms;

    //Constructor
    /**
     * Creates a game engine with a user interface, a player and a List of rooms
     * @param ui
     * @param player
     * @param rooms
     */
    public GameEngine(final UserInterface ui, final Player player) {
        this.setUi(ui);
        this.setPlayer(player);
        this.rooms = new HashMap<String, Room>();
    }

    //Getters
    /**
     * Returns the user interface
     * @return
     */
    public UserInterface getUi() {
        return ui;
    }
    /**
     * Returns the player
     * @return
     */
    public Player getPlayer() {
        return player;
    }
    /**
     * Returns the rooms
     * @return
     */
    public HashMap<String, Room> getRooms() {
        return rooms;
    }

    //Setters
    /**
     * Sets the user interface
     * @param ui
     */
    private void setUi(final UserInterface ui) {
        this.ui = ui;
    }
    /**
     * Sets the player
     * @param player
     */
    private void setPlayer(final Player player) {
        this.player = player;
    }
}
