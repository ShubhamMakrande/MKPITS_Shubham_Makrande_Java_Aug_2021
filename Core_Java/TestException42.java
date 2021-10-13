class TestException42
{
void m()
{
  int data=50/0;
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
  catch(Exception e)
  {
  System.out.println("Exception handle....");
  }
}
  public static void main(String[] arg)
  {
     TestException42 t=new TestException42();
     t.p();
     System.out.println("Normal Flow.....");

}

}