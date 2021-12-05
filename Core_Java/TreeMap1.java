//Java TreeMap Example
import java.util.*;
class TreeMap1
{
  public static void main(String[] arg)
  {
    TreeMap<Integer,String> map=new TreeMap<Integer,String>();
    map.put(100,"Vijay");
    map.put(101,"Ajay");
    map.put(102,"Amit");
    //display
    for(Map.Entry m:map.entrySet())
    {
    System.out.println(m.getKey()+":"+m.getValue());
    }






  }







}