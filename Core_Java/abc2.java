import java.io.*;
class Parent
{
void msg()
{
System.out.println("Parent");

}
}
class TestExceptionchild extends Parent
{
void msg()throws ArithmeticException
{
System.out.println("TestExceptionchild");

}
}
class abc2
{
 public static void main(String[] arg)
 {
   Parent p=new TestExceptionchild();
   p.msg();


 }



}
