//3 -wap to accept a number from the user and then print the square of a number.
import java.util.*;//java is  package, util is subpackage
class Squarenum
{
    public static void main(String []arg)
    {
       int num;
       Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        num=s.nextInt();
        int square=num*num;
        System.out.println("square="+square);
     
     }
}