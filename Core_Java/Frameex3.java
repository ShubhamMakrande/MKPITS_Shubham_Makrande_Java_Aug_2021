//example to create a button inside frame
import java.awt.*;
class Frameex3 extends Frame
{
	Frameex3()
	{
		Button b1=new Button("Shubham");
		b1.setBounds(150,100,100,50);
		setTitle("mkpit Solution");
		setLayout(null);
		add(b1);
		setSize(400,400);
		setVisible(true);
		}
		public static void main(String[] arg)
		{
			Frameex3 fr=new Frameex3();

			}






	}