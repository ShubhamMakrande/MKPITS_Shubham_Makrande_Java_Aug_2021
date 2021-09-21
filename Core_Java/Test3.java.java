//Rules for creating Java constructor
//A constructor is called "Default Constructor" when it doesn't have any parameter.
//Syntax of default constructor:
class Employee
{
  int empno;
  String name;
//creating constructor(Default constructor (no-arg constructor))

  public Employee()
  {
    empno=123;
    name="Rajan";
  }
}
  class Test3
  {//Every time an object is created using the new() keyword, at least one constructor is called.

    public static void main(String[] arg)
    {
       Employee emp=new Employee();// this will call default constructor automatically
       System.out.println("Empno"+emp.empno);//123
       System.out.println("Name"+emp.name);//Rajan

    }




  }



