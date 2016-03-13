/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.omg.CORBA.Current;

/**
 *
 * @author Tanja
 */
public class Bank extends Account{
    private long cashHolding;
    private long totalBalance;

    public Bank() {
    }

    public long getCashHolding() {
        return cashHolding;
    }

    public void setCashHolding(long cashHolding) {
        this.cashHolding = cashHolding;
    }

    public long getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
    }

    
    }
