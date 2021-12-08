//Java Method Overloading with Type Promotion

//byte can be promoted to short, int, long, float or double. The short datatype can be promoted to int, long, float or double. The char datatype can be promoted to int,long,float or double and so on.
//Example of Method Overloading with TypePromotion
class Over8
{
  void sum(int a,long b)
  {
    System.out.println(a+b);
  }
  void sum(int a,int b,int c)
  {
  System.out.println(a+b+c);
  }
  public static void main(String[] arg)
  {
  Over8 obj=new Over8();
  obj.sum(20,20);
  obj.sum(20,20,20);

  }

}
