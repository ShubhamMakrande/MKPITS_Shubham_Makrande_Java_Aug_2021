//read only class
//A java class which has only getter method
class StudentE5
{
//private data member
private String college="rkam";
//getter method for college
public String college()
{
return college;
}


}
//Now ,you can't change the value of the college data member which is "rkam"
//s.setCollege("rkam");//will compile time error