//Repeat the above Program by accepting values from the user.
import java.util.*;
class Account
{
 int   acct_no;
 String name;
 int amount;
 void insert(int ano,String n,int amt )
 {
    acct_no=ano;
    name=n;
    amount=amt;
    }
    //Method deposit
    void deposit(int amt) {
		amount = amount +amt;
		System.out.println( amt + " deposited successfully ");
	}

     //Method withdraw
   void withdrawl(int amt ) {
   							if(amount < amt ) {
   							System.out.println("cannot withdrawl amount due to insufficient fund " );
   							}
   							else {
   							amount=amount -amt;
   							System.out.println("Rs. " + amt + " withdrawl successfully");
   							}
   }

   	void checkBalance() {
   		System.out.println(" Balance amount is " + amount);
   	}

     void display()
     {
          System.out.println(" Acct No : " + acct_no );
			System.out.println(" Name  : " + name );
			System.out.println(" Amount : " + amount );


     }
}
class TestAccount1
{
 public static void main(String[] arg)
 {
   Account a1=new Account();
   Scanner scan=new Scanner(System.in);
   System.out.println("enter account number ");
   int acct_no=scan.nextInt();
   System.out.println("enter Account Holder name ");
   String name=scan.next();
   System.out.println("enter Amount ");
   int  amount=scan.nextInt();

   a1.insert(acct_no,name,amount);
   a1.display();
   System.out.println("enter Amount to be deposited in your account ");
   int amt =scan.nextInt();
   a1.deposit(amt);
   a1.checkBalance();

   System.out.println("enter Amount to be withdrawl in your account ");
    amt =scan.nextInt();

   a1.withdrawl(amt);
   a1.checkBalance();


 }

}