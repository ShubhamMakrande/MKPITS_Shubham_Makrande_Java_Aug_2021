
//Case1: You handle the exception

//    In case you handle the exception, the code will be executed fine whether exception occurs during the program or not.
import java.io.*;
class M
{
   void method()throws IOException
   {
   throw new IOException("Driver error.");
   }
}
class Testthrows2
{
public static void main(String[] arg)
{
  try
  {
  M m=new M();
  m.method();


  }
  catch(Exception ee)
  {
  System.out.println(ee.toString());

  }

System.out.println("Normal Flow....");


}



}