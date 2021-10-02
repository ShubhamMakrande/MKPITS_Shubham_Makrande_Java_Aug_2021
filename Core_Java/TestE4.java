//Read-Only class
//create a readonly class Book  having getter methods
class Book
{
  private int id=111;
  private String title="java";
 //method
 public int getId()
 {
  return id;
 }
/* public void setId(int id)
 {
 this.id=id;
 }*/
 public String getTitle()
 {
 return title;
 }
 /*public void setTitle()
 {
   this.title=title;

 }*/
}
////////////////////////////////////////////////////
class TestE4
{
  public static void main(String[] arg)
   {
   Book t1=new Book();
  // t1.setId(-11);
   System.out.println("book of the id="+t1.getId());
  // t1.setTitle("java");
   System.out.println("book of the title= "+t1.getTitle());
  }

}