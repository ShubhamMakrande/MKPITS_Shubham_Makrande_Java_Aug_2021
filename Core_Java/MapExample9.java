import java.util.*;
class MapExample9
{
  public static void main(String[] arg)
  {
    Map<Integer,String> map=new HashMap<Integer,String>();
    map.put(100,"Vjay");
    map.put(101,"Ajay");
    map.put(102,"Devgan");
    //Return a Set view of the mapping contained in this map
    map.entrySet()
    //Return Sequential Strema with thos collection as its sourse
    .stream()
    //sorted according to the provided Comparator
    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
    //Perfomrs an action for each element of this stream
    .forEach(System.out::println);





  }



}