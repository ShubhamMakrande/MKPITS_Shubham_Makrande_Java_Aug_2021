import java.io.*;
class Parent
{
 void msg()
 {
 System.out.println("Parent");
 }

}
class TestExceptionChild extends Parent
{
 void msg()throws IOException
 {
 System.out.println("Child");
 }
}
class abc
{
 public static void main(String[] arg)
 {
   Parent p=new TestExceptionChild();
   p.msg();



 }




}