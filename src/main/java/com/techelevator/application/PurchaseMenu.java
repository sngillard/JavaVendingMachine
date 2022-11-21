package com.techelevator.application;
import java.io.OutputStream;
import java.io.PrintWriter;

import com.techelevator.models.FileReader;
import com.techelevator.models.Item;
import com.techelevator.ui.UserInput;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PurchaseMenu {
UserInput input = new UserInput();
MoneyHandler money;
//Inventory purchaseInventory;
private List<Item> listOfVendingItems = new ArrayList<>();
private FileReader fileReader = new FileReader();

public int itemStock = 6;

 public PurchaseMenu(MoneyHandler money) {
   this.money = money;
   listOfVendingItems = fileReader.readTextFile();
 }

 public int getItemStock(){
  return itemStock;
 }

 public boolean isSelectionAvailable(){
  if (this.itemStock >=1){
  return true;
  }
  return false;

  }
 public void selectItem(){
  itemStock-=1;
 }
 public void displayPurchaseMenu () {
 //

   while(true) {
    String choice =  input.getPurchaseMenu();
    if(choice.equals("Feed"))
    {

     String moneyFed= input.getMoneyInput(); //

     this.money.addMoney(new BigDecimal(moneyFed)); //
        // display balance
        System.out.println(this.money.getBalance());
    }
    else if(choice.equals("Select"))
    {

      for(Item item : listOfVendingItems) {
       System.out.println(item);
      }

      String theSelectedItem = input.getSelectedItem();
      for(Item eachItem : listOfVendingItems) {
       if(eachItem.getItemLocation().equals(theSelectedItem)) {
        BigDecimal getTheItemPrice = eachItem.getItemPrice();
        BigDecimal updatedBalance = money.getBalance().subtract(getTheItemPrice);
        money.setBalance(updatedBalance);
           System.out.println(this.money.getBalance());
           eachItem.decrementInventoryCount();
       }
      }

     //we need to get the users selection
     // make a purchase
    }
    else if(choice.equals("Finish"))
    {
     money.returnChange();
     break;

    }
   }


}
}

/*Each time the application runs, the inventory is restocked. The only time the inventory is stocked is when it is started.
        When the customer selects "(D) Display Vending Items", they're presented with a list of all items in the machine with its quantity remaining:
        Each product has a slot identifier and a purchase price. (on out map called vendingItemsAndLocation)
        Each slot has enough room for 6 of that product.
        Every product is initially stocked to the maximum amount.
        A product that has run out must indicate that it is NO LONGER AVAILABLE.


 */

