//2- create a class Product having field productid,productname,productprice and
//setter and getter method.
class Product
{
 private int id;
 private String name;
 private int price;
 //create getter and setter mehod
 public int getId()
 {
 return id;
 }
 public void setId(int id)
 {
 this.id=id;
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
}
class TestEEProassg
{
  public static void main(String[] arg)
  {
    Product p1=new Product();
    p1.setId(102);
    p1.setName("book");
    p1.setPrice(12);
    System.out.println("Product Id="+p1.getId());
    System.out.println("Product Name="+p1.getName());
    System.out.println("Product Price="+p1.getPrice());




  }

}