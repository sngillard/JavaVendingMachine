package com.techelevator.models;

public class Drink extends Item {
    //constrcutor
    public Drink(String itemName, String itemLocation, Double itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Drinky, Drinky, Slurp Slurp!";
    }

}

