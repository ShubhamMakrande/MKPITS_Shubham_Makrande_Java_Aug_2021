//create a class User having fields username and pasword and setter and getter methods and checklogin and signup methods .

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

 public String checkLogin(String un,String pwd)
 {
   if(username.equals(un)&&password.equals(pwd))
   {
     return "login succesfully for the user"+username;

   }
   else
   {
    return "invalid credaintial,try again";
   }
}
   public String signup(String username,String password)
   {
      setUsername(username);
      setPassword(password);
      return "user saved succesfully.";
         }
       public  void display()
         {
			 }

 }

class TestEElogin2
{
   public static void main(String[] arg)
   {
   User u1=new User();
   java.util.Scanner scan=new java.util.Scanner(System.in);
   System.out.println("1.process to create your account (signup");
   System.out.println("Enter username:");
   String un=scan.next();
   System.out.println("Enter password");
   String pwd=scan.next();
   String result=u1.signup(un,pwd);
   System.out.println(result);
   System.out.println("-----------------------------------------------");
   System.out.println("1.process to account signup(login");
   System.out.println("Enter username:");
    un=scan.next();
   System.out.println("Enter password");
    pwd=scan.next();
   result=u1.checkLogin(un,pwd);
   System.out.println(result);





}
}