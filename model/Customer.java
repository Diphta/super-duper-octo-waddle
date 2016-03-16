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
public class Customer {

    private String name;
    private int phone;
    private String email;
    private String username;
    private String password;
    private ArrayList<Account> accounts;
    private String accessInfo;
    private int idCustmr;

    public Customer(String name, int phone, String email, String username, String password, String accessInfo, int idCustmr) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.username = username;
        this.password = password;
        this.accessInfo = accessInfo;
        this.idCustmr = idCustmr;
    }
    
     @Override
    public String toString() {
        return "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email
                + "\nUsername: " + username + "\nPassword: " + password;
    }

    public String getName(){
        return name;
    }
    
    public ArrayList<Account> getAccounts() {
        return accounts;
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAccessInfo() {
        return accessInfo;
    }

    public int getIdCustmr() {
        return idCustmr;
    }
    
    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    } 
    
   
    
    
}
