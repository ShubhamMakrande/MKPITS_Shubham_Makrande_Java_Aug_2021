
//3) super is used to invoke parent class constructor.

//The super keyword can also be used to invoke the parent class constructor. Let's see a simple example:


class Animal
{
  Animal()
  {

  System.out.println("animal is created");
  }

}
class Dog extends Animal
{

  Dog()
  {
  super();
  System.out.println("Dog is created");

}
}
class TestSuper6
{
  public static void main(String[] arg)
  {
     Dog d=new Dog();


  }


}