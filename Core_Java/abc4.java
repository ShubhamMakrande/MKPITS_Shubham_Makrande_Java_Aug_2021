//If the superclass method declares an exception
//1) Rule: If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception.
//Example in case subclass overridden method declares parent exception
import java.io.*;
class account
{
void deposit(int amt)throws IOException
{
System.out.println("deposit method of account class");

}
}
class saving extends Parent
{
void deposit(int amt)throws IOException
{
System.out.println("deposit method of amount class");
}
}
class abc4
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