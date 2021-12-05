import java.util.*;
class LinkedHashMap1
{
   public static void main(String[] arg)
   {
    LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
    hm.put(100,"Vijay");
    hm.put(101,"Ajay");
    hm.put(102,"Devgan");
    //display
    for(Map.Entry m:hm.entrySet())
    {
    System.out.println(m.getKey()+":"+m.getValue());
    }





   }







}