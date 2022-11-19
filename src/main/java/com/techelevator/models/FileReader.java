package com.techelevator.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private File itemsFromTextFile = new File("catering.csv");

    //method that returns a list of items
    public List<Item> readTextFile() {
        List<Item> vendingMachineItems = new ArrayList<>();
        try {
            Scanner textScanner = new Scanner(itemsFromTextFile);
            while (textScanner.hasNextLine()) {
                String line = textScanner.nextLine();
                String[] words = line.split(",");
                String itemLocation = words[0];
                String itemName = words[1];
                Double itemPrice = Double.parseDouble(words[2]);
                String itemType = words[3];

                if (itemType.equalsIgnoreCase("Gum")) {
                    vendingMachineItems.add(new Gum(itemName, itemLocation, itemPrice));
                } else if (itemType.equalsIgnoreCase("Candy")) {
                    vendingMachineItems.add(new Candy(itemName, itemLocation, itemPrice));
                } else if (itemType.equalsIgnoreCase("Drink")) {
                    vendingMachineItems.add(new Drink(itemName, itemLocation, itemPrice));
                } else if (itemType.equalsIgnoreCase("Munchy")) {
                    vendingMachineItems.add(new Munchy(itemName, itemLocation, itemPrice));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return vendingMachineItems;

    }
}
