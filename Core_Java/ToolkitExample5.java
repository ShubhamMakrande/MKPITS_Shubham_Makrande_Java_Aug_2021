import java.awt.*;
import java.awt.event.*;
public class ToolkitExample5
{
  public static void main(String[] args)
  {
    Frame f=new Frame("ToolkitExamople4");
    Button b=new Button("beep");
    b.setBounds(50,100,80,30);
    f.add(b);
    f.setSize(300,300);
     f.setLayout(null);
    f.setVisible(true);

    b.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        Toolkit.getDefaultToolkit().beep();

      }



    });




  }






}