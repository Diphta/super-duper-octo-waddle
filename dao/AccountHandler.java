/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;



/**
 *
 * @author Tanja
 */
public class AccountHandler {
    
    private AccountHandler() {
    }
    
    public static AccountHandler getInstance() {
        return AccountHandlerHolder.INSTANCE;
    }
    
    private static class AccountHandlerHolder {

        private static final AccountHandler INSTANCE = new AccountHandler();
    }
    
    public void saveAccount (Account account) {
       String statement;
       statement = "INSERT INTO account (accNumber, regNr, accName, accType, balance, idCustmr)"
               + " VALUES ( '" + account.getAccountNumber()+
               "','"  + account.getRegNumber() + "','" + account.getAccountName() + "','"  
               + account.getAccountType() + "','"  + account.getBalance() + "','"  +
               account.getCustomerId()+ "')";
       
       try {
           DBHandler.getInstance().conn.createStatement().executeUpdate(statement);
       } catch (SQLException ex) {
           System.out.println(statement);
           System.out.println("SQLException" + ex.getMessage());
       }
             
    }
    
    public int accountNumber() {
        int accNumber = 0;
        try {
            String statement;
            statement = "SELECT accNumber FROM account;";
            System.out.println(statement);
            ResultSet rs = DBHandler.getInstance().conn.createStatement().executeQuery(statement);
            
            while (rs.next()) {
                System.out.println(rs.getString("accNumber"));
                accNumber = rs.getInt("accNumber");
            }
            accNumber++;
            
        } catch (SQLException ex) {
            
        }
        return accNumber;
    }
    
    public ArrayList<Account> lookUpAccount(int search) {
        ArrayList<Account> accounts = new ArrayList<>();
        try {
            String statement;
            statement = "SELECT * FROM account WHERE idCustmr  LIKE '" + search+ "';";
            System.out.println(statement);
            ResultSet rs = DBHandler.getInstance().conn.createStatement().executeQuery(statement);
            
            while (rs.next()) {
                Account acc = new Account(rs.getInt("accNumber"), 4700, rs.getLong("balance"), rs.getInt("idCustmr"), rs.getString("accName"), rs.getString("accType"));
                accounts.add(acc);
            }
            
            
        } catch (SQLException ex) {
            
        }
        return accounts;
    }
    
    public void depositToAcc(Account account) {
        String stmt1;
        String stmt2;
        String stmt3;
        stmt1 = "begin;";
        stmt2 = "update account set balance = " + account.getBalance() +  " where accnumber = " + account.getAccountNumber() + ";";
        stmt3 = "commit;";
        System.out.println(stmt1 + stmt2 + stmt3);
        try {
           DBHandler.getInstance().conn.createStatement().executeUpdate(stmt1);
           DBHandler.getInstance().conn.createStatement().executeUpdate(stmt2);
           DBHandler.getInstance().conn.createStatement().executeUpdate(stmt3);
       } catch (SQLException ex) {
           System.out.println(stmt2);
           System.out.println("SQLException" + ex.getMessage());
       }
    }
    
    public void cancelTransaction() {
        String stmt;
        String stmt1;
        stmt = "reroll;";
        System.out.println(stmt);
        try {
           DBHandler.getInstance().conn.createStatement().executeUpdate(stmt);
       } catch (SQLException ex) {
           System.out.println("SQLException" + ex.getMessage());
       }
    }
}
