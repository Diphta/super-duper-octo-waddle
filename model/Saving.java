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
public class Saving extends Account {
    boolean transferCheck = false;

    public Saving(int accountNumber, int regNumber, long balance, int customerId, String accountName, String accountType) {
        super(accountNumber, regNumber, balance, customerId, accountName, accountType);
    }
    
    public void transfer() {
        
    }
}
