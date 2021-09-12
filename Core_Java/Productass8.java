//3- wap to accept customer name , productname,productprice and quantity
//and then print customername , productname,price, quantity and totalamount
import java.util.*;
class Productass8
{
 public static void main(String []arg)
 {
    String customername;
    String productname;
    int productprice;
    int quantity;
    int totalamount;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter customer name:");
    customername=s.next();
       System.out.println("Enter product name:");
        productname=s.next();
          System.out.println("Enter product price:");
          productprice=s.nextInt();
             System.out.println("Enter quantity:");
             quantity=s.nextInt();
             totalamount=(productprice*quantity);
             //dispaly
             System.out.println("customername:"+customername);
             System.out.println("productname:"+productname);
             System.out.println("productprice:"+productprice);
             System.out.println("quantity:"+quantity);
             System.out.println("totalamount:"+totalamount);
		 }


}