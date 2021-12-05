import java.util.*;
class Mappix2
{
  public static void main(String[] arg)
  {
    Map<Integer,String> album=new HashMap<Integer,String>();
    album.put(1995,"silsile");
    album.put(2000,"shershan");
    album.put(2005,"Batman");
    //display
    for(Map.Entry m:album.entrySet())
    {
    System.out.println(m.getKey()+":"+m.getValue());
    }





  }






}