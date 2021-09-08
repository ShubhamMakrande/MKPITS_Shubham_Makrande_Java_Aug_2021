//2- wap to accept 2 no. and then print addition of 2 no.
import java.util.*;
class Helloasstwo
{
  public static void main(String []arg)
  {
    int num1,num2,result;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number1:");
    num1=s.nextInt();
    System.out.println("Enter a number2:");
    num2=s.nextInt();
    result=num1+num2;
    System.out.println("Addition of 2 no:"+result);
    }

}