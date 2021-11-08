import java.awt.*;
import java.awt.event.*;
class Keyex2 extends Frame
{
  Label l1;
  TextField t1;
  Keyex2()
  {
    l1=new Label("Mipits");
    l1.setBounds(20,50,250,20);
    add(l1);

    t1=new TextField();
    t1.setBounds(10,150,250,30);
    t1.addKeyListener(new KeyAdapterclass(this));
    add(t1);

    setSize(400,400);
    setLayout(null);
    setVisible(true);
  }
  public static void main(String[] arg)
  {
  Keyex2 k=new Keyex2();
  }
}
class KeyAdapterclass extends KeyAdapter
{
   Keyex2 k1;
   KeyAdapterclass(Keyex2 k1)
   {
    this.k1=k1;
   }
   public void keyTyped(KeyEvent ke)
   {
     System.out.println("Key type");
     char c=ke.getKeyChar();
     {
     System.out.println("char type"+c);
     }



   }





}