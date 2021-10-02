//create a class user
class User
{
private String username;
private String password;

 public String getUsername()
   {
     return username;
   }
public void setUsername(String username)
{
 this.username=username;
}
public String getPassword()
{
return password;
}
public void setPassword(String password)
{
this.password=password;
}
public String checkLogin(String username,String password)
{
  if(username.equals("admin")&&password.equals("admin"))
  {
    return "login succesfullyfor user" +username;
  }
  else
  {
  return "invalid credentail,try again!";
  }
}
}

class TestEElogin
{
public static void main(String[] arg)
{
User un1=new User();
java.util.Scanner scan=new java.util.Scanner(System.in);

System.out.println("Enter Username:");
String un=scan.next();
System.out.println("Enter password:");
String pwd=scan.next();
un1.setUsername(un);
un1.setPassword(pwd);
String result=un1.checkLogin(un1.getUsername(),un1.getPassword());
System.out.println(result);


}
}