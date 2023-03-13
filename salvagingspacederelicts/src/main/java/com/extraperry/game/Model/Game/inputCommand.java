package com.extraperry.game.Model.Game;

public class inputCommand {
    
    //Attributes
    private String identifier;
    private String[] arguments;

    //Constructor
    public inputCommand(final String identifier, final String[] arguments) {
        this.setIdentifier(identifier);
        this.setArguments(arguments);
    }

    //Methods
    public boolean hasArguments() {
        return this.getArguments().length > 0;
    }

    //Getters
    public String getIdentifier() {
        return identifier;
    }
    public String[] getArguments() {
        return arguments;
    }

    //Setters
    public void setIdentifier(final String identifier) {
        this.identifier = identifier;
    }
    private void setArguments(final String[] arguments) {
        this.arguments = arguments;
    }
}
