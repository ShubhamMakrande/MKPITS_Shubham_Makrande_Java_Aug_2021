
//Example in case subclass overridden method declares subclass exception
import java.io.*;
class Parent
{
     void msg()throws Exception
      {
       System.out.println("parent");
      }
}
class TestExceptionchild4 extends Parent
  {
     void msg()throws ArithmeticException
       {
         System.out.println("child");
       }
   public static void main(String[] arg)
       {
          Parent p=new TestExceptionchild4();
           try
            {
                 p.msg();

            }
   catch(Exception ee)
      {

        }


  }
}