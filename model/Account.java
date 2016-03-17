/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;



/**
 *
 * @author Tanja,Philip,Simon & Dino
 */
public class Account {
    private int accountNumber;
    private int regNumber;
    private long balance;
    private long interest;
    private long overdraw;
    private int customerId;
    private String accountName;
    private String accountType;

    public Account(int accountNumber, int regNumber, long balance, int customerId, String accountName, String accountType) {
        this.accountNumber = accountNumber;
        this.regNumber = regNumber;
        this.balance = balance;
        this.customerId = customerId;
        this.accountName = accountName;
        this.accountType = accountType;
    }
    
 
    @Override
    public String toString() {
        return accountName + "   " + accountNumber + "   " + balance + "kr.";
    }
    
    
    public String toStringAll() {
        return "Account Number: " + accountNumber + "\nReg. nr: " + regNumber + "\nBalance: "
                + balance + "\nAccount Name: " + accountName + "\n Account type: " + accountType;
    }

    public void setBalance(long balance) {
        this.balance += balance;
    }
    
      public int getAccountNumber() {
        return accountNumber;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public long getBalance() {
        return balance;
    }

    public long getInterest() {
        return interest;
    }

    public long getOverdraw() {
        return overdraw;
    }

    public String getAccountType() {
        return accountType;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getAccountName() {
        return accountName;
    }
    
    public void deposit(Account account, int amount) {
        balance = balance - amount;
        account.setBalance(amount);
    }
    
}
