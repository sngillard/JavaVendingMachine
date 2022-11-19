package com.techelevator.application;

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
            return true;
        }
        return false;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
