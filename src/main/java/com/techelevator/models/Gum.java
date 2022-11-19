package com.techelevator.models;

public class Gum extends Item {
    //constrcutor
    public Gum(String itemName, String itemLocation, Double itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Chewy, Chewy, Lots O Bubbles!";
    }

}

