import java.awt.*;
import java.awt.event.*;
class Adapterex2 extends Frame
{
   Adapterex2()
   {
   addMouseMotionListener(new MyMouseMotionAdapter(this));
    setSize(400,400);
    setLayout(null);
    setVisible(true);
   }
   public static void main(String[] arg)
   {
     Adapterex2 a=new Adapterex2();
   }
}
class MyMouseMotionAdapter extends MouseMotionAdapter
{
   Adapterex2 a1;
   MyMouseMotionAdapter(Adapterex2 a1)
   {
   this.a1=a1;
   }
   public void mouseMoved(MouseEvent ae )
   {
    System.out.println("X:"+ae.getX()+   "Y:"+ae.getY());

   }




}