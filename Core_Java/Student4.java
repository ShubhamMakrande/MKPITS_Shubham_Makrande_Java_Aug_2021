//In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.
//Java Program to demonstrate the use of the parameterized constructor.
class Student4
{
  int id;
  String name;
//creating a parameterized constructor
  public Student4(int i,String n)
  {
   id=i;
   name=n;
  }
  void display()
  {
//method to display the values
  System.out.println(id+""+name);
  }
  public static void main(String[] arg)
  {//creating objects and passing values
   Student4 s1=new Student4(12,"venky");
   Student4 s2=new Student4(13,"harsh");
    //calling method to display the values of object
   s1.display();
   s2.display();

  }



}