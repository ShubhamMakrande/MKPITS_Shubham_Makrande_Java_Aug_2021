//ex:create a class account having field accountno,bal and method deposite and withdrawl.
//create subclass saving and override the deposite and withrwl method.
class Account
{
int  acctno;
int bal=1000;
 void depsite(int amt)
 {
   System.out.println("mehtod of deposit a class Account..");

 }
 void withdrawl(int amt)
 {
 System.out.println("method of withdrawl a class Account..");
 }

}
class Saving extends Account
{
  void deposite(int amt)
  {
  bal=bal+amt;
  System.out.println("method of deposite of class saving,balance is"+bal);
  }
  void withdrawl(int amt)
  {
  bal=bal-amt;
  System.out.println("method of  withdrwal of class saving,balance is"+bal);
  }

}
class OverrBank
{
  public static void main(String[] arg)
  {
  //Account a=new Account();
   // a.acctno(123);
   // a.deposte(100);
   // a.withdrwal(50);

    Saving s=new Saving();
    s.acctno=123;
    s.deposite(60);
    s.withdrawl(20);





  }



}
