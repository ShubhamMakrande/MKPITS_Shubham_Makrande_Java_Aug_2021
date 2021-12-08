class Over6
{
  public static void main(String[] arg)
  {
  System.out.println("main with String[]");
  main("abc");
  }
  public static void main(String arg)
  {
  System.out.println("main with String");
  main();
  }
  public static void main()
  {
  System.out.println("main without arg");
  }



}