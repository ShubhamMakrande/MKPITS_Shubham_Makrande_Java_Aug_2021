
//Example of Java Serialization
//In this example, we are going to serialize the object of Student class from above code.
//The writeObject() method of ObjectOutputStream class provides the functionality to serialize the object.
//We are saving the state of the object in the file named f.txt.
import java.io.*;
public class Persist1
{
	public static void main(String[] args)
	{
		try
		{
			Student32 s1=new Student32(22,"venky");
			FileOutputStream fout=new FileOutputStream("f.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("sucsess");
			}
			catch(Exception ee)
			{
				System.out.println(ee.toString());
			}
		}


	}
