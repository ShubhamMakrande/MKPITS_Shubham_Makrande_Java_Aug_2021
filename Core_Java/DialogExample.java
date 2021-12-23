//Java AWT Dialog Example
import java.awt.*;
import java.awt.event.*;
public class DialogExample
{
  private static Dialog d;
  DialogExample()
  {
    Frame f=new Frame();
    d=new Dialog(f,"DialogExample",true);
    d.setLayout(new FlowLayout());
    Button b=new Button("ok");
    b.addActionListener(new ActionListener()
    {
     public void actionPerformed(ActionEvent e)
     {
       DialogExample.d.setVisible(false);
     }
    });
  d.add(new Label("Click button to continue."));
  d.add(b);
  d.setSize(300,300);
  d.setVisible(true);


  }
public static void main(String[] arg)
{
  new DialogExample();
}

}
