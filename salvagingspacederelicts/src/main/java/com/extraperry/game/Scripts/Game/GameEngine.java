package com.extraperry.game.Scripts.Game;

import java.util.HashMap;

import com.extraperry.game.Model.Data.Commands;
import com.extraperry.game.Model.Game.Player;
import com.extraperry.game.Model.Game.Room;
import com.extraperry.game.Model.Game.UserInterface;
import com.extraperry.game.Model.Game.inputCommand;

/**
 * The game engine class
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
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

    //Methods
    /**
     * 
     * @return
     */
    public void runCommand(final inputCommand command) {
        switch (command.getIdentifier()) {
            //Game commands
            case "help":
                if (command.hasArguments()){
                    //Check all commands
                    for (String commandName : Commands.getHashMap().keySet()){
                        //Check if first argument is an actual command
                        if (commandName == command.getArguments()[0]){
                            //Using the commandName as a key to get the description & send it to the player
                            System.out.println(Commands.getHashMap().get(commandName));
                        }
                    }
                } else {
                    System.out.println("Sorry, I don't understand that command.");
                }
                break;
            case "look":
                break;
            case "go":
                break;
            case "take":
                break;
            case "drop":
                break;
            case "inventory":
                break;
            case "use":
                break;

            //Easter Egg commands
            case "merp":
                break;
        }
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

    //Methods
    /**
     * Adds a room to the list of rooms
     * @param room
     */
    public void addRoom(final Room room) {
        this.rooms.put(room.getName(), room);
    }
}
