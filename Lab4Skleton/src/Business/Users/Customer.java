/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Customer>{
    private String date;

    public Customer(String password, String userName,String date) {
        super(password, userName, "CUSTOMER");
        this.date=date;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public int compareTo(Customer t) {
        return t.getUserName().compareTo(this.getUserName());
    }
    
    @Override
    public String toString() {
        return getUserName(); 
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
}
