class Animal
{
  void eat()
  {
  System.out.println("eating......");
  }
}
class Dog extends Animal
{
void eat()
{
System.out.println("eating a bread....."   );
}
void bark()
{
System.out.println("barking......");
}
void work()
{
  super.eat();
  bark();

}
}
class TestSuper4
{
public static void main(String[] arg)
{
Dog d=new Dog();
d.work();
}


}