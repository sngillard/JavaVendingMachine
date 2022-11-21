package com.techelevator.ui;

import com.techelevator.models.FileReader;
import com.techelevator.models.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Responsibilities: This class should handle receiving ALL input from the User
 * 
 * Dependencies: None
 */
public class UserInput {
    private Scanner scanner = new Scanner(System.in);
    private FileReader fileReader = new FileReader();


                                                                                                                   //you can do the constructor anywhere but instide a method


    public String getHomeScreenOption() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("D) Display Vending Machine Items");
        System.out.println("P) Purchase");
        System.out.println("E) Exit");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("D")) {
            return "display";
        } else if (option.equals("P")) {
            return "purchase";
        } else if (option.equals("E")) {
            return "exit";
        } else {
            return "";
        }

    }

    public String getPurchaseMenu() {
        System.out.println("What would you like to do?");
        System.out.println();

        System.out.println("M) Feed Money");
        System.out.println("S) Select Item");
        System.out.println("F) Finish");

        System.out.println();
        System.out.print("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toUpperCase();

        if (option.equals("M")) {
            return "Feed";

        } else if (option.equals("S")) {

            System.out.println("Enter the item location: ");
//             displayVendingItems(items);
//            String selectedLocation = scanner.nextLine();
//            String location = selectedOption.trim().toUpperCase();
                return "Select";

        } else if (option.equals("F")) {
            return "Finish";
        } else {
            return ""; //

        }

    }
public String getMoneyInput(){
    // I want to ask the user how much money to feed into the machine:
    System.out.println("Please enter  $1, 5, 10, 20");
    String amountFed = scanner.nextLine();
    return amountFed;  //add to the purchase menu to tie it together for running the program
}

public String getSelectedItem() {
    System.out.println("Select an item: ");
    String itemSelected = scanner.nextLine();
    return itemSelected;
}
}