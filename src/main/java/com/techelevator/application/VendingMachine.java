package com.techelevator.application;


import com.techelevator.models.FileReader;
import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine 
{

    private FileReader fileReader = new FileReader();
    List<Item> items = new ArrayList<>();

    public void run()
    {
        items = fileReader.readTextFile();

        UserOutput userOutput = new UserOutput();
        UserInput userInput = new UserInput();


        while(true)
        {
            userOutput.displayHomeScreen();
            String choice = userInput.getHomeScreenOption();

            if(choice.equals("display"))
            {
                displayVendingItems(items);
                // display the vending machine slots
            }
            else if(choice.equals("purchase"))
            {
                // make a purchase
            }
            else if(choice.equals("exit"))
            {
                // good bye
                break;
            }
        }
    }
    public void displayVendingItems(List<Item>items) {
        for(Item eachItem: items) {
            System.out.println(eachItem);
        }
    }


}
