package com.extraperry.game.Model.Game;

/**
 * Item class represents an item in the game
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class Item {

    //Attributes
    private String name;
    private int price;
    private int volume;
    private String description;

    //Constructor
    public Item(final String name, final int price, final int volume, final String description) {
        this.setName(name);
        this.setPrice(price);
        this.setVolume(volume);
        this.setDescription(description);
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getVolume() {
        return volume;
    }
    public String getDescription() {
        return description;
    }

    //Setters
    private void setName(final String name) {
        this.name = name;
    }
    private void setPrice(final int price) {
        this.price = price;
    }
    private void setVolume(final int volume) {
        this.volume = volume;
    }
    private void setDescription(final String description) {
        this.description = description;
    }
}