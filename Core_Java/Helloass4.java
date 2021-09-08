//4- wap to accept to length , breadth, height and then print volume
import java.util.*;
class Helloass4
{
  public static void main(String []arg)
  {
    int length,breadth,height;
    int volume;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter length:");
    length=s.nextInt();
    System.out.println("Enter breadth:");
    breadth=s.nextInt();
    System.out.println("Enter height:");
    height=s.nextInt();
    volume=length*breadth*height;
    System.out.println("volume:"+volume);
    }

}