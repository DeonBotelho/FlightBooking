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
public class Flight {
     
    private int flightNumber,capacity,numberOfSeatsLeft;
    private double originalPrice;
    private String origin,destination,departureTime;


    Flight(int flightNumer,int capacity,double originalPrice,String origin, String destination,String departureTime)
    {
            this.flightNumber=flightNumer;
            this.capacity = capacity;
            this.numberOfSeatsLeft = capacity;
            this.originalPrice = originalPrice;
            if(origin.equals(destination))
            {
                throw new IllegalArgumentException();
            }
            this.origin = origin;
            this.destination=destination;
            this.departureTime=departureTime; 

    }

    public int getFlightNumber( ){return flightNumber;}
    public void setFlightNumber(int flightNumber){this.flightNumber = flightNumber;}

    public int getCapacity(){return capacity;}
    public void setCapacity(int capacity){this.capacity = capacity;}

    public int getNumberOfSeatsLeft(){return numberOfSeatsLeft;}
    public void setNumberOfSeatsLeft(int numberOfSeatsLeft){this.numberOfSeatsLeft=numberOfSeatsLeft;}

    public double getOriginalPrice(){return originalPrice;}
    public void setOriginalPrice(double orignalPrice){this.originalPrice=orignalPrice;}

    public String getOrigin(){return origin;}
    public void setOrigin(String origin){this.origin=origin;}

    public String getDestination(){return destination;}
    public void setDestination(String destination){this.destination =destination;}

    public String getDepartureTime(){return departureTime;}
    public void setDepartureTime(String departureTime){this.departureTime =departureTime;}
    
     public boolean bookASeat()
     {
        if (numberOfSeatsLeft > 0) 
        {
            numberOfSeatsLeft--;
            return true;
        }
        return false;
    }
    
    @Override
    public String toString()
    {
        return ("Flight " + flightNumber +  ", " + origin + " to " + destination + ", " + departureTime +", "+ "original price: $ "+ originalPrice+"0" );
    }

}
