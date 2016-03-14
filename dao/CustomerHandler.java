/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import model.Customer;

/**
 *
 * @author Tanja
 */
public class CustomerHandler {
    
    private CustomerHandler() {
    }
    
    public static CustomerHandler getInstance() {
        return CustomerHandlerHolder.INSTANCE;
    }
    
    private static class CustomerHandlerHolder {

        private static final CustomerHandler INSTANCE = new CustomerHandler();
    }
    
    public void saveCustomer (Customer customer) {
       String statement;
       statement = "INSERT INTO bankCustomer (custmrName, phone, email, username, psword, accesInfo)"
               + " VALUES ( '" + customer.getName()+
               "','"  + customer.getPhone()+ "','"  + customer.getEmail() +
               "','"  + customer.getUsername() + "','"  +
               customer.getPassword() + "','" + customer.getAccessInfo() + "')";
       
       try {
           DBHandler.getInstance().conn.createStatement().executeUpdate(statement);
       } catch (SQLException ex) {
           System.out.println(statement);
           System.out.println("SQLException" + ex.getMessage());
       }
             
    }
}
