//wap to accept 3 subject marks and calculate total , per and grade
import java.util.*;
class Example18student
{
  public static void main(String[] arg)
  {
     int s1,s2,s3;
     int total;
     float per;
     char grade;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter marks1:");
     s1=s.nextInt();
         System.out.println("Enter marks2:");
          s2=s.nextInt();
             System.out.println("Enter marks3:");
              s3=s.nextInt();
              total=s1+s2+s3;
              per=(float)total/300.0f*100.0f;


         if(per>=90)
              {
                grade='A';
              }
              else if(per>=80)
              {
              grade='B';

              }
              else if(per>=60)
              {
                 grade='C';
               }
               else
               {
                grade='F';
               }
                System.out.println("total:"+total);
               System.out.println("per:"+per);
               System.out.println("grade:"+grade);

               }










}
