
import java.awt.*;
import java.awt.event.*;
public class DialogExample1
{
  private static Dialog d;
  DialogExample1()
  {
  Frame f=new Frame();
    d=new Dialog(f,"DialogExample1",true);
    d.setLayout(new FlowLayout());
    Button b1=new Button("OK");
    b1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {

      DialogExample1.d.setVisible(false);
      }
    });
    d.add(new Label("Continue to click button"));
    d.add(b1);
    d.setSize(300,300);
    d.setVisible(true);


  }
public static void main(String[] arg)
{
 new DialogExample1();
}

}