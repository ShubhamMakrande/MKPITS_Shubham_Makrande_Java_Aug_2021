//1- It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only,
//you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.
class Book
{
 private int id;
 private String title;
 private String author;
 //Method create setter and getter
 public void setId(int id)
 {
   if(id>100)
   {
     this.id=id;

   }
   else
   {
   System.out.println("id is greater then 100");

   }
}
   public int getId()
   {
   return id;
   }
   public void setTitle(String title)
   {
   this.title=title;
   }
   public String getTitle()
     {
     return title;
     }
     public void setAuthor(String author)
     {
     this.author=author;
     }
     public String getAuthor()
     {
      return author;
     }

 }
 class TestE2
 {
   public static void main(String[] arg)
   {
     Book t1=new Book();
     t1.setId(111);
     System.out.println("Book of id:"+t1.getId());
     t1.setTitle("java");
     System.out.println("Book of Title:"+t1.getTitle());
     t1.setAuthor("Programmer");
     System.out.println("Book of author:"+t1.getAuthor());


   }

 }


