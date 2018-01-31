/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528_lab1;
import java.util.*;

/**
 *
 * @author Deon
 */

public class Manager {
    
    private ArrayList<Flight> flights;
    private ArrayList<Ticket> tickets;
    int numberOfFlights =0;
    int numberOfSeats = 200;
    double basePrice = 1000.00;
    Manager()
    {
        flights = new ArrayList<>();
        tickets = new ArrayList<>();
    }
    /*
     Populate flights arraylist
     */
    public void createFlights()
    {
        int i =1;
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Toronto", "New York","09/17/2016 11:50am"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Calgary", "Thunder Bay","09/18/2016 01:36am"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Detroit", "Chicago","09/19/2016 08:28pm"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Doha", "New Delhi","09/20/2016 12:50pm"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Tokyo City", "Shanghai","09/21/2016 02:38pm"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Moscow", "Tel Aviv","09/22/2016 08:18pm"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Frankfurt", "Paris","09/23/2016 06:55am"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"London", "Montreal","09/24/2016 03:33pm"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Cancun", "Bridgetown","09/25/2016 11:12am"));
        flights.add(new Flight(i++,numberOfSeats,basePrice,"Cairo", "Cape Town","09/26/2016 01:46am"));
        numberOfFlights = i;
       
    }
    /*
     Display all flights for any given origin and destination
     */
    
    public void displayAvailableFlights(String origin, String destination)
    {
        boolean avalibleFlight=false;//To be determined 
        int seats;
        String o,d;//temp variables 
        
        for(Flight f:flights)
        {
            o=f.getOrigin();
            d=f.getDestination();
            seats=f.getNumberOfSeatsLeft();
            if((o.equals(origin)==true)&&(d.equals(destination)==true)&&(seats>0))
            {
                if(avalibleFlight==false)//Flight found 1st instance
                {
                    System.out.println("Available flights leaving "+origin+" to "+ destination + "city.");
                    avalibleFlight=true;//At least one flight found
                }
                System.out.println(f);
            }
        }
        if(avalibleFlight==false)
        {
            System.out.println("No available flights found leaving "+origin+" to "+ destination + "city.");
        }
       
    }
    /*
     Display Flight for given flight number
     */
    
    public Flight getFlight(int flightNumber)
    {
        for (Flight f:flights)
        {
            if(f.getFlightNumber() == flightNumber)
            {
                return f;
            }
        }            
        return null;
    }
    /*
     Find given flight number, If there are seats avalible book a seat 
     * for the given person
     */
    
    public void bookSeat(int flightNumber, Passenger p)
    {
        boolean flightExists=false;
        double newprice;
        for (Flight f:flights)
        {
            if(f.getFlightNumber()== flightNumber)
            {
                flightExists = true;
                if(f.getNumberOfSeatsLeft()>0)
                {
                    
                    f.bookASeat();
                    newprice = p.applyDiscount(f.getOriginalPrice());
                    Ticket t = new Ticket (p,f,newprice);
                    tickets.add(t);
                    System.out.println("Successfully booked a seat on flight number: "+ flightNumber+".");
                    System.out.println(t);
                }
                else
                {
                    System.out.println("There are currently no Seats avalible for flight number: "+ flightNumber);
                }
                break;
            }
            
        }
        if(flightExists == false)
        {
               System.out.println("Flight Number : "+ flightNumber+" not found.");
        }
      
   
    }
    public static void main(String[] args) {
              
        Manager m =  new Manager();
        Member personA = new Member(25,"Person A",1);//No member discount
        Member personB = new Member(60,"Person B",3);//10% member discount
        Member personC = new Member(45,"Person C",6);//50% member discount
        NonMember personD = new NonMember(15,"Person D");//no discount
        NonMember personE = new NonMember(70,"Person E");//10% senior non member discount
        Passenger people[] = {personA,personB,personC,personD,personE};
        
        System.out.println("Deon Botelho 500576967 COE528 Section 1 Lab 1");
        
        
        System.out.println("\n**************************************************************************");
        System.out.println("Flights Have Been populated.");
        System.out.println("**************************************************************************\n");
        m.createFlights();//Populate flights
        
        System.out.println("\n**************************************************************************");
        System.out.println("Displaying all created flights by Origin to Destination.");
        System.out.println("**************************************************************************\n");
        for(Flight f:m.flights)//Display all created flights
        {
            m.displayAvailableFlights(f.getOrigin(), f.getDestination() );
            System.out.println();
        }
        int i = 0;//counter
        
        System.out.println("\n**************************************************************************");
        System.out.println("Displaying all created flights by Flight number.");
        System.out.println("**************************************************************************\n");
        for(Flight f:m.flights)//Show all flights
        {
            System.out.println("Display Flight number : " + (++i) + "\n"+ f );
            System.out.println();
        }
        i=0;
        System.out.println("\n**************************************************************************");
        System.out.println("Booking flights for person A thur E.");
        System.out.println("**************************************************************************\n");
        for(Passenger p:people)//Book flights for person A thru E 
        {
            m.bookSeat(++i, p);
            System.out.println("\n************************************************\n");
        }
       
        

    }
    
    
    
}
