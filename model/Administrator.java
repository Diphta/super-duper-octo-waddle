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
public class Administrator extends Account {
    private ArrayList<Costumer>costumer;
    private double intrest;
    private long overdraw;

    public Administrator() {
    }
    
    public void addCostumer(){
        
    } 
    
    public void addAccount(){
        
    }
    
    public double editIntrest(){
        return intrest;
    }
    
    public long editOverdraw(){
        return overdraw;
    }
    
    public void deposit(){
        
    }
    
    public void withdraw(){
    }
    
    public void searchForCostumer(){
        // metoden skal ikke returnere void, men vi skal have oprettet et 
        // costumer objekt først. :) 
    }
}
