//create a hasmap collection to store year and album name
 import java.util.*;
class Mapex
{
  public static void main(String[] arg)
  {
  Map<Integer,String> album=new HashMap<Integer,String>();
  album.put(2015,"aaina");
  album.put(2000,"Rahat");
  album.put(2002,"silsila");
  //display
  for(Map.Entry m: album.entrySet())
  {
  System.out.println(m.getKey()+":"+m.getValue());
  }







  }







}