//Example of Java Transient Keyword

//Let's take an example, we have declared a class as Student, it has three data members id, name and age. If you serialize the object, all the values will be serialized but we don't want to serialize one value, e.g. age then we can declare the age data member as transient.

//In this example, we have created two classes Student and PersistExample. The age data member of the Student class is declared as transient, its value will not be serialized.

//If you deserialize the object, you will get the default value for transient variable.
import java.io.*;
class StudentSerial implements Serializable
{
  int id;
  String name;
  transient int age;
   StudentSerial(int id,String name,int age)
  {
  this.id=id;
  this.name=name;
  this.age=age;
  }
}
class PersistExample32
{
  public static void main(String[] arg)throws Exception
  {
     StudentSerial s1=new StudentSerial(22,"shiv",23);
     FileOutputStream f=new FileOutputStream("f.txt");
     ObjectOutputStream out=new ObjectOutputStream(f);
     out.writeObject(s1);
     out.flush();
     out.close();
     f.close();
     System.out.println("succes");
   }

}
