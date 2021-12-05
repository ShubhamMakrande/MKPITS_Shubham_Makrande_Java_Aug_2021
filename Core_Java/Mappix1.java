//Practice
import java.util.*;
class Mappix1
{
  public static void main(String[] arg)
  {
   Map<Integer,String> album=new HashMap<Integer,String>();
   album.put(1995,"silsile");
   album.put(2000,"aina");
   album.put(2005,"shaas");
   //display
   for(Map.Entry m: album.entrySet())
   {
   System.out.println(m.getKey()+":"+m.getValue());
   }



  }





}
