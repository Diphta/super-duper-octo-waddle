/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author Tanja,Philip,Simon & Dino
 */
public class Bank {
    private long cashHolding;
    private long totalBalance;
    private ArrayList<Customer> customers;      

    public Bank() {
        customers = new ArrayList<>();
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
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public Customer getCostumer(int idCustmr) {
//        for (Customer customer : customers) {
//            //if der sammenligner customer id med customer id fra databasen gennem custhandler?
//            
//        }
          return customers.get(idCustmr);
    }
            
    }
