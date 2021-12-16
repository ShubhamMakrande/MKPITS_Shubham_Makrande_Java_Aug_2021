//In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation.
//The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding.
class Vehicle12
{
  void run()
  {
  System.out.println("Vehicle is running");
  }
  class Bike23 extends Vehicle12
  {
  void run()
  {
  System.out.println("Bike is running safely");
  }
  public static void main(String[] arg)
  {
   Bike23 obj=new Bike23();
   obj.run();



  }

  }

}