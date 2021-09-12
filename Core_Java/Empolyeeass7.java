//2- wap to accept empno , empname and salary and then print hra ,da, and total salary
import java.util.*;
class Empolyeeass7
{
 public static void main(String []arg)
 {
   int empno;
   String empname;
   int salary;
   float totalsalary;
   float Hra,Da;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter empno:");
   empno=s.nextInt();
   System.out.println("Enter empname:");
   empname=s.next();
    System.out.println("Enter salary:");
    salary=s.nextInt();
    Hra=(10.0f/100.0f)*salary;
    System.out.println(" Hra:"+Hra);
    Da=(70.0f/100.0f)*salary;
    System.out.println(" Da:"+Da);
     totalsalary=salary+Hra+Da;
      System.out.println(" tatolsalary:"+totalsalary);
    }


}