/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Tanja
 */
public class Costumer {

    private String name;
    private int phone;
    private String email;
    private String username;
    private String password;
    private ArrayList<Account> konti;

    public Costumer() {
    }

    public String getName(){
        return name;
    }
    
    public ArrayList<Account> getKonti() {
        return konti;
    }

    
    
    
    
}
