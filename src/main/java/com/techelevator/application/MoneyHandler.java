package com.techelevator.application;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class MoneyHandler {

    //balance, add money, return change
    BigDecimal balance = new BigDecimal("0");
    public boolean addMoney(BigDecimal moneyToAdd) {
        boolean is1 = (moneyToAdd.compareTo(new BigDecimal("1")) == 0);
        boolean is5 = (moneyToAdd.compareTo(new BigDecimal("5")) == 0);
        boolean is10 = (moneyToAdd.compareTo(new BigDecimal("10")) == 0);
        boolean is20 = (moneyToAdd.compareTo(new BigDecimal("20")) == 0);
        if (is1 || is5 || is10 || is20) {
            balance = balance.add(moneyToAdd);
         /*
                String userInput;
            System.out.println("Please only enter amounts: 1, 5, 10, 20");
        */

            return true;
        }
        return false;
    }

    //withdraw money - should we include?
    //get balance - should we include?
    //return change - should we include?

    public BigDecimal getBalance() {
        return balance;
    }
    public void setBalance(BigDecimal updatedBalance) {
        this.balance = updatedBalance;
    }

    public void returnChange() {
        BigDecimal wholeDollar = new BigDecimal("1.00");
        BigDecimal wholeQuarter = new BigDecimal("0.25");
        BigDecimal wholeDime = new BigDecimal("0.10");
        BigDecimal wholeNickel = new BigDecimal("0.05");
        int dollarCounter = 0;
        int quarterCounter = 0;
        int dimeCounter = 0;
        int nickelCounter = 0;
        dollarCounter = this.balance.divide(wholeDollar).intValue();
        this.balance = this.balance.remainder(wholeDollar);

        quarterCounter = this.balance.divide(wholeQuarter).intValue();
        this.balance = this.balance.remainder(wholeQuarter);

        dimeCounter = this.balance.divide(wholeDime).intValue();
        this.balance = this.balance.remainder(wholeDime);

        nickelCounter = this.balance.divide(wholeNickel).intValue();
        this.balance = this.balance.remainder(wholeNickel);

        System.out.println("Your change is" + ": " + dollarCounter + " dollars, " + quarterCounter + " quarters, " + dimeCounter + " dimes, " + nickelCounter + " nickels");
    }
}
