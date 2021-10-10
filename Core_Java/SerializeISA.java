//If a class implements Serializable interface then all its sub classes will also be serializable. Let's see the example given below:
import java.io.Serializable;
class Person implements Serializable
{
  int id;
  String name;
  Person(int id,String name)
  {
    this.id=id;
    this.name=name;
  }
}
class Student32 extends Person
{
  String course;
  int fees;
  Student32(int id ,String name,String course,int fees)
  {
    super(id,name);
    this.course=course;
    this.fees=fees;
  }
}
public class SerializeISA
{
  public static void main(String[] args)
  {
    try
    {
      Student32 s1=new Student32(22,"harsh","java",1200);
     FileOutputStream fout=new FileOutputStream("f.txt");
      ObjectOutputStream out=new ObjectOutputStream(fout);
      out.writeObject(s1);
      out.flush();
      out.close();
    System.out.println("sucsses");
    }
  catch(Exception e)
  {
  System.out.println(e);
  }

  try
  {

    ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
    Student32 s=(Student32)in.readObject();
    System.out.pritnln(s.id+""+s.name+""+s.course+""+s.fees);
    in.close();
   }
   catch(Exception e)
   {
     Sytsem.out.println(e);
   }

  }


}




