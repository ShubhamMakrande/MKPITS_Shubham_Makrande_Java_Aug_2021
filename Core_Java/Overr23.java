import java.util.*;
class Account
{
 int actno;
 int bal=1000;
 String deposit(int actno,int amt)
 {

 return "Account class of deposit method";
 }
 String withdrawl(int actno,int amt)
 {
 return"Account class of withdrawl method";

 }
}
class Saving extends Account
{
	int interest=500;
	String deposit(int actno,int amt)
	{
		this.actno=actno;
		bal=bal+amt+interest;
		return"account deposited for acct no " +actno+ ",bal is" + bal;
		}
		String withdrawl(int actno,int amt)
		{
			this.actno=actno;
			if(amt > bal)
			{
				return "insufficient fund";
				}
				{
					bal=bal-amt;
					return "amount withdrwal for account no" +actno+ ",bal is" +bal;

					}

			}



	}
public class Overr23
{
  public static void main(String[] arg)
  {
      java.util.Scanner s=new java.util.Scanner(System.in);
      System.out.println("Enter account No:");
      int actno=s.nextInt();
      System.out.println("Enter amount:");
      int amt=s.nextInt();
    System.out.println("do you want to deposite or withrawl");
    String ans=s.next();
    Saving act=new Saving();
    String str;
    if (ans.equals("deposit"))
    {
	   str=act.deposit(actno,amt);
	   System.out.println(str);
		}
		else if(ans.equals("withdrawl"))
		{
			str=act.withdrawl(actno,amt);
			System.out.println(str);


			}
  }


}