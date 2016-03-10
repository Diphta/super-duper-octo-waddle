/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Account;
import model.Bank;

/**
 *
 * @author Tanja
 */
public class CustomerControl {
    Bank bank;

    public CustomerControl(Bank bank) {
        this.bank = bank;
    }
    
    public void transaction(Account account, long amount) {
        account.setBalance(amount);
    }
    
}
