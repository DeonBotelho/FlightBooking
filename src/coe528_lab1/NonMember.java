/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528_lab1;

/**
 *
 * @author Deon
 */
public class NonMember extends Passenger {
    
    
    NonMember(int age,String name)
    {
        super(age, name);   
    }
    
    @Override
    public double applyDiscount(double price)
    {
        if (age > 65) //Nonmember is older than give 10% discount
             return (price * 0.9);
        
            return price;
    }
                  
}
