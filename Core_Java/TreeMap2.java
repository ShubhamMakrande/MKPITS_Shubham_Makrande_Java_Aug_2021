import java.util.*;
class TreeMap2
{
  public static void main(String[] arg)
  {
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();
   map.put(100,"Vijay");
   map.put(101,"Amit");
   map.put(102,"Mohit");
   map.put(103,"Sumit");
   System.out.println("Befor remove() method");
   for(Map.Entry m:map.entrySet())
   {
   System.out.println(m.getKey()+""+m.getValue());
   }
   map.remove(102);
   System.out.println("After remove() method");
   for(Map.Entry m:map.entrySet())
   {
   System.out.println(m.getKey()+""+m.getValue());

   }








  }










}