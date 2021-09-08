//5- wap to accept 3 subject marks and then print total marks
import java.util.*;
class Helloass5
{
public static void main(String []arg)
{
  int s1,s2,s3;
  int total;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter s1 marks:");
  s1=s.nextInt();
   System.out.println("Enter s2 marks:");
  s2=s.nextInt();
   System.out.println("Enter s3 marks:");
  s3=s.nextInt();
  total=s1+s2+s3;
  System.out.println("total marks:"+total);
  }

}