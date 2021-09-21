//Java Parameterized Constructor
class Employee
{
	//creating constructor(Default constructor (no-arg constructor))
  int empno;
  String name;

  public Employee()
  {
    System.out.println("default constructor is called");
    empno=123;
    name="mahesh";
  }
  //creating parameterized constructor
  public Employee(int e,String en)
  {
    empno=e;
    name=en;

  }
//creating method display
void display()
{
  System.out.println(empno+" "+name);

}


}
class Test5
{
  public static void main(String[] arg)
  {//Every time an object is created using the new() keyword, at least one constructor is called.

     Employee emp=new Employee();//this will call default constructor automatically
     emp.display();
     Employee emp1=new Employee(11,"shann");
     emp1.display();



  }



}