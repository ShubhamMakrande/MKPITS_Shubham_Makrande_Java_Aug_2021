//Wtite-only class
class Book
{
  private int id;
  private String title;

  public void setId(int id)
  {
  this.id=id;
  }

public void setTitle(String title)
{
   this.title=title;
}
void dipalydata()
{
System.out.println("id of the book:"+id);
System.out.println("title of the book:"+title);

}
}
class TestE5
{
  public static void main(String[] arg)
  {
   Book b1=new Book();
   b1.setId(11);
   //System.out.println("id="+b1.getId());
   b1.setTitle("java");
  // System.out.println("Name="+b1.getTitle());


  }



}
