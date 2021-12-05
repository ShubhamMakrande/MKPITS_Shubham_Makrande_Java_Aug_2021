//Practice
//Java Map Example: comparingByValue()

import java.util.*;
class MapExample7
{
  public static void main(String[] arg)
  {
    Map<String,Integer> pro=new HashMap<String,Integer>();
    pro.put("headphones",800);
    pro.put("book",200);
    pro.put("speaker",1300);
    //Return a Set view of the mapping contained in this map
    pro.entrySet()
    //return a sequential Stream with this collection as its source
    .stream()
    //sortes according to the provided comparator
    .sorted(Map.Entry.comparingByValue())
    //Performs an action for each element of this stream
    .forEach(System.out::println);





  }





}