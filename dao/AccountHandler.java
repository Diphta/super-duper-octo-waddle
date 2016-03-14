/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
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
}
