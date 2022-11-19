package com.techelevator.application;

import com.techelevator.ui.UserInput;

import java.math.BigDecimal;

public class PurchaseMenu {
UserInput input = new UserInput();
MoneyHandler money;
 public PurchaseMenu(MoneyHandler money) {
 this.money = money;

 }


 public void displayPurchaseMenu () {
   String choice =  input.getPurchaseMenu();  //
    if(choice.equals("Feed"))
    {
        this.money.addMoney(BigDecimal.ZERO); //BigDecimal.Zero is a placeholder
        // display balance
    }
    else if(choice.equals("Select"))
    {
        // make a purchase
    }
    else if(choice.equals("Finish"))
    {
        // good bye

    }
}
}
