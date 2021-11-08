import java.awt.*;
import java.awt.event.*;
class keyAdapter extends Frame
{
 TextField t1;
 keyAdapter()
 {
  Label l1=new Label("Enter Charcter");
   l1.setBounds(10,30,100,30);
   add(l1);

   t1=new TextField(20);
   t1.setBounds(120,30,100,30);
   t1.addKeyListener(new mykeyadapter(this));
   add(t1);

   setSize(300,300);
   setLayout(null);
   setVisible(true);
 }
 public static void main(String[] arg)
 {
 keyAdapter k=new keyAdapter();
 }
}
class mykeyadapter extends KeyAdapter
{
   keyAdapter k1;
   mykeyadapter(keyAdapter k1)
   {
   this.k1=k1;
   }
   public void keyTyped(KeyEvent ke)
   {

   System.out.println("clicked");
   }






}