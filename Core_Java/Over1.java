//1) Method Overloading: changing no. of arguments

//In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.
class Calculate
{
  void add2(int num1,int num2)
  {
    int  res=num1+num2;
     System.out.println("Addtion of two number:"+res);
  }
void add3(int num1,int num2,int num3)
{
  int res=num1+num2+num3;
  System.out.println("Addition of threee number:"+res);
}

}
class Over1
{
  public static void main(String[] arg)
  {
    Calculate c1=new Calculate();
    c1.add2(2,3);
    c1.add3(2,3,4);


  }


}
