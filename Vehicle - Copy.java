import java.text.DecimalFormat;



public class Vehicle
{
   private String vehType;
   private String vehMake;
   private int year;
   private double basePrice;  // variables used to pass to class from object in main class, set to private to encapsulate the data (protect)
   private int Doors;
   private double fPrice;
   private double tPrice;
   private double numInstance = 0;
   private Car car;
   
   
   
   DecimalFormat formatter = new DecimalFormat("##,##0.00");
   
   public Vehicle() // default constructor
   {
   
   }
   
   public Vehicle(Car c,int yr,double bp,int d, double fp, double nI)  // constructor that passes all variables needed for creating object
   {
      car = c;  
      year = yr;
      basePrice = bp;
      Doors = d;             
      fPrice = fp;
      numInstance = nI;
      numInstance++;              
   }
   
   public Car getCar() // calls the aggregated Car class from the separate file
   {
      return new Car(car);
   }
   
   public void setNumInstance(double nI)// sets the numInstance counter 
   {
      numInstance = nI;
   }
   public double getNumInstance() // gets the numInstance counter value
   {
      return numInstance;
   }
   
   public void setYear(int yr)// sets the year value
   {
      year = yr;
   }
   public int getYear() //gets the year and returns that value
   {
      return year;
   }
   public void setBasePrice(double bp) // sets the base Price 
   {
      basePrice = bp;
   }
   public double getBasePrice() // gets and returns the base price to the main class
   {
      return basePrice;
   }
   // This program created by Matthew Bolin
   
   public void setDoors(int d)// sets the number of doors per vehicle
   {
      Doors = d;
   }
   public int getDoors()// gets and returns the number of doors to the  main class
   {
      return Doors;
   }
   public void setfPrice(double fp) // sets the final price depending on the number of doors
   {
      fPrice = fp;
   }
   public double getfPrice()// returns the final price to the main class that calls it
   {
      return fPrice;
   }
   
   public String toString()// to string method to handle output, makes it much neater to call this in the main method of the demo class (one line of code compared to many)
   {
   
      String str = car +
         "\nYear: " + year +
         "\nBase Price: $" + formatter.format(basePrice) +   //sets the ouput according to guidelines
         "\n# of Doors: " + Doors +
         "\nFinal Price: $" + formatter.format(fPrice) + "\n" ;
            
      return str; //returns this string
   
   }
   
   
}