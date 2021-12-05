//create a hashmap collection of product (key-product and value price)10 product
//assgin
import java.util.*;
class Promap
{
  public static void main(String[] arg)
  {
    Map<String,Integer> pro =new HashMap<String,Integer>();
    pro.put("headphone",800);
    pro.put("earphone",900);
    pro.put("watch",1300);
    pro.put("saree",400);
    pro.put("shoes",500);
    pro.put("speaker",3000);
    pro.put("book",200);
    pro.put("mobile",17000);
    pro.put("router",1200);
    //display
    for(Map.Entry m:pro.entrySet())
    {
    System.out.println(m.getKey()+":"+m.getValue());

    }




  }





}