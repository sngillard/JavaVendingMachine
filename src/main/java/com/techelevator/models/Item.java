package com.techelevator.models;

import java.math.BigDecimal;

public abstract class Item {
    //instance variables
    private String itemName;
    private String itemLocation;
    private BigDecimal itemPrice;

    private int inventoryCount;

    //getters
    public String getItemName() {
        return itemName;
    }

    public String getItemLocation() {
        return itemLocation;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    //constrcutor
    public Item(String itemName, String itemLocation, Double itemPrice) {
        this.itemName= itemName;
        this.itemLocation = itemLocation;
        this.itemPrice = new BigDecimal(String.valueOf(itemPrice));
        this.inventoryCount = 6;
    }

    //method
    @Override
    public String toString() {
        String itemNameFormatted = String.format("%-15s", itemName);
        return itemLocation + " | " + itemNameFormatted + " | " + "$" + itemPrice + " | " + inventoryCount;
    }

    //abstract method (public by default)
    public String printMessage(){
        return "";
    }

    public void decrementInventoryCount() {
        this.inventoryCount = inventoryCount -1;
        if(inventoryCount < 0) {
            inventoryCount = 0;
        }
    }

}
