//Patice
import java.awt.*;
import java.awt.event.*;
class Adapterex4 extends Frame
{
   Adapterex4()
   {
   addMouseMotionListener(new MyMouseMotionAdapter(this));

   setSize(300,300);
   setLayout(null);
   setVisible(true);
   }
   public static void main(String[] arg)
   {
   Adapterex4 a=new Adapterex4();
   }
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
Adapterex4 a1;
MyMouseMotionAdapter(Adapterex4 a1)
{
this.a1=a1;
}
public void mouseMoved(MouseEvent ae)
{
System.out.println("X:"+ae.getX()+"Y:"+ae.getY());

}






}