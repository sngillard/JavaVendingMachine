package com.techelevator.models;

public class Munchy extends Item {
    //constrcutor
    public Munchy(String itemName, String itemLocation, Double itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Munchy, Munchy, so Good!";
    }

}
