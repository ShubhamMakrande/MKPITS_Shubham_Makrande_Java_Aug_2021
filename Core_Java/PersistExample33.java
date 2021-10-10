//practice
//PersistExample32
import java.io.*;
class Person implements Serializable
{
  int id;
  String name;
  transient int age;
  Person(int id,String name,int age)
  {
    this.id=id;
    this.name=name;
    this.age=age;
  }
}
class PersistExample33
{
  public static void main(String[] arg)throws Exception
  {
     Person p1=new Person(12,"venky",48);
     FileOutputStream f=new FileOutputStream("f.txt");
     ObjectOutputStream out=new ObjectOutputStream(f);
     out.writeObject(p1);
     out.flush();
     out.close();
     f.close();
     System.out.println("sucess");
   }

}