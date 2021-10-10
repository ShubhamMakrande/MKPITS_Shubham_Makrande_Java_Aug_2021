//Now write the code for deserialization.

//DePersist.java
import java.io.*;
class DePersist32
{
 public static void main(String[] arg)throws Exception
 {
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
   Employee s1=(Employee)in.readObject();
   System.out.println(s1.id+""+s1.name+""+s1.age);
   in.close();
 }



}