package com.techelevator.models;

import java.math.BigDecimal;

public class Drink extends Item {
    //constrcutor
    public Drink(String itemName, String itemLocation, BigDecimal itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Drinky, Drinky, Slurp Slurp!";
    }

}

