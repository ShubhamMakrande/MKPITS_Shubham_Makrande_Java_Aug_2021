//Simple Example of Encapsulation in Java
//Let's see the simple example of encapsulation that has only one field with its setter and getter methods.

 class Student
{
  private String name;
  //create getter Method
  public String getName()
  {
    return name;
  }
  //create setter Method
  public void setName(String name)
  {
  this.name=name;
  }

}
class TestE3
{
	public static void main(String[] arg)
	{
		Student t1=new Student();
		t1.setName("vijay");
		System.out.println("Name of the student:"+t1.getName());





		}




	}