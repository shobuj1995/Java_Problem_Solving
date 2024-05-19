package com.practice.bankmanagement;

import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accountList = new ArrayList<Account>();
    public void addAccount(Account accountName){
        accountList.add(accountName);

    }
    public void removeAccount(Bank accountName){

    }
    public void depositMoney(Account account,double amount){
        account.deposit(amount);
    }
    public void withdrawMoney(Account account,double amount){
        account.withdraw(amount);
    }
    public ArrayList<Account> getAccounts(){
        return accountList;
    }
}
