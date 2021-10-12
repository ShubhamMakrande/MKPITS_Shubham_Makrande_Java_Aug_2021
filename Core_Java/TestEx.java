//ExceptionHandling with MethodOverriding in Java
class account
{
 void deposit(int amt)
 {
 System.out.println("deposit method of account class");
 }
}
class saving extends account
{
 void deposit(int amt)throws IOException
 {
 System.out.println("deposit mehtod of saving");
 }
}
class TestEx
{
public static void main(String[] arg)


}