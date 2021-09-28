//In the above example, Animal and Dog both classes have a common property color. If we print color property,
//it will print the color of current class by default.
//To access the parent property, we need to use super keyword.
class Animal
{
String color="white";

}
class Dog extends Animal
{
String color="white";

void colorprint()

{
System.out.println(super.color);
}
}
class BabyDog extends Dog
{
  String color="borwn";

 void colorprint1()
  {
    System.out.println(color);
    System.out.println(super.color);
    colorprint();


  }
}

class TestSuper1
{
  public static void main(String[] arg)
  {
    BabyDog B=new BabyDog();
    B.colorprint1();


  }


}