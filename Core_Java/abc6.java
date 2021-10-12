import java.io.*;
class account
{
  void deposit(int amt)throws Exception
  {
  System.out.println("Deposit method of account class");
  }
}
class saving extends account
{
  void deposit(int amt)throws IOException
  {
  System.out.println("Deposit method of saving");
  }
}
class abc6
{
 public static void main(String[] arg)
 {
 try
 {
 saving s=new saving();
 s.deposit(100);

 }
 catch(Exception ee)
 {
	 }
 }
}