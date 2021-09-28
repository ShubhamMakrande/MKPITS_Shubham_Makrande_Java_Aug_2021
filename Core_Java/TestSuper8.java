//As we know well that default constructor is provided by compiler automatically if there is no constructor. But, it also adds super() as the first statement.
class Animal
{
  Animal()
  {
  System.out.println("animal is created....");
  }

}
class Dog extends Animal
{
  Dog()
  {
  System.out.println("Dog is created....");
  }
}
class TestSuper8
{
  public static void main(String[] arg)
  {
    Dog d=new Dog();


  }

}