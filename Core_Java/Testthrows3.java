//Case2: You declare the exception

 //   A)In case you declare the exception, if exception does not occur, the code will be executed fine.
 //   B)In case you declare the exception if exception occures, an exception will be thrown at runtime because throws does not handle the exception.

//A)Program if exception does not occur
import java.io.*;
class M
{
void method()throws IOException
{
System.out.println("Divice opreation performed");
}
}
class Testthrows3
{
public static void main(String[] arg)throws IOException//delcear exception
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
System.out.println("Normal flow");



}




}