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
public class Member extends Passenger {
    
    int yearsOfMembership;
    Member(int age, String name,int yearsOfMembership)
    {
        super(age, name); 
        this.yearsOfMembership= yearsOfMembership;
    }
    
    @Override
    public double applyDiscount(double price)
    {
        if(yearsOfMembership > 5)//more than 5yrs 50%discount
            return (price*0.5);
        else if (yearsOfMembership > 1)//more than 1yr 10%discount
            return (price*0.9);
        else
            return price;// Else no discount
    }
    
}
