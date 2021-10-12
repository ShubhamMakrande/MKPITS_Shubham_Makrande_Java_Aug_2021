//B)Program if exception occurs
import java.io.*;
class M
{
 void method()throws IOException
 {
   throw new IOException("Driver Error");
 }
}
class Testthrows4
{
public static void main(String[] arg)throws IOException
{
  try
  {
   M m=new M();
   m.method();
   System.out.println("Nromal flow...");
 }

}


}
//Output:Runtime Exception