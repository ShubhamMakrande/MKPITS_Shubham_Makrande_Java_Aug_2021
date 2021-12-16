class Vehicle
{
 void run()
 {
 System.out.println("Vehicle is running");
 }
}
//creating a chikd class
class Bike22 extends Vehicle
{

  public static void main(String[] arg)
  {//creating an instance of child class
    Bike22 obj=new Bike22();
    //calling the method with child class instance
    obj.run();
  }
}