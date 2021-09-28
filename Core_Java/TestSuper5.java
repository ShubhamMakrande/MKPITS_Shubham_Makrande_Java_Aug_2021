import java.util.*;
class Person
{
  String name;
  String address;

  void getdata(String name,String address)
  {
  this.name=name;
  this.address=address;

  }
  void display()
  {
   System.out.println("name="+name+"Address="+address);

  }


}
//creating a derive class student
class Student extends Person
{
  int rollno;
  int marks;

 public  void getdata(int rollno,int marks,String name,String address)
  {
	  getdata(name,address);//calling bas class method with 2 par.
    this.rollno=rollno;
    this.marks=marks;
  }
  void display1()
  {
    super.display();
    System.out.println("roll no="+rollno+"marks="+marks);
  }

}
class TestSuper5
{
 public static void main(String[] arg)
 {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter student details");
   int rollno=s.nextInt();
   String name=s.next();
   int marks=s.nextInt();
   String address=s.next();
   Student s1=new Student();
   s1.getdata(rollno,marks,name,address);
   s1.display1();



 }






}