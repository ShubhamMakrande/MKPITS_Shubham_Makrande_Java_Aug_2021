//create a class Book having private fields title and author and
//`--methods(setter and getter methods) setTitle(),setAuthor and getTitle() and getAuthor();
class Book
{
	private String title;
	private String author;
	//create the Method of setter and getter
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
class TestE
	{
		public static void main(String[] arg)
		  {
			Book t1=new Book();
			t1.setTitle("java");
			System.out.println("Title of the Book:"+t1.getTitle());
			t1.setAuthor("programer");
			System.out.println("Author of the Book:"+t1.getAuthor());

		   }

}