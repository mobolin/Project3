// This program was created by Matthew Bolin


import java.util.Scanner;

import java.util.ArrayList;  // Imported the java utilities needed for main class

import java.io.*;

import java.text.DecimalFormat;

public class testingVehicle{


   public static void main (String []args)throws IOException // Start of main class
   
   {
      
      String vType = "";   
      
      String vMake = "";
      
      int vYear = 0;
      
      double BPrice = 0; // Variables used to assign the info from the text file that is read in
      
      int nDoors = 0;
      
      double fPrice = 0;
      
      double tPrice = 0;
      
      double numInstance = 0;
      
      double tNumInstance = 0;
      
            
      File file = new File("VehicleInformation.txt"); // Creating the file
      Scanner inputFile = new Scanner(file);// Scanner to read in the file
      
      while(inputFile.hasNext()) // While loop that reads the file and assigns the lines to the appropiate variables
      {
      
         vType = inputFile.nextLine();
         vMake = inputFile.nextLine();
         vYear = Integer.parseInt(inputFile.nextLine());  
         BPrice = Double.parseDouble(inputFile.nextLine()); // Assigning the variables to the correct lines and parsing to the correct variable type
         nDoors = Integer.parseInt(inputFile.nextLine());
      
         if(inputFile.hasNext())
            inputFile.nextLine(); // handles the blank line in the text file if it has one
            
         if(nDoors==4){
            fPrice = BPrice + 2500; // calculates the final price based on the numer of doors
         }
         
         else fPrice = BPrice;
         
         tPrice += fPrice; // accummalator variable for adding the total price of all vehicles
         
         
         Car carss = new Car(vType,vMake); // Car object from the car class which has aggregation with the vehicle class
         
         Vehicle cars = new Vehicle (carss,vYear,BPrice,nDoors,fPrice,numInstance); // vehicle object that passes variables to vehicle class for calculations and output
         
         ArrayList<Object> car = new ArrayList<Object>(); // array list creation to hold unlimited number of objects from file
         
         car.add(cars);// assigns the car object to the array list car
         
         System.out.println(cars.toString()); // prints the contents cars object wit the to string method for the appropriate output
         
         
                
                  
      }
      
      DecimalFormat formatter = new DecimalFormat("$000,000.00");
   
        
      System.out.println ("Total Price of all vehicles: " +formatter.format(tPrice)); // prints the total vehicle's price according to supplied output at the end of all other vehicles
        
   
   }}
   
