//Let's see another example of encapsulation that has only four fields with its setter and getter methods.



    //A Account class which is a fully encapsulated class.
    //It has a private data member and getter and setter methods.

    //A Account class which is a fully encapsulated class.
    //It has a private data member and getter and setter methods.

class Account
{
   private long acct_no;
   private String name,email;
   private float amount;

 //get getter and setter method
 public long getAcct_no()
   {
   return acct_no;
    }
 public void setAcct_no(long acct_no)
   {
    this.acct_no=acct_no;
    }
 public String getName()
   {
    return name;
   }
 public void setName(String name)
    {
    this.name=name;
    }
public String getEmail()
   {
   return email;
   }
   public void setEmail(String email)
   {
   this.email=email;
   }
public float getAmount()
{
return amount;
}
public void setAmount(float amount)
{
this.amount=amount;
}
}

class TestEE2
{
  public static void main(String[] arg)
  {
    Account a1=new Account();
    a1.setAcct_no(1111111);
    a1.setName("venky");
    a1.setEmail("venkyku@gmail.com");
    a1.setAmount(12000);
    System.out.println(a1.getAcct_no()+""+a1.getName()+""+a1.getEmail()+""+a1.getAmount());




  }






}