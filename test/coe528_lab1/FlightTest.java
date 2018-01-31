/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528_lab1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Deon
 */
public class FlightTest {
    
    int fn;//flight number
    String o;//origin
    String ds;//destination
    String dt;//departure time
    int c;//capacity
    double op;//original price
    
    Flight testFlight;
     public FlightTest() {}
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() 
    {
        fn = 0000;
         o = "Toronto";
        ds = "New York";
        dt = "9/17/2016 11:30am";
         c = 200;
        op = 1000;
        testFlight = new Flight(fn,c,op,o,ds,dt);
    }    
    @After
    public void tearDown() {}

    
    @Test
    public void testInvalidConstructor()
    {      
        try{        
            testFlight = new Flight(fn,c,op,o,o,dt);//ds = o
            System.out.println("Should have thrown an exception.");
            fail();
        }      
       catch (IllegalArgumentException ex)
       {
           System.out.println ("Test Success, exception detected!");
           assertEquals(true,true);
       }
    }
    
    @Test 
    public void testConstructor()
    {
      try
      {
          testFlight = new Flight(fn,c,op,o,ds,dt);
          assertEquals(true,true);
      }      
      catch (IllegalArgumentException ex)
      {
          System.out.println ("Test failed, should not have thrown exception!");
          fail();
      }
    }
   
    
    /**
     * Test of bookASeat method, of class Flight.
     */       
    @Test
    public void testBookASeat() {
        System.out.println("bookASeat");
        boolean expResult = true;
        boolean result = testFlight.bookASeat();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPrice method, of class Flight.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = op;
        double result = testFlight.getOriginalPrice();
        assertEquals(expResult, result,0);
        }

    /**
     * Test of getOrigin method, of class Flight.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("getOrigin");
        String expResult = o;
        String result = testFlight.getOrigin();
        assertEquals(expResult, result);
        }

    /**
     * Test of getDestination method, of class Flight.
     */
    @Test
    public void testGetDestination() {
        System.out.println("getDestination");
        String expResult = ds;
        String result = testFlight.getDestination();
        assertEquals(expResult, result);
        }

    /**
     * Test of getDepartureTime method, of class Flight.
     */
    @Test
    public void testGetDepartureTime() {
        System.out.println("getDepartureTime");
        String expResult = dt;
        String result = testFlight.getDepartureTime();
        assertEquals(expResult, result);
        }

    /**
     * Test of getFlightNumber method, of class Flight.
     */
    @Test
    public void testGetFlightNumber() {
        System.out.println("getFlightNumber");
        int expResult = fn;
        int result = testFlight.getFlightNumber();
        assertEquals(expResult, result);
        }

    /**
     * Test of getNumberOfSeatsleft method, of class Flight.
     */
    @Test
    public void testGetNumberOfSeatsLeft() {
        System.out.println("getNumberOfSeatsleft");
        int expResult = c;
        int result = testFlight.getNumberOfSeatsLeft();
        assertEquals(expResult, result);
       }

    /**
     * Test of getCapacity method, of class Flight.
     */
    @Test
    public void testGetCapacity() {
        System.out.println("getCapacity");
        int expResult = c;
        int result = testFlight.getCapacity();
        assertEquals(expResult, result);
        }

    /**
     * Test of setPrice method, of class Flight.
     */
    @Test
    public void testSetOriginalPrice() {
        System.out.println("setPrice");
        int p = 1000;
        testFlight.setOriginalPrice(p);
        assertEquals(p,testFlight.getOriginalPrice(),0);
       }

    /**
     * Test of setOrigin method, of class Flight.
     */
    @Test
    public void testSetOrigin() {
        System.out.println("setOrigin");
        o = "Thunder Bay";
        testFlight.setOrigin(o);
        System.out.println(testFlight);
        
        assertEquals(o,testFlight.getOrigin());
        }

    /**
     * Test of setDestination method, of class Flight.
     */
    @Test
    public void testSetDestination() {
        System.out.println("setDestination");
        ds = "Moscow";
        testFlight.setDestination(ds);
        assertEquals(ds,testFlight.getDestination());
        }

    /**
     * Test of setDepartureTime method, of class Flight.
     */
    @Test
    public void testSetDepartureTime() {
        System.out.println("setDepartureTime");
        String d = "1111";
        testFlight.setDepartureTime(d);
        assertEquals(d,testFlight.getDepartureTime());
        }

    /**
     * Test of setFlightNumber method, of class Flight.
     */
    @Test
    public void testSetFlightNumber() {
        System.out.println("setFlightNumber");
        int fn = 3333;
        testFlight.setFlightNumber(fn);
        assertEquals(fn,testFlight.getFlightNumber());
       }

    /**
     * Test of setNumberOfSeatsleft method, of class Flight.
     */
    @Test
    public void testSetNumberOfSeatsLeft() {
        System.out.println("setNumberOfSeatsleft");
        int s = 10;
        testFlight.setNumberOfSeatsLeft(s);
        assertEquals(s,testFlight.getNumberOfSeatsLeft());
        }

    /**
     * Test of setCapacity method, of class Flight.
     */
    @Test
    public void testSetCapacity() {
        System.out.println("setCapacity");
        int c = 220;
        testFlight.setCapacity(c);
        assertEquals(c,testFlight.getCapacity());
        }

    /**
     * Test of toString method, of class Flight.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        fn = 9999;
        c = 200;
        op = 250;
        o = "Toronto";
        ds = "New York";
        dt = "11:00am";
        testFlight = new Flight(fn,c,op,o,ds,dt);
        String expResult = ("Flight " + fn+  ", " + o + " to " + ds + ", " + dt +", "+ "original price: $" +op );
        String result = testFlight.toString();
        System.out.println(testFlight);
        if(expResult.equals(testFlight))
        {
            assertTrue(true);
        }
    }
    
    
}
