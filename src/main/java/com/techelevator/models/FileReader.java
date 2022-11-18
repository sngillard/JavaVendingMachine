package com.techelevator.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class FileReader {
    private File itemsFromTextFile = new File("catering.csv");

    //method that returns a list of items
    public List<Item> readTextFile(){
        try {
            Scanner textScanner = new Scanner(itemsFromTextFile);
            while(textScanner.hasNextLine()) {
                String line = textScanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // loop through the catering.csv file

             // in each line of the file, determine what product type it is.

             // if the product type is Gum then make a new Gum object
             // Item gum = new Gum(....)
         //eventually gets sent to main vending machine class- instance of file reader class will be there
        //fileReader.
            return null;

    }



}
