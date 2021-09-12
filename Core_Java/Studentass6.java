//1- wap to accept to accept 3 subject marks and then print total , percentage
import java.util.*;
class Studentass6
{
  public static void main(String []arg)
  {
     int s1,s2,s3;
     int total;
     float per;
     Scanner s = new Scanner(System.in);
     System.out.println("Enter S1 marks:");
     s1=s.nextInt();
     System.out.println("Enter S2 marks:");
     s2=s.nextInt();
     System.out.println("Enter S3 marks:");
     s3=s.nextInt();
     total=s1+s2+s3;
     System.out.println("total:"+total);
     per=(float)total/300.0f*100.0f;
     System.out.println("per:"+per);
     }

  }

