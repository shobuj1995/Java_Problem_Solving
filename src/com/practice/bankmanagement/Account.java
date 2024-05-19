package com.practice.bankmanagement;

public class Account{
    private String accountName;
    private String accountNumber;
    private  double balance;

    public Account(String accountName, String accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw( double amount){
        balance -= amount;
    }
    public String getAccountInfo(){
        return "name: "+accountName+",AccountNumber"+accountNumber+",Balance "+balance;
    }
}
