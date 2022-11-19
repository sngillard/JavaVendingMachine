package com.techelevator.models;

public class Candy extends Item {
    //constrcutor
    public Candy(String itemName, String itemLocation, Double itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Sugar, Sugar, so Sweet!";
    }

}

