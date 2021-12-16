class Vehicle 
{
  void run()
  {
  System.out.println("Vehicle is running");
  }

}
class Bike extends Vehicle
{
  void run()
  {
  System.out.println("Bike is running safly");
  }
}
class Car extends Bike
{
 void run()
 {
 System.out.println("Car is running");
 }
}
 class Honda
 {
   public static void main(String[] arg)
   {
     Bike obj=new Bike();
     obj.run();
     Car c=new Car();
     c.run();
   }

 
 }