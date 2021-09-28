class Animal
{
String color="white";
}
class Dog extends Animal
{
  String color="Black";


void display()
{
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper
{
  public static void main(String[] arg)
  {
     Dog d=new Dog();
     d.display();




  }


}