//n this example, we have created the reference of Operation class in the Circle class.
class Operation
{
	int square(int n)
	{
		return n*n;
		}


		}
class Circle
{
	 Operation op;
	double pi=3.14;

	 double area(int radius)
	 {
		 op=new Operation();
		 int rsquare=op.square(radius);
		 return pi*rsquare;
		 }
		 public static void main(String[] arg)
		 {
		 Circle c1=new Circle();
		 double result=c1.area(5);
		 System.out.println(result);
	}


}