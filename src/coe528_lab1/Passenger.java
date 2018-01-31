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
public abstract class Passenger {
    
    String name;
    int age;
       
     public Passenger(int age, String name) 
     {
        this.name = name;
        this.age = age;
    }
    
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}
    
    public abstract double applyDiscount(double p);
            
    
}
