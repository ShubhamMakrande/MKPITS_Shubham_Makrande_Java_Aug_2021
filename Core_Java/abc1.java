//2) Rule: If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but can declare unchecked exception.
class account
{
  void deposit(int amt)
  {
   System.out.println("Deposit method of account class");
  }
}
class saving extends account
{
void deposit(int amt)throws ArithmeticException

{
System.out.println("Deposit method  of amount class");
}
}
class abc1
{
public static void main(String[] arg)
{
 saving s=new saving();
 s.deposit(100);


}
}