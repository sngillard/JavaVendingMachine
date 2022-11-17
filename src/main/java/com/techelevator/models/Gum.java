package com.techelevator.models;

import java.math.BigDecimal;

public class Gum extends Item {
    //constrcutor
    public Gum(String itemName, String itemLocation, BigDecimal itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Chewy, Chewy, Lots O Bubbles!";
    }

}

