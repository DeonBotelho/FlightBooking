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
public class Ticket {
    private Passenger passenger;
    private Flight flight;
    private double price;
    private int number;
    private static int count =0;

    Ticket(Passenger p1,Flight f,double p2)
    {
            count++;
            this.passenger = p1 ;
            this.flight = f;
            this.price = p2;
            this.number= count;
            
    }

    public Passenger getPassenger(){return passenger;}
    public void setPassenger(Passenger p){this.passenger = p;}

    public Flight getFlight(){return flight;}
    public void setFlight(Flight f){this.flight = f;}

    public double getPrice(){return price;}
    public void setPrice(double p){this.price=p;}

    public int getNumber(){return number;}
    public void setNumber(int n){this.number= n;}

    @Override 
    public String toString()
    {
    return  (   "Passenger      : " + passenger.getName() 
            + "\nFlight Number  : " + flight.getFlightNumber()
            + "\nOrigin         : " + flight.getOrigin()	
            + "\nDestination    : " + flight.getDestination()
            + "\nDeparture Time : " + flight.getDepartureTime()
            + "\nOriginal Price : $" + flight.getOriginalPrice()
            + "\nTicket Price   : $" + price
            + "\nTicket Number  : " + number);
    }
}
