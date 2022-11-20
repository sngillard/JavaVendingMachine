package com.techelevator.application;
import java.io.OutputStream;
import java.io.PrintWriter;
import com.techelevator.ui.UserInput;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

public class PurchaseMenu {
UserInput input = new UserInput();
MoneyHandler money;
//Inventory purchaseInventory;

public int itemStock = 6;

 public PurchaseMenu(MoneyHandler money) {
 this.money = money;
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
   String choice =  input.getPurchaseMenu();  //
    if(choice.equals("Feed"))
    {
        this.money.addMoney(BigDecimal.ZERO); //BigDecimal.Zero is a placeholder
        // display balance
    }
    else if(choice.equals("Select"))
    {
        //we need to get the users selection
     // make a purchase
    }
    else if(choice.equals("Finish"))
    {
        // good bye

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

