//create a parent class account having fields accountno and balance.
//and constructor with 2 parameters
class Account
{
  int act_no;
   int balance;

   Account(int act_no,int balance)//create a constructor 2 parameter
   {
     this.act_no=act_no ;
     this.balance=balance;
   }

}
//cretaing subclasss
class Saving extends Account
{
  int interest;

  Saving(int act_no,int balance,int interest)//creating constructor 3 parameter
  {
     super(act_no,balance);
     this.interest=interest;
  }
  //method display data
void displaydata()
{
System.out.println(act_no+""+balance+""+interest);

}
//method deposit create
void deposit(int amount)
{
balance=balance+amount+interest;
System.out.println("Amount deposite succefully in your Account:");

}
//method withdrwal created
void withdrawl(int amount)
{
  if(amount>balance)
  {
    System.out.println("due to insufficient Balance in your Account,Amount:");

  }
  else
  {
    balance=balance-amount;
    System.out.println("Amount was withdrwal"+amount);

  }
}
void showBalance()
{

System.out.println("Balance in your Account is:"+balance);

}

}
//create user define data
class TestSuperassign
{
   public static void main(String[] arg)
   {
       java.util.Scanner scan=new java.util.Scanner(System.in);
       System.out.println("-------------Saving account Details-----------------------------------------");
       System.out.println("Enter Account number:");
       int act_no=scan.nextInt();
       System.out.println("Enter balacne in your Account:");
       int balance=scan.nextInt();
       System.out.println("Enter Amount to be deposited:");
       int amount=scan.nextInt();
       System.out.println("Enter Interest on saving Account:");
       int interest=scan.nextInt();
       System.out.println("Enter a amount to withdrwal");
        amount=scan.nextInt();
       Saving s1=new Saving(act_no,balance,interest);//calling saving class constructor
       s1.deposit(amount);
       s1.showBalance();

       s1.withdrawl(amount);
       s1.showBalance();
   }

}