//Method Overriding in Java

//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
class figure
{
  void draw()
  {
  System.out.println("draw method of figure class ");
  }
  
}
class triangle extends figure
{
 void draw()
 {
 System.out.println("draw method of triangle class");
 }
}
class Overr1
{
  public static void main(String[] arg)
  {
    figure f1=new figure();
    f1.draw();
    triangle t=new triangle();
    t.draw();
  
  }

}