package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Item {
    //constrcutor
    public Candy(String itemName, String itemLocation, BigDecimal itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    public void printMessage() {
        System.out.println("Sugar, Sugar, so Sweet!");
    }

}

