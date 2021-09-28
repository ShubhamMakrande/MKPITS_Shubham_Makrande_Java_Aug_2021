import java.util.*;
class Person
{
  String name;
  String address;

  Person(String name,String address)
  {
    this.name=name;
    this.address=address;
  }
  void displaydata()
  {
  System.out.println("Name="+name+"Address="+address);
  }

}
class Student extends Person
{
   int id;
   int marks;

   Student(int id,int marks,String name,String address)
     {
         super(name,address);
         this.id=id;
         this.marks=marks;
     }
     void displaydata()
     {
     super.displaydata();
     System.out.println("id="+id+"marks="+marks);
     }
}
class TestSuper7
{
   public static void main(String[] arg)
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("Student details");
      int id=scan.nextInt();
      String name=scan.next();
      int marks=scan.nextInt();
      String address=scan.next();
      Student s=new Student(id,marks,name,address);
      s.displaydata();



   }



}