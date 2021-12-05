//Java LinkedHashMap Example:remove()
import java.util.*;
class LinkedHashMap4
{
  public static void main(String[] arg)
  {
  Map<Integer,String> map=new LinkedHashMap<Integer,String>();
  map.put(101,"Ajay");
  map.put(102,"Vijay");
  map.put(103,"Amit");
  System.out.println("Befor remove() method:"+map);
  map.remove(102);
  System.out.println("After remove() method:"+map);







  }







}