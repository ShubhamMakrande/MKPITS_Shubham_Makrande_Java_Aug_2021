//Let's see the example of java throws clause which describes that checked exceptions can be propagated by throws keyword.
import java.io.IOException;
class Testthrows1
{
	void m()throws IOException
	{
		throw new IOException("Driver error:");//checked Exception

		}
		void n()throws IOException
		{
			m();
			}
			void p()
			{
				try
				{
					n();
					}
					catch(Exception ee)
					{
						System.out.println(ee.toString());
						}


				}
               public static void main(String[] arg)
						{
							Testthrows1 obj=new Testthrows1();
							obj.p();
							System.out.println("normal flow........");

							}



	}