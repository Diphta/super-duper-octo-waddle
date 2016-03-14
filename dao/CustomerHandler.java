/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public Customer lookUpCustomer(String search) {
        Customer customer = null;
        try {
            String statement;
            statement = "SELECT * FROM bankCustomer WHERE custmrName LIKE '" + search+ "';";
            System.out.println(statement);
            ResultSet rs = DBHandler.getInstance().conn.createStatement().executeQuery(statement);
            
            while (rs.next()) {
                customer = new Customer(rs.getString("custmrName"), rs.getInt("phone"), rs.getString("email"), 
                        rs.getString("username"), rs.getString("psword"), rs.getString("accesInfo"));
            }
            
            
        } catch (SQLException ex) {
            
        }
        return customer;
    }
    
    public boolean checkLogin(String username, String password) throws SQLException {
        boolean check = false;
        DBHandler dbh = DBHandler.getInstance();
        Statement stm = (Statement) dbh.getConn().createStatement();
        String sql = "SELECT * FROM bankCustomer WHERE username = '" + username + "' AND psword = '" + password + "'";
        ResultSet rs = stm.executeQuery(sql);
        while (rs.next()) {
            check = true;
            System.out.println("works");
        }
        if (check == false) {
            System.out.println("wrong password");
        }
        return check;
   }
}
