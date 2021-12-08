//repeat the above program by accepting values from the user.
import java.util.*;
class Address
{
  String city,state,country;
  public Address(String city,String state,String country)
  {
   this.city=city;
   this.state=state;
   this.country=country;
  }

}
class User
{
 int id ;
 String name;
 Address address;
 public User(int id,String name,Address address)
 {
 this.id=id;
 this.name=name;
 this.address=address;
 }
 void display()
 {
  System.out.println("user id is"+id);
  System.out.println("user name is"+name);
  System.out.println("user city is"+address.city);
  System.out.println("user state is"+address.state);
  System.out.println("user coutry is"+address.country);



 }
public static void main(String[] arg)
{
Scanner r=new Scanner(System.in);

System.out.println("Enter the id:");
int id=r.nextInt();
System.out.println("Enter the name:");
String name=r.nextLine();
System.out.println("Enter the city");
String city=r.nextLine();
System.out.println("Enter the state:");
String state=r.nextLine();
System.out.println("Enter the coutry:");
String country=r.nextLine();
r.display();

}

}