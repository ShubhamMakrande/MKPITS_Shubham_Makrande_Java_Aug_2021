//a java which has  only setter method
public class StudentEE
{//private data member 
  private String college="kram";
  //getter method for college
  public void setCollege(String college)
  {
  this.college=college;
  }
}
//Now, you can't get the value of the college, you can only change the value of college data member.
System.out.println(s.getCollege);//Compile Time Error,because there is no such method 
//Compile Time Error,because the college ata member is private 
System.out.println(s.college);
//so,it can't be accessed form outside the class