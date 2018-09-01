/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygarage;

/**
 *
 * @author Makis
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String Address;
    
    public Customer(String f,String l,String a){
        firstName = f;
        lastName = l;
        Address = a;
    }
    
    public void setFirstName(String f){
        firstName = f;
    }
    
    public void setLastName(String l){
        lastName = l;
    }
    
    public void setAddress(String a){
        Address = a;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }

    public String getAddress(){
        return Address;
    }
}
