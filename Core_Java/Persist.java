import java.io.*;
public class Persist
{
	public static void main(String[] arg)
	{
		try
		{
			Customer32 c1=new Customer32("venky","vgmail.com");
			FileOutputStream fos=new FileOutputStream("d://javaprogram//serializable//cust.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(c1);//serailization
			oos.flush();
			fos.close();
			System.out.println("sucsses");
			}
			catch(Exception ee)
			{
				System.out.println(ee.toString());

			}
			}
}