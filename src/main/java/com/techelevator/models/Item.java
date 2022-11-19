package com.techelevator.models;

import java.math.BigDecimal;

public abstract class Item {
    //instance variables
    private String itemName;
    private String itemLocation;
    private BigDecimal itemPrice;

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
    }

    //method
    @Override
    public String toString() {
        String itemNameFormatted = String.format("%-15s", itemName);
        return itemLocation + " | " + itemNameFormatted + " | " + "$" + itemPrice;
    }

    //abstract method (public by default)
    public String printMessage(){
        return "";
    }

}
