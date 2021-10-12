//Example in case subclass overridden method declares no exception
class Parent
{
  void msg()throws Exception
  {
  System.out.println("Parent");
  }
}
class TestExceptionchild5 extends Parent
{
  void msg()
  {
  System.out.println("child");
  }
  public static void main(String[] arg)
  {
    Parent p=new TestExceptionchild5();
    try
    {
      p.msg();
     }
     catch(Exception ee)
     {
	 }
  }
}
