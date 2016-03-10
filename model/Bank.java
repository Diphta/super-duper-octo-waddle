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
    private Current account;
    private Current cash;

    public Bank() {
    }

    public Current getAccount() {
        return account;
    }

    public void setAccount(Current account) {
        this.account = account;
    }

    public Current getCash() {
        return cash;
    }

    public void setCash(Current cash) {
        this.cash = cash;
    }
    
    
}
