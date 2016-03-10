/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Tanja
 */
public class Account {
    private int accountNumber;
    private int regNumber;
    private long balance;
    private long interest;
    private long overdraw;

    public Account() {
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
    
    
}
