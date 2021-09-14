//The following program, IfElseDemo, assigns a grade based on the value of a test score:
//an A for a score of 90% or above, a B for a score of 80% or above, and so on.
import java.util.*;
class Example17ifelse
{
 public static void main(String[] arg)
 {
  int testcase;
  char grade;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter testcase:");
  testcase=s.nextInt();

  if (testcase>=90)
  {
    grade='A';
  }
  else if(testcase>=80)
  {
    grade='B';
  }
  else if(testcase>=60)
  {
   grade='C';
  }
  else
  {
   grade='F';
  }
  System.out.println("grade:"+grade);
  }

 }
