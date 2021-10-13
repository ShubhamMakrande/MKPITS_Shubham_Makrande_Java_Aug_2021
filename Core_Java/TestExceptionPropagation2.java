//Exception can be handled in any method in call stack either in main() method,p() method,n() method or m() method.
//Rule: By default, Checked Exceptions are not forwarded in calling chain (propagated).
//Program which describes that checked exceptions are not propagated
class TestExceptionPropagation2
{
   void m()
   {
   throw new java.io.IOException("Dirve error:");

   }
   void n()
   {
    m();
   }
   void p()
   {
   try
   {
   n();
   }
   catch(Exception ee)
   {
     System.out.println("Exception handle......");
   }
   }
   public static void main(String[] arg)
   {
     TestExceptionPropagation2 obj=new TestExceptionPropagation2();
     obj.p();
     System.out.println("Nromal flow....");

   }
}
