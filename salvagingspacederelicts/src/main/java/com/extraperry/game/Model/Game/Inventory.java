package com.extraperry.game.Model.Game;

import java.util.ArrayList;

import com.extraperry.game.Model.Exception.InventoryFull;
import com.extraperry.game.Model.Exception.ItemNotInInventory;

/**
 * Represents an inventory of items
 * 
 * @author ExtraPerry
 * @version 1.0.0
 */
public class Inventory {

    //Attributes
    private ArrayList<Item> items;
    private int maxVolume;
    private int totalVolume;
    private int totalPrice;

    //Constructor
    /**
     * Creates an empty inventory with a maximum volume and a current volume/price of 0
     * @param maxVolume
     */
    public Inventory(final int maxVolume) {
        this.items = new ArrayList<Item>();
        this.setMaxVolume(maxVolume);
        this.setTotalVolume(0);
        this.setTotalPrice(0);
    }

    //Methods
    /**
     * Adds an item to the inventory if there is enough space (volume)
     * @param item
     * @throws InventoryFull
     */
    public void addItem(final Item item) throws InventoryFull {
        if (this.getTotalVolume() + item.getVolume() <= this.getMaxVolume()) {
            this.getItems().add(item);
            this.setTotalVolume(this.getTotalVolume() + item.getVolume());
            this.setTotalPrice(this.getTotalPrice() + item.getPrice());
        } else {
            throw new InventoryFull();
        }
    }
    /**
     * Removes an item from the inventory if it is in the inventory 
     * @param item
     * @throws ItemNotInInventory
     */
    public void removeItem(final Item item) throws ItemNotInInventory {
        if(this.getItems().remove(item)){
            this.setTotalVolume(this.getTotalVolume() - item.getVolume());
            this.setTotalPrice(this.getTotalPrice() - item.getPrice());
        }else{
            throw new ItemNotInInventory();
        }
    }
    /**
     * Transfers an item from one inventory to another if the item is in the first inventory and if there is enough space in the second inventory
     * @param item
     * @param inventory
     * @throws InventoryFull
     * @throws ItemNotInInventory
     */
    public void transferItem(final Item item, final Inventory inventory) throws InventoryFull, ItemNotInInventory {
        this.removeItem(item);
        inventory.addItem(item);
    }

    //Getters
    /**
     * Returns the items in the inventory
     * @return
     */
    public ArrayList<Item> getItems() {
        return items;
    }
    /**
     * Returns the maximum volume of the inventory
     * @return
     */
    public int getMaxVolume() {
        return maxVolume;
    }
    /**
     * Returns the total volume of the inventory
     * @return
     */
    public int getTotalVolume() {
        return totalVolume;
    }
    /**
     * Returns the total price of the inventory
     * @return
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    //Setters
    /**
     * Sets the maximum volume of the inventory
     * @param maxVolume
     */
    private void setMaxVolume(final int maxVolume) {
        this.maxVolume = maxVolume;
    }
    /**
     * Sets the total volume of the inventory
     * @param totalVolume
     */
    private void setTotalVolume(final int totalVolume) {
        this.totalVolume = totalVolume;
    }
    /**
     * Sets the total price of the inventory
     * @param totalPrice
     */
    private void setTotalPrice(final int totalPrice) {
        this.totalPrice = totalPrice;
    }

}