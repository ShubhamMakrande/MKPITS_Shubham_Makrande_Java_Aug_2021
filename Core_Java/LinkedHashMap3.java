//Pratice
import java.util.*;
class  LinkedHashMap3
{
  public static void main(String[] arg)
  {
    LinkedHashMap<Integer,String> pro=new LinkedHashMap<Integer,String>();
    pro.put(200,"headphone");
    pro.put(400,"speaker");
    pro.put(600,"Book");
    //Fetching
    System.out.println("Key:"+pro.keySet());
    //Fetching
    System.out.println("Values:"+pro.values());
    //
    System.out.println("Key-Values pair:"+pro.entrySet());







  }






}