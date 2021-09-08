//Java Variable Example: Narrowing (Typecasting)
public class Example3
{
  public static void main(String []arg)
  {
     float f=10.5f;
        //int,a=f;//Compiler time error
     int a=(int)f;
     System.out.println(f);
     System.out.println(a);
     }
}