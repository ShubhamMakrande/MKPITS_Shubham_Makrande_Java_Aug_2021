//example of employee class with constructor and method
class Employee
{
  int empno;
  String name;
  //creating constructor(Default constructor (no-arg constructor))
  public Employee()
  {
    System.out.println("default constructor is called");
    empno=123;
    name="Rajan";
  }
  	//creating method display

  void display()
  {
   System.out.println("Empno"+empno);//123
   System.out.println("Name"+name);//Rajan

  }


}
class Test4
{
 public static void main(String[] arg)
 {
   Employee e1=new Employee();
   e1.display();


 }




}