//assignment :
//1- create a class Customer having field customerid, customername , customeremail,customermobile and setter and getter method.
class Customer
{
  private int id;
  private String name;
  private String email;
  private long mobile;

  public int getId()
  {
  return id;
  }
  public void setId(int id)
  {
  this.id=id;
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
public long getMobile()
{
return mobile;
}
public void setMobile(long mobile)
{
this.mobile=mobile;
}

}
class TestEEcustomerassg
{
  public static void main(String[] arg)
  {
    Customer c=new Customer();
    c.setId(102);
    c.setName("mahesh");
    c.setEmail("mahesh@gmail.com");
    c.setMobile(942158743L);
     System.out.println("Customer Id="+c.getId());
   System.out.println("Customer Name="+c.getName());
   System.out.println("Customer EmailId="+c.getEmail());
   System.out.println("Customer Mobile Numer="+c.getMobile());

  }




}