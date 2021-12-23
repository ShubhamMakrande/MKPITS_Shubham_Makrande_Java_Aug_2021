class Bike1{
	private int speed;
    //creating a default constructor
    Bike1(){
		System.out.println("Bike is created");
		speed=100;
		}

 private void display()
 {
	  System.out.println("speed of bike is " + speed);
  }

    }
////////////////////////////////////////////////////////
class testbike4 {
	public static void main(String args[]){
	    //calling a default constructor
	    Bike1 b=new Bike1();
	  //  b.speed=20; // error since speed is declared private
	  b.display(); //error since display is also declared private
    }

}
