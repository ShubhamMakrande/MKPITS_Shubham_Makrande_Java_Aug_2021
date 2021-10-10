//Practice
//PersistExample32

import java.io.*;
class Employee implements Serializable
{
  int id;
  String name;
  transient int age;
  Employee(int id,String name,int age)
  {
  this.id=id;
  this.name=name;
  this.age=age;
  }
}
class PersistExample34
{
  public static void main(String[] arg)throws Exception
  {
     Employee e1=new Employee(12,"ravi",60);
     FileOutputStream f=new FileOutputStream("f.txt");
     ObjectOutputStream out=new ObjectOutputStream(f);
     out.writeObject(e1);
     out.flush();
     out.close();
     f.close();
     System.out.println("sucees");
 }
}