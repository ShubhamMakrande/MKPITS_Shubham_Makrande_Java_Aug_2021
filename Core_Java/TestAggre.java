 public class Address
{
String city;
String state;
String country;

 Address(String city,String state,String country)

{
  this.city=city;
  this.state=state;
  this.country=country;
}
}
class Customer
{
 String custname;
 Address address;

  Customer(String custname,Address address)
 {
    this.custname=custname;
    this.address=address;
 }
 void display()
 {
 System.out.println("Customer of name"+custname);
 System.out.println("Customer of city"+city);
 System.out.println("Customer of state"+state);
 System.out.println("Customer of country"+country);

 }

}
class TestAggre
{
  public static void main(String[] arg)
  {
    Address add1=new Address("nagpur","maharastra","india");
    Customer c=new Customer("harsh",add1);
    c.display();


  }




}