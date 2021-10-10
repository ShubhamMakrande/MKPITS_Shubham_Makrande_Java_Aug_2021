//Deserialization is the process of reconstructing the object from the serialized state.
//It is the reverse operation of serialization.
//Let's see an example where we are reading the data from a deserialized object.
import java.io.*;
public class Depersist1
{
   public static void main(String[] args)
   {
     try
     {
       ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
       Student32 s1=(Student32)in.readObject();
       System.out.println(s1.id+""+s1.name);
       in.close();
     }
     catch(Exception ee)
     {
     System.out.println("ee.toString()");
     }
   }
}