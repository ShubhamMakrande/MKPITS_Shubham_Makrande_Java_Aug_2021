//To create simple awt example, you need a frame. There are two ways to create a frame in AWT.
//1- By extending Frame class (inheritance)
//example to create frame by extending frame class
import java.awt.*;
class Frameex1 extends Frame
{
	Frameex1()
	{
		setSize(400,400);
		setVisible(true);
		}
		public static void main(String[] arg)
		{
			Frameex1 fx=new Frameex1();

			}


}