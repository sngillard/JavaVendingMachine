package com.techelevator.models;

import java.math.BigDecimal;

public class Drink extends Item {
    //constrcutor
    public Drink(String itemName, String itemLocation, BigDecimal itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    public void printMessage() {
        System.out.println("Drinky, Drinky, Slurp Slurp!");
    }

}

