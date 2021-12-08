//Q) Why Method Overloading is not possible by changing the return type of method only?

//In java, method overloading is not possible by changing the return type of the method only because of ambiguity. Let's see how ambiguity may occur:
class Adder
{
  static int add(int n1,int n2)
  {
    return n1+n2;
  }
  static double add(int n1,int n2)
  {
  return n1+n2;
  }
}
class Over5
{
  public static void main(String[] arg)
  {
    System.out.println(Adder.add(11,11));
  }
}