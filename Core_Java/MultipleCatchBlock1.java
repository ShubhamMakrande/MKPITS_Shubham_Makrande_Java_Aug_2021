public class MultipleCatchBlock1
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
   n();
  }
  public static void main(String[] arg)
  {
    MultipleCatchBlock1 m=new MultipleCatchBlock1();
    try
    {
    m.p();
    
    }
    catch(Exception ee)
    {
    System.out.println("Exception handle.....");
    System.out.println("normal flow");
    }
  
  
  }

}