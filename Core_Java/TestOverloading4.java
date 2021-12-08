//Can we overload java main() method?
//Yes, by method overloading. You can have any number of main methods in a class by method overloading.
//But JVM calls main() method which receives string array as arguments only. Let's see the simple example:
class TestOverloading4
{
  public static void main(String[] arg)
  {
  System.out.println("main with String[]");
  }
  public static void main(String arg)
  {
  System.out.println("main with String");
  }
  public static void main()
  {
  System.out.println("main without args");
  }




}