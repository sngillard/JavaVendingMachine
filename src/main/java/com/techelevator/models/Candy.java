package com.techelevator.models;

import java.math.BigDecimal;

public class Candy extends Item {
    //constrcutor
    public Candy(String itemName, String itemLocation, BigDecimal itemPrice) {
        super(itemName, itemLocation, itemPrice); //sends info to item constrcutor
    }

    @Override
    public String printMessage() {
        return "Sugar, Sugar, so Sweet!";
    }

}

