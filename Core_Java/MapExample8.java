import java.util.*;
class MapExample8
{
  public static void main(String[] arg)
 {
  Map<Integer,String> map=new HashMap<Integer,String>();
  map.put(100,"vijay");
  map.put(101,"mahesh");
  map.put(102,"vishal");
  //Retrun a set view of the mapping contained in this map
  map.entrySet()  .stream()  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))  .forEach(System.out::println);


  //Return a sequential Stream with this collectio its source

  //sorted according to the provided comparator



  //Performs an action for each elemnnt of this strema
 }

}