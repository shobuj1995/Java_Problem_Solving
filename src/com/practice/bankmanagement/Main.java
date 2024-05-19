package com.practice.bankmanagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Account account1=new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);
        Bank bank=new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        ArrayList<Account> accounts=bank.getAccounts();
        for(Account account:accounts){
            System.out.println(account.getAccountInfo());
        }
        System.out.println("\nAfter depositing 1000 into account1:");
        bank.depositMoney(account1,1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("After withdraw 5000 from account2");
        bank.withdrawMoney(account2,500);
        System.out.println(account2.getAccountInfo());

    }
}
