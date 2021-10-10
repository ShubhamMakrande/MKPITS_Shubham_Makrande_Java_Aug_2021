//DePersist32
//Practice
import java.io.*;
public class DePersist33
{
   public static void main(String[] arg)throws Exception
   {
     ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
     Person p1=(Person)in.readObject();
     System.out.println(p1.id+" "+p1.name+" "+p1.age);
     in.close();
   }
}