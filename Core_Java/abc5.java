//another Example
import java.io.*;
class account
{
  void deposit(int amt)throws IOException
  {
     System.out.println("Deposit method of account class");
  }
}
class saving extends account
{
 void deposit(int amt)
 {
   System.out.println("Deposit method of saving  class.");
 }
}
class abc5
{
  public static void main(String[] arg)
  {
    try
    {
     saving s=new saving();
     s.deposit(1000);
    }
    catch(Exception ee)
    {

    }
  }

}