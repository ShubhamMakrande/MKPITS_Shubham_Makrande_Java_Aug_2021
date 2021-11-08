import java.awt.*;
import java.awt.event.*;
class keyex4 extends Frame
{
  Label l1;
  TextField t1;
  keyex4()
  {
    l1=new Label("MKIPTE");
    l1.setBounds(10,50,250,20);
    add(l1);

    t1=new TextField();
    t1.setBounds(20,100,250,20);
    t1.addKeyListener(new KeyAdapterclass(this));
    add(t1);

    setSize(400,400);
    setLayout(null);
    setVisible(true);
  }
  public static void main(String[] arg)
  {
    keyex4 k=new keyex4();
  }
}
class KeyAdapterclass extends KeyAdapter
{
  keyex4 k1;
  KeyAdapterclass(keyex4 k1)
  {
    this.k1=k1;
  }
  public void keyTyped(KeyEvent ke)
  {
    System.out.println("Key type:");
    char c=ke.getKeyChar();
    {
    System.out.println("char type "+ c);
    k1.l1.setText(k1.t1.getText());


    }


  }




}