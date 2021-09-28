//2) super can be used to invoke parent class method

//The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden.
class Employee
{
 String name="rajesh";
 void display()
 {
 System.out.println("employee name is "+ name);
 }
}
class Parttimeemployee extends Employee
{
  String name="venky";
  void display1()
  {
  System.out.println("parttimeemployee name is"+name);
  System.out.println("Employee name is "+super.name);
  
  }

}
class TestSuper3
{
 public static void main(String[] arg)
 {
   Parttimeemployee p1=new Parttimeemployee();
   p1.display1();
 
 
 }



}