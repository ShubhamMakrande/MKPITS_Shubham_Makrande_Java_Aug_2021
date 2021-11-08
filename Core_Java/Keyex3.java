import java.awt.*;
import java.awt.event.*;
class Keyex3 extends Frame
{
  Label l1;
  TextField t1;
  Keyex3()
  {
    l1=new Label("Mkipte");
    l1.setBounds(10,50,250,20);
    add(l1);

    t1=new TextField();
    t1.setBounds(10,120,250,20);
    t1.addKeyListener(new KeyAdapterclass(this));
    add(t1);

    setSize(400,400);
    setLayout(null);
    setVisible(true);
  }
  public static void main(String[] arg)
{
Keyex3 k=new Keyex3();
}
}
class KeyAdapterclass extends KeyAdapter
 {
 Keyex3 k1;
 KeyAdapterclass(Keyex3 k1)
 {
 this.k1=k1;
 }
 public void keyTyped(KeyEvent ke)
 {
 System.out.println("Key type");
 char c=ke.getKeyChar();
 {
  System.out.println(c);
  k1.l1.setText(k1.t1.getText());

 }

 }






}