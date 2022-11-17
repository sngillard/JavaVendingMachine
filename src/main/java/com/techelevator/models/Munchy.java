package com.techelevator.models;

import java.math.BigDecimal;

public class Munchy extends Item {
    //constrcutor
    public Munchy(String itemName, String itemLocation, BigDecimal itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    public void printMessage() {
        System.out.println("Munchy, Munchy, so Good!");
    }

}
