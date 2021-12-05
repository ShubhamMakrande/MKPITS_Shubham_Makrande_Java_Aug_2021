//Java LinkedHashMap Example: Key-Value pair
 import java.util.*;
class LinkedHashMap2
{
  public static void main(String[] arg)
  {
    LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
    hm.put(100,"Ajay");
    hm.put(101,"Vjay");
    hm.put(102,"Devgan");
    //Fecting
    System.out.println("Key:"+hm.keySet());
    //Fecting
    System.out.println("Values:"+hm.values());
    //
    System.out.println("Key-Value pair:"+hm.entrySet());



  }







}