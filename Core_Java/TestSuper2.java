class Employee
{
String empname="harsh";

}
class Parttimeemployee extends Employee
{
  String empname="venky";
  void display()
  {
   System.out.println("parttime emp name is:"+empname);
   System.out.println("employee name is:"+super.empname);

  }

}
class TestSuper2
{
 public static void main(String arg[])
 {
   Parttimeemployee p=new Parttimeemployee();
   p.display();


 }


}