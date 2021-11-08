import java.awt.*;
import java.awt.event.*;
class Adapterex1 extends Frame
{
  Adapterex1()
  {
     addMouseListener(new MyMouseAdapter(this));

     setSize(400,400);
     setLayout(null);
     setVisible(true);
  }
  public static void main(String[] arg)
  {
  Adapterex1 a=new Adapterex1();
  }
}
//creating a mouse class
class MyMouseAdapter extends MouseAdapter
{
	Adapterex1 a1;
	 MyMouseAdapter(Adapterex1 a1)
	{
		this.a1=a1;
		}
		public void mouseClicked(MouseEvent ae)
		{
			System.out.print("hello");
			}



	}