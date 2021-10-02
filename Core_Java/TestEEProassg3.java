//3- create a class orders having field orderid,orderdate, productname, price and quantity
//and setter and getter methods and calculatebill and display method .

class Product
{
 private int id;
 private int date;
 private String name;
 private int price;
 private int quantity;
 //create getter and setter mehod
 public int getId()
 {
 return id;
 }
 public void setId(int id)
 {
 this.id=id;
 }
 public int getDate()
 {
	 return date;
	 }
	 public void setDate(int date)
	 {
		 this.date=date;
		 }
 public String getName()
 {
 return name;
 }
 public void setName(String name)
 {
 this.name=name;
 }
 public int getPrice()

 {
 return price;
 }
 public void setPrice(int price)
 {
 this.price=price;
 }
 public int getQuantity()
 {
 return quantity;
 }
 public void setQuantity(int quantity)
 {
 this.quantity=quantity;
 }
  public String calculateBill(int p,int q){
         int rate=p*q;
         return "Total Bill ="+rate;
    }
}
class TestEEProassg3
{
  public static void main(String[] arg)
  {
    Product p1=new Product();
     java.util.Scanner scan=new java.util.Scanner(System.in);
    System.out.println("Enter the Order Id:");
    int id=scan.nextInt();
     System.out.println("Enter the Order Date:");
    int date=scan.nextInt();
    System.out.println("Enter the Order Name:");
    String name=scan.next();
    System.out.println("Enter the Order Price:");
    int price=scan.nextInt();
    System.out.println("Enter the Order Quantity:");
    int quantity=scan.nextInt();
    p1.setId(id);
    p1.setDate(date);
    p1.setName(name);
    p1.setPrice(price);
    p1.setQuantity(quantity);
    System.out.println("----------------------------------------------------------");
    System.out.println("Product Id="+p1.getId());
    System.out.println("Product Date="+p1.getDate());
    System.out.println("Product Name="+p1.getName());
    System.out.println("Product Price="+p1.getPrice());
    System.out.println("Product Quantity="+p1.getQuantity());
    System.out.println(p1.calculateBill(p1.getPrice(),p1.getQuantity()));

}
}