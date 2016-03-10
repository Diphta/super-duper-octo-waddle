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
public class Bank extends Account {
    private long cashold;
    private long totalBalance;
    
    public long getTotalBalance() {
        //Kode hvor man retunere alle Costumers samlede balance
        return totalBalance;
    }
}
