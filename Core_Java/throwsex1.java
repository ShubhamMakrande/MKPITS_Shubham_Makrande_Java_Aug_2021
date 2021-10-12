//another example of throws
class Calculate
{
   int divide(int n1,int n2)throws Exception
   {
      int res=n1/n2;
      return res;

   }
}
class throwsex1
{
  public static void main(String[] arg)
  {
    Calculate c=new Calculate();
    try
    {
      int r=c.divide(10,2);
      System.out.println("result"    +r);
    }
  catch(Exception ee)
  {

  System.out.println(ee.toString());
  }

  System.out.println("System are code tii the end");

  }







}