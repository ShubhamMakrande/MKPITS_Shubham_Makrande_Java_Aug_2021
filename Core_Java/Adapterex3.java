//Pratice
import java.awt.*;
import java.awt.event.*;
class Adapterex3 extends Frame
{
  Adapterex3()
  {
	  addMouseListener(new MyMouseAdapter(this));
setSize(400,400);
setLayout(null);
setVisible(true);
}
public static void main(String[] arg)
{
  Adapterex3 a=new Adapterex3();

}
}
class MyMouseAdapter extends MouseAdapter
{
  Adapterex3 a1;
   MyMouseAdapter(Adapterex3 a1)
  {
   this.a1=a1;

  }
  public void mouseClicked(MouseEvent ae)
  {
  System.out.println("Hello India!");
  }




}