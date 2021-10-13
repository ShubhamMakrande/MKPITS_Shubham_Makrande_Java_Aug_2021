//Java Exception propagation
//Rule: By default Unchecked Exceptions are forwarded in calling chain (propagated).
import java.io.*;
class Cal1
{
	int divide(int n1,int n2)
	{
		int res=n1/n2;
		return res;
		}
	}
class Cal2 extends Cal1
{
	int caldivide(int n1,int n2)
	{
		int res=0;
		try
		{
			res=divide(n1,n2);
			return res;
			}
			catch(Exception ee)
			{
				System.out.println(ee.toString());
				}
				return res;
		}
	}
	 public class bcd
	{
		public static void main(String[] arg)
		{
			Cal2 c=new Cal2();
			int r=c.divide(2,0);
			System.out.println(r);
			System.out.println("reached till the end");




			}



		}