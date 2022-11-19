package com.techelevator.application;

import com.techelevator.models.Item;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    private Map<String, Item> vendingItemsAndLocation= new HashMap<>();

    public Inventory (List<Item> items) {
        for (Item eachItem : items){
            vendingItemsAndLocation.put(eachItem.getItemLocation(), eachItem);
            int initialCount = 6;
        } 

    }
}
