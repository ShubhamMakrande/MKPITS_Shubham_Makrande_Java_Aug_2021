//Java finalize example
import java.io.*;
class FinallyExample
{
 public void finalize()
 {
 System.out.println("finalize called");

 }
}
class Finalize
{
  public static void main(String[] arg)
  {
  FinallyExample f1=new FinallyExample();
  FinallyExample  f2= new FinallyExample();
  f1=null;
  f2=null;
  System.gc();

  }



}