//Java throws keyword
//Syntax of java throws

//    return_type method_name() throws exception_class_name{
    //method code
   // }
class Saving
{
	String deposit(int amt)throws Exception
	{
		return "Deposit your amount 200.";
		}
	}
	class throwsex
	{
		public static void main(String[] arg)
		{
			Saving s=new Saving();
			try
			{
				String str=s.deposit(200);
				System.out.println(str);

				}
				catch(Exception ee)
				{
					System.out.println(ee.toString());
					}
			}



		}