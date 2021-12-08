//2) Method Overloading: changing data type of arguments
//In this example, we have created two methods that differs in data type.
//The first add method receives two integer arguments and second add method receives two double arguments.
class Adder
{
  static int add(int n1,int n2)
  {
   return n1+n2;
  }
  static double add(double n1,double n2)
  {
  return n1+n2;
  }
}
class Over3
{
  public static void main(String[] arg)
  {
    System.out.println(Adder.add(2,3));
    System.out.println(Adder.add(12.3,13.2));

  }




}