import java.io.*;
class Parent12
{
  void msg()throws ArithmeticException
  {
  System.out.println("Parent");
  }
}
class TestExceptionchild extends Parent
{
  void msg()throws Exception
  {
  System.out.println("Child");
  }
   public static void main(String[] arg)
     Parent c=new TestExceptionchild();
     try
     {
       c.msg();

   }
}



   catch(Exception ee)
   {
   }

}