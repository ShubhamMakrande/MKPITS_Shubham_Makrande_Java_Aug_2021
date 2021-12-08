//In this example, we are creating static methods so that we don't need to create instance for calling methods.\
class Adder
{
	static int add(int a,int b)// static method is use
	{
		return a+b;

		}
		static int add(int a,int b,int c)//staic methdo
		{
			return a+b+c;
			}
	}
class Over2
{
	public static void main(String[] arg)

{
	System.out.println(Adder.add(2,3));
	System.out.println(Adder.add(2,4,5));



	}



	}