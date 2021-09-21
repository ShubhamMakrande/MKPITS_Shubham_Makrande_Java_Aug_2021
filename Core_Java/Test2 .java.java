//There are two types of constructors in Java: no-arg constructor, and parameterized constructor.
class Employee
{
//we have not created constructor in this class
  int empno;
  String name;
}
class Test2
{
  public static void main(String[] arg)
  { //Every time an object is created using the new() keyword ,at least one constructor is called.
    Employee e1=new Employee();//it calls a default constructor if there is no constructor avialable
    System.out.println("empno"+e1.empno);//0
    System.out.println("Name"+e1.name);//null


  }

}