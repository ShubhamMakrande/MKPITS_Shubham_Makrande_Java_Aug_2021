class TestExceptionPropagation3
{
   void m()
   {
     try
     {
     throw new java.io.IOException("Driver error");
     }catch(Exception ee)
     {
     System.out.println(ee);
     }
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
      System.out.println("Exception handled..");
    }
}
   public static void main(String[] arg)
   {
      TestExceptionPropagation3 obj=new TestExceptionPropagation3();
      obj.p();
      System.out.println("Normal flow.....");
   }
}
