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
    public Item(String itemName, String itemLocation, BigDecimal itemPrice) {
        itemName= itemName;
        itemLocation = itemLocation;
        itemPrice = itemPrice;
    }

    //abstract method (public by default)
    void printMessage(){
    }

}
