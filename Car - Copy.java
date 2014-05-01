// This program created by Matthew Bolin

// aggregated car class that works with the vehicle class, chose to make this car since the make and model are related to each other


public class Car{

   private String vMake; // passing the vMake and vType strings from the file in the main method/class
   private String vType;

   public Car(String m, String t) //constructor to handle assigning the appropriate values
   {
      vType = t;
      vMake = m;
   
   }

   public Car(Car object2)
   {
      vType = object2.vType; // copy of the constructor
      vMake = object2.vMake;
   }

   public void set(String m, String t) // setter for the Car object
   {
      vType = t;
      vMake = m;
   }

   public String toString()
   {
      String str = "Make: " + vMake + // toString method that will ahere to format given in project guidelines
         "\nType: " + vType;
   
      return str;
   }

}