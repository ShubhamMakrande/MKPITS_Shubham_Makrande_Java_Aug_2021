import java.util.*;
class MapExample6
{
public static void main(String[] arg)
{
   Map<Integer,String> album=new HashMap<Integer,String>();
   album.put(1955,"sisila");
   album.put(2000,"aina");
   album.put(2005,"sheshan");
   //Return a Set view of the mappings contained int this map
   album.entrySet()
   //return a sequential Stream with this coolection as its source
   .stream()
   //sortes according to the provided comprarated
   .sorted(Map.Entry.comparingByValue())
   //Performs an acton for each element of this stream
   .forEach(System.out::println);






}

}