//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class
class Bike3
{
 private int speed=20;
 //creating a default constructor
 Bike3()
 {
 System.out.println("Bike is created");
}
void display()
{
  System.out.println("speed of bike is"+speed);
}

}
class testbike3
{
	public static void main(String[] arg)
	{
		//calling a default constructor
		Bike3 b1=new Bike3();
		//b.speed=20,//error since speed is declared private
		b1.display();


		}


	}