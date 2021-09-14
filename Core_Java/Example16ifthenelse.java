//You could use an if-then-else statement in the applyBrakes method to
//take some action if the brakes are applied when the bicycle is not in
//motion. In this case, the action is to simply print an error message
//stating that the bicycle has already stopped.
import java.util.*;
   class Example16ifthenelse
   {
     int speed;
     boolean isMoving;
     public static void main(String []arg)
     {
        Bicycle b1=new Bicycle(b1);
          b1.isMoving=true;
          b1.speed=100;
          System.out.println("now bicycle is moving and speed is"+b1.speed);
          b1.ApplyBreak(b1);
          System.out.println("now bicycle is moving and after applying break speed is"+b1.speed);

          b1.isMoving=false;
          b1.ApplyBreak(b1);
          System.out.println("now bicycle is stopped an speed is",+b1.speed);
          }

   void ApplyBreak(Bicycle b1)
   {
    if(isMoving==true)
    {
      b1.speed=70;

    }
    else
    {
      b1.speed=0;
    }

}
}


