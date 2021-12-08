class Calculate
{
  static int add(int n1,int n2)
  {
    return n1+n2;
  }
  static float add(float n1,float n2)
  {
  return n1+n2;
  }
  static double add(double n1,double n2)
  {
   return n1+n2;
  }
}
class Over4
{
  public static void main(String[] arg)
  {
     Calculate c=new Calculate();
      int res=c.add(2,3);
      System.out.println("additon of 2 intger:"+res);
      float res1=c.add(2.2f,3.3f);
      System.out.println("addition of 2 float:"+res1);
      double res2=c.add(22.222,32.2);
      System.out.println("addition of 2 double "+res2);


  }

}